package com.example.miniplants;

//import android.content.Intent;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
//import android.os.Handler;
//import android.view.MenuItem;
//
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
//
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawer_layout);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


        @Override
        public void onBackPressed () {
            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.closeDrawer(GravityCompat.START);

            } else {
                super.onBackPressed();

            }
        }
        @Override
        protected void onPostCreate (@Nullable Bundle savedInstanceState){
            super.onPostCreate(savedInstanceState);
            drawerToggle.syncState();
        }

        @Override
        public boolean onNavigationItemSelected (@NonNull MenuItem item){
            switch (item.getItemId()) {
                case R.id.nav_signup:
                    Intent intent = new Intent(MainActivity.this, SignupActivity.class);
                    startActivity(intent);


                    break;
                case R.id.nav_login:
                    Intent intet = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intet);

                    break;
            }
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        }

 }






//            }








