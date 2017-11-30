package com.example.wendy.umqasho;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Retrieve extends AppCompatActivity {
    EditText email, dob;
    Button retrive;
    Cursor cursor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve);

        email = (EditText)findViewById(R.id.Rmail);
        dob = (EditText)findViewById(R.id.Rdob);
        retrive = (Button)findViewById(R.id.btnRetrive);



    }
}
