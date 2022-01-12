package com.example.atry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launch_signup(View v) {
        // Launch the Sign up activity
        Intent i = new Intent(this, SignUpActivity.class);
        startActivity(i);

    }

    public void LaunchHome(View v) {
        // Launch the Home activity
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);
    }

    public void LaunchShoppingCart(View v) {
        Intent i = new Intent(this, ShoppingCartActivity.class);
        startActivity(i);
    }
}