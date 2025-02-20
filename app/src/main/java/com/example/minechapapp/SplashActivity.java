package com.example.minechapapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Log.d("SplashActivity", "Iniciando Splash Screen...");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                try {
                    Log.d("SplashActivity", "Intentando abrir Registers...");
                    Intent intent = new Intent(SplashActivity.this, Registers.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                    Log.e("SplashActivity", "Error al abrir Registers: " + e.getMessage());
                }
            }
        }, 3000);
    }
}
