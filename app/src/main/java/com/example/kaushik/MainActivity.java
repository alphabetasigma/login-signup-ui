package com.example.kaushik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button LoginClicked;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password =findViewById(R.id.password);


    }

    public void goToRegisterScreen(View view) {
        Intent intent =new Intent(MainActivity.this, Register.class);
        startActivity(intent);
        finish();

    }
    public void LoginClicked(View view) {

        String Username = username.getText().toString();
        String Password = password.getText().toString();
        if(Username.isEmpty() || Password.isEmpty()) {
           Toast.makeText(MainActivity.this,"invalid inputs",Toast.LENGTH_LONG).show();
        }else {
            //proceed further

        }

    }
}
