package com.example.atry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PostsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts);
    }


    public void launch_signup(View v) {
        // Launch the Sign up activity
        Intent i = new Intent(this, PlaylistsActivity.class);
        startActivity(i);

    }
}