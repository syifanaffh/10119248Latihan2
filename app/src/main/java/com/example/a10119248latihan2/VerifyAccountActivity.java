package com.example.a10119248latihan2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

// 26-04-2022, NIM:10119248, Syifa Nur Afifah, IF-6

public class VerifyAccountActivity extends AppCompatActivity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_verify_account);

            Button veryacc = (Button) findViewById(R.id.veryacc);
            veryacc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(VerifyAccountActivity.this,HomeActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
