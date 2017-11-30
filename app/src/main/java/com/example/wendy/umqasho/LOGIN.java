package com.example.wendy.umqasho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LOGIN extends AppCompatActivity {
    EditText username, password;
    Button register, forgot, signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.useremail);
        password = (EditText) findViewById(R.id.password);
        signin = (Button) findViewById(R.id.btnlogin);

        register = (Button) findViewById(R.id.btnregister);
        forgot = (Button) findViewById(R.id.btnforgot);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LOGIN.this, Register.class);
                startActivity(intent);
            }
        });

        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LOGIN.this, Retrieve.class);
                startActivity(intent);
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),Landlord.class);
                startActivity(intent);
            }
        });



    }
}
