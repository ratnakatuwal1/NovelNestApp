package com.ratna.novelnestapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginHome extends AppCompatActivity {
    Button buttonRegister, buttonLogin;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_home);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonRegister = findViewById(R.id.buttonRegister);

        buttonLogin.setOnClickListener(view -> {
            Intent intent = new Intent(LoginHome.this, LoginActivity.class);
            startActivity(intent);
        });
        buttonRegister.setOnClickListener(view -> {
            Intent intent = new Intent(LoginHome.this, RegisterActivity.class);
            startActivity(intent);
        });

    }
}