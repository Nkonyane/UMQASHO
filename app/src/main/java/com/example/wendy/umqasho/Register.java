package com.example.wendy.umqasho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.lang.reflect.Member;

public class Register extends AppCompatActivity {
    EditText name, surname, email, password, dob;
    RadioButton male, female,admin;
    Button register;
    RadioGroup Gender,type;
    String gender;
    Member member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        register = (Button) findViewById(R.id.register);
        name = (EditText) findViewById(R.id.editFName);
        surname = (EditText) findViewById(R.id.editSurname);
        email = (EditText) findViewById(R.id.editEmail);
        dob = (EditText) findViewById(R.id.DOB);
        password = (EditText) findViewById(R.id.editPass);
        male = (RadioButton) findViewById(R.id.radMale);
        Gender = (RadioGroup) findViewById(R.id.grpGender);
        type = (RadioGroup) findViewById(R.id.grpType);
        female = (RadioButton) findViewById(R.id.radFemale);
        admin = (RadioButton) findViewById(R.id.radAdmin);




    }
}
