package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;

import java.net.PasswordAuthentication;

public class Login extends AppCompatActivity {
    EditText firstname;
    EditText lastname;
    EditText address;
    EditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setupUI();
        setupListeners();
    }

    private void setupUI() {
        firstname = findViewById(R.id.Firstname);
        lastname = findViewById(R.id.Lastname);
        address = findViewById(R.id.postaladdress);
        email = findViewById(R.id.email);
    }
    private void setupListeners() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkUsername();
            }

             void checkUsername() {
                boolean isvalid = true;
                if (isEmpty(checkUsername())){
                    checkUsername();
                }else{
                    if (!Email(checkUsername())){
                        checkUsername();
                    }
                }
                 if (isEmpty(new PasswordAuthentication())){
                     checkUsername();
                 }else{
                     if (!Email(new PasswordAuthentication())){
                         checkUsername();
                     }
                 }
            }
        });
        register.setOnClickListeners(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}