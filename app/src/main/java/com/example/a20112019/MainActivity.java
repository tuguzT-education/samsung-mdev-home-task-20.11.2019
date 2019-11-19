package com.example.a20112019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String password = "password", login = "login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        EditText editTextLogin = findViewById(R.id.editTextLogin);
        EditText editTextPassword = findViewById(R.id.editTextPassword);
        TextView textViewError = findViewById(R.id.textViewError);

        if (password.equals(editTextPassword.getText().toString()) && login.equals(editTextLogin.getText().toString())) {
            textViewError.setText("Верные данные!");
            startActivity(intent);
        } else {
            textViewError.setText("Неверные данные!");
        }
    }
}
