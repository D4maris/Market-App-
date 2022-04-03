package com.example.marketapp.loginscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

import com.example.marketapp.R;


public class Login_View extends AppCompatActivity {

    AppCompatButton newuserbtn;
    AppCompatButton loginbtn;
    AppCompatButton adminbtn;
    AppCompatButton staffbtn;
    AppCompatButton aboutbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_view);


        newuserbtn = findViewById(R.id.newuser_btn);
        loginbtn = findViewById(R.id.login_btn);
        adminbtn = findViewById(R.id.admin_btn);
        staffbtn = findViewById(R.id.staff_btn);
        aboutbtn = findViewById(R.id.about_btn);


        loginbtn.setOnClickListener(v -> doLogin());
        staffbtn.setOnClickListener(v -> dostafflogin());
        aboutbtn.setOnClickListener(v -> about());
        newuserbtn.setOnClickListener(v -> newuserscreen());
        adminbtn.setOnClickListener(v -> adminlogin());

    }
    private void doLogin() {
        Intent intent = new Intent(this, User_login.class);
        startActivity(intent);
        finish();
    }
    private void dostafflogin() {
        Intent intent = new Intent(this, Staff_login.class);
        startActivity(intent);
        finish();
    }
    private void about() {
        Intent intent = new Intent(this, About_screen.class);
        startActivity(intent);
        finish();
    }
    private void newuserscreen() {
        Intent intent = new Intent(this, New_user.class);
        startActivity(intent);
        finish();
    }
    private void adminlogin() {
        Intent intent = new Intent(this, Admin.class);
        startActivity(intent);
        finish();
    }
}