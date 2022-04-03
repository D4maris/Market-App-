package com.example.marketapp.loginscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Toast;

import com.example.marketapp.R;
import com.example.marketapp.admin_add.Add_Staff_Product;
import com.example.marketapp.database.SQLiteDatabaseHandler;
import com.example.marketapp.model.User;

public class Admin extends AppCompatActivity {

    AppCompatButton btn_loginasadmin;
    AppCompatEditText input_usernameadmin;
    AppCompatEditText input_passwordadmin;


    SQLiteDatabaseHandler databaseHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        // Menghubungkan activity ke xml

        input_usernameadmin = findViewById(R.id.input_usernameadmin);
        input_passwordadmin = findViewById(R.id.input_passwordadmin);
        btn_loginasadmin = findViewById(R.id.btn_loginasadmin);

        databaseHandler = new SQLiteDatabaseHandler(this);





        createUser();
        btn_loginasadmin.setOnClickListener(v -> doLogin());

    }

    private void doLogin() {
        String username = input_usernameadmin.getText().toString();
        String password = input_passwordadmin.getText().toString();

        if (username.isEmpty() && password.isEmpty()) {
            input_usernameadmin.setError("Username tidak boleh kosong");
            input_passwordadmin.setError("Password tidak boleh kosong");
        } else if (username.isEmpty()) {
            input_usernameadmin.setError("Username tidak boleh kosong");
        } else if (password.isEmpty()) {
            input_passwordadmin.setError("Password tidak boleh kosong");
        } else {
            User user = databaseHandler.getUserByUsernameAndPassword(username, password);
            if (user == null) {
                Toast.makeText(this, "User not found", Toast.LENGTH_SHORT).show();
            } else {
                SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(this).edit();
                editor.putBoolean("IS_LOGIN", true);
                editor.apply();

                Intent intent = new Intent(this, Add_Staff_Product.class);
                startActivity(intent);
                finish();
            }
        }
    }

    private void createUser() {
        User admin = new User("admin", "Admin", "admin123");
        databaseHandler.addUser(admin);

        User staff = new User("staff", "Staff", "staff123");
        databaseHandler.addUser(staff);
    }
}