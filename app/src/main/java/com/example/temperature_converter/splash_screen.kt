package com.example.temperature_converter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.os.postDelayed

class splash_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen2)
        Handler(Looper.getMainLooper()).postDelayed(2000){
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}