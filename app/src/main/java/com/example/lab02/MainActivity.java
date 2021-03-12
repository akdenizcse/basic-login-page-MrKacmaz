package com.example.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("ON CREATE WORK");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("ON START WORK");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("ON RESUME WORK");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("ON PAUSE WORK");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("ON STOP WORK");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("DESTROY WORK");
    }

    @SuppressLint("SetTextI18n")
    public void logIn(View view) {
        EditText mail = findViewById(R.id.userEmail);
        EditText password = findViewById(R.id.userPassword);
        String userMail = mail.getText().toString();
        String userPass = password.getText().toString();
        TextView dangerMassage = findViewById(R.id.textDanger);
        dangerMassage.setText(" ");
        if (userMail.equals(userPass)){
            System.out.println("BUTTON CLICK WORK\nName = " + userMail);
            System.out.println("BUTTON CLICK WORK\nPassword = " + userPass);
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("userName", userMail);
            startActivity(intent);
        }else{
            dangerMassage.setText("Wrong Password");
        }
    }
}