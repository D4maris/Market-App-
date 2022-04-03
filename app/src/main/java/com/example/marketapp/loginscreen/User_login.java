package com.example.marketapp.loginscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Toast;

import com.example.marketapp.MainActivity;
import com.example.marketapp.R;
import com.example.marketapp.database.SQLiteDatabaseHandler;
import com.example.marketapp.model.User;

public class User_login extends AppCompatActivity {

    // tipe view      // nama view
    AppCompatEditText inputUsername;
    AppCompatEditText inputPassword;
    AppCompatButton btnLogin;

    SQLiteDatabaseHandler databaseHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        databaseHandler = new SQLiteDatabaseHandler(this);

        // Menghubungkan activity ke xml
        inputUsername = findViewById(R.id.input_username);
        inputPassword = findViewById(R.id.input_password);
        btnLogin = findViewById(R.id.btn_login);

        createUser();
        btnLogin.setOnClickListener(v -> doLogin());
    }

    private void doLogin() {
        String username = inputUsername.getText().toString();
        String password = inputPassword.getText().toString();

        if (username.isEmpty() && password.isEmpty()) {
            inputUsername.setError("Username tidak boleh kosong");
            inputPassword.setError("Password tidak boleh kosong");
        } else if (username.isEmpty()) {
            inputUsername.setError("Username tidak boleh kosong");
        } else if (password.isEmpty()) {
            inputPassword.setError("Password tidak boleh kosong");
        } else {
            User user = databaseHandler.getUserByUsernameAndPassword(username, password);
            if (user == null) {
                Toast.makeText(this, "User not found", Toast.LENGTH_SHORT).show();
            } else {
                SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(this).edit();
                editor.putBoolean("IS_LOGIN", true);
                editor.apply();

                Intent intent = new Intent(this, Category_screen.class);
                startActivity(intent);
                finish();
            }
        }
    }
    private void createUser() {

        User staff = new User("staff", "Staff", "staff123");
        databaseHandler.addUser(staff);
    }
}
