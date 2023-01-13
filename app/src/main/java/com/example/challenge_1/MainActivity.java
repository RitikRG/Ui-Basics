package com.example.challenge_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText firstName, lastName, emailID;
    private Button registerBtn;
    private TextView firstNameDisplay, lastNameDisplay, emailIDDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.firstName);
        lastName= findViewById(R.id.lastName);
        emailID= findViewById(R.id.emailID);
        registerBtn= findViewById(R.id.registerBtn);
        firstNameDisplay= findViewById(R.id.firstNameDisplay);
        lastNameDisplay=findViewById(R.id.lastNameDisplay);
        emailIDDisplay= findViewById(R.id.emailIDDisplay);


        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNameDisplay.setText(firstName.getText().toString());
                lastNameDisplay.setText(lastName.getText().toString());
                emailIDDisplay.setText(emailID.getText().toString());
                firstName.setText("");
                lastName.setText("");
                emailID.setText("");
            }
        });
    }
}