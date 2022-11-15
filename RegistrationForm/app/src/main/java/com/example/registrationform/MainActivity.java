package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstname;
    EditText lastname;
    EditText address;
    EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstname = findViewById(R.id.Firstname);
        lastname = findViewById(R.id.Lastname);
        address = findViewById(R.id.postaladdress);
        email = findViewById(R.id.email);



        Register.setOnClickListner(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkDataEntered();
            }
        });

    }
    boolean isEmail(EditText text){
        CharSequence email = text.getText().toString();
        return(!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());


    }
    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);

    }


    void checkDataEntered() {
        if (isEmpty(firstname)){
            Toast.makeText(this, "You must enter firstname to register", Toast.LENGTH_SHORT).show();
        }
        if (isEmpty(lastname)){
            lastname.setError("last name is required");
        }
        if (isEmail(email) == false){
            email.setError("Enter Valid Email");
        }
    }
}