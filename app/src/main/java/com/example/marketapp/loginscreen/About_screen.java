package com.example.marketapp.loginscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

import com.example.marketapp.R;

public class About_screen extends AppCompatActivity {

    AppCompatButton aboutbckbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_screem);



        aboutbckbtn = findViewById(R.id.aboutbckbtn);

        aboutbckbtn.setOnClickListener(v -> dobacktologin());

    }
    private void dobacktologin() {
        Intent intent = new Intent(this, Login_View.class);
        startActivity(intent);
        finish();
    }
}