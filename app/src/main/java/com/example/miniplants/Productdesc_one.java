package com.example.miniplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Productdesc_one extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productdesc_one);

    }

    public void onClick (View v){
        Intent intent = new Intent(Productdesc_one.this, PaymentActivity.class);
        startActivity(intent);




    }
}
