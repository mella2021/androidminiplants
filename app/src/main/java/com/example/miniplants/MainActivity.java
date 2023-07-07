package com.example.miniplants;

//import android.content.Intent;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
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

public class MainActivity extends AppCompatActivity{
    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private ImageButton imageButton3;

//    private Button searchButton;

//        implements NavigationView.OnNavigationItemSelectedListener
//    private DrawerLayout drawerLayout;
//    private ActionBarDrawerToggle drawerToggle;
//    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();



            // Find views by their IDs
            imageButton1 = findViewById(R.id.imageButton1);
            imageButton2 = findViewById(R.id.imageButton2);


            // Set click listeners for ImageButtons
            imageButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Handle button 1 click
                    // Replace with your desired action or navigate to another activity
                    Toast.makeText(MainActivity.this, "Maize Plant clicked", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), Productdesc_one.class);
                    startActivity(intent);
                }
            });

            imageButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Handle button 2 click
                    // Replace with your desired action or navigate to another activity
                    Toast.makeText(MainActivity.this, "Mango Plant clicked", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), Productdesc_two.class);
                    startActivity(intent);
                }
            });




//            // Set click listener for search button
//            searchButton.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    // Handle search button click
//                    // Replace with your desired action or navigate to another activity
//                    Toast.makeText(MainActivity.this, "Search button clicked", Toast.LENGTH_SHORT).show();
//                }
//            });
        }
    }



































































//        drawerLayout = findViewById(R.id.drawer_layout);
//        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open_drawer, R.string.close_drawer);
//        drawerLayout.addDrawerListener(drawerToggle);
//        drawerToggle.syncState();
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        navigationView = findViewById(R.id.nav_view);
//        navigationView.setNavigationItemSelectedListener(this);
//    }
//
//
//        @Override
//        public void onBackPressed () {
//            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
//                drawerLayout.closeDrawer(GravityCompat.START);
//
//            } else {
//                super.onBackPressed();
//
//            }
//        }
//        @Override
//        protected void onPostCreate (@Nullable Bundle savedInstanceState){
//            super.onPostCreate(savedInstanceState);
//            drawerToggle.syncState();
//        }
//
//        @Override
//        public boolean onNavigationItemSelected (@NonNull MenuItem item){
//            switch (item.getItemId()) {
//                case R.id.nav_signup:
//                    Intent intent = new Intent(MainActivity.this, SignupActivity.class);
//                    startActivity(intent);
//
//
//                    break;
//                case R.id.nav_login:
//                    Intent intet = new Intent(MainActivity.this, LoginActivity.class);
//                    startActivity(intet);
//
//                    break;
//            }
//            drawerLayout.closeDrawer(GravityCompat.START);
//            return true;
//        }
//
// }










