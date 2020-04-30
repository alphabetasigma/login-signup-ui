package com.example.kaushik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    EditText username, password;
    Button signupClicked;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void signupClicked(View view) {

        String Username = username.getText().toString();
        String Password = password.getText().toString();
        if (Username.isEmpty() || Password.isEmpty()) {
            Toast.makeText(Register.this, "invalid inputs", Toast.LENGTH_LONG).show();
        } else {
            //proceed further
        }
    }
}
