package com.example.a10119248latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
// 26-04-2022, NIM:10119248, Syifa Nur Afifah, IF-6

public class MainActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void btnRegister(View view){
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        }
    }