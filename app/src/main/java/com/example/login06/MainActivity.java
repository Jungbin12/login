package com.example.login06;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView tv_id, tv_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_id = findViewById(R.id.tv_id);
        tv_pass = findViewById(R.id.tv_pass);

        Intent intent = getIntent();
        if (intent != null) {
            String userID = intent.getStringExtra("userID");
            String userPass = intent.getStringExtra("userPass");

            if (userID != null && userPass != null) {
                tv_id.setText(userID);
                tv_pass.setText(userPass);
            } else {
                // Handle case where userID or userPass is null
            }
        } else {
            // Handle case where intent is null
        }
    }
}
