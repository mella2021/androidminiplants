package com.example.miniplants;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

//public class PaymentActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_payment);




        public class PaymentActivity extends AppCompatActivity {

            private RadioGroup paymentMethodRadioGroup;
            private RadioButton cardPaymentRadioButton;
            private RadioButton tigoPesaRadioButton;
            private RadioButton haloPesaRadioButton;
            private Button submitButton;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_payment);

                // Find views by their IDs
                paymentMethodRadioGroup = findViewById(R.id.paymentMethodRadioGroup);
                cardPaymentRadioButton = findViewById(R.id.cardPaymentRadioButton);
                tigoPesaRadioButton = findViewById(R.id.tigoPesaRadioButton);
                haloPesaRadioButton = findViewById(R.id.haloPesaRadioButton);
                submitButton = findViewById(R.id.submitButton);

                // Set click listener for the submit button
                submitButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Get the selected payment method
                        int selectedId = paymentMethodRadioGroup.getCheckedRadioButtonId();
                        if (selectedId == cardPaymentRadioButton.getId()) {
                            // Card Payment selected
                            // Perform necessary actions for card payment
                        } else if (selectedId == tigoPesaRadioButton.getId()) {
                            // TigoPesa selected
                            // Perform necessary actions for TigoPesa payment
                        } else if (selectedId == haloPesaRadioButton.getId()) {
                            // HaloPesa selected
                            // Perform necessary actions for HaloPesa payment
                        }

                        // Display success message
                        Toast.makeText(PaymentActivity.this, "Payment added successfully", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }






