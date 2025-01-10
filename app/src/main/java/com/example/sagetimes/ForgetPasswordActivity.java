package com.example.sagetimes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgetPasswordActivity extends AppCompatActivity {
    TextView textView;
    Button forgetBtn;
    EditText textEmail;
    String email;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        textView = (TextView) findViewById(R.id.goto_login);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        auth = FirebaseAuth.getInstance();
        textEmail = findViewById(R.id.email);
        forgetBtn = findViewById(R.id.reset_btn);

        forgetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateData();
            }
        });

    }

    private void validateData() {
        email = textEmail.getText().toString();
        if (email.isEmpty()) {
            textEmail.setError("Required");
        } else {
            forgetPassword();
        }
    }

    private void forgetPassword() {
        auth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(ForgetPasswordActivity.this, "Check Your Email.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(ForgetPasswordActivity.this, LoginActivity.class));
                    finish();
                } else {
                    Toast.makeText(ForgetPasswordActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}