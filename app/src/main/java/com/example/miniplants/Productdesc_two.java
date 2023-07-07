package com.example.miniplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Productdesc_two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productdesc_two);
    }

    public void onClick(View v) {
        Intent intent = new Intent(Productdesc_two.this, PaymentActivity.class);
        startActivity(intent);
    }
}