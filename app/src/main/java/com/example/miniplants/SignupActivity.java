package com.example.miniplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.example.miniplants.databinding.ActivitySignupBinding;

public class SignupActivity extends AppCompatActivity {
    ActivitySignupBinding binding;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        databaseHelper = new DatabaseHelper(this);

        binding.signupButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = binding.signupEmail.getText().toString();
                String password = binding.signPassword.getText().toString();
                String confirmPassword = binding.confirmPassword.getText().toString();

                if (email.equals("") || password.equals("") || confirmPassword.equals(""))
                    Toast.makeText(SignupActivity.this, "All fields are mandatory", Toast.LENGTH_SHORT).show();
                else {
                    if (password.equals(confirmPassword)) {
                        Boolean checkUserEmail = databaseHelper.checkEmail((email));

                        if (checkUserEmail == false) {
                            Boolean insert = databaseHelper.insertData(email, password);

                            if (insert == true) {
                                Toast.makeText(SignupActivity.this, "Signup succesfully", Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                                startActivity(intent);

                            } else {
                                Toast.makeText(SignupActivity.this, "Signup failed", Toast.LENGTH_LONG).show();

                            }
                        }
                    }
                }
            }
        });

        getSupportActionBar().hide();

       binding.loginRedirectText.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
               startActivity(intent);

           }


        });
    }
}



