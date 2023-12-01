package com.example.andisiregar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn_signup = findViewById<TextView>(R.id.Daftar)
        val btn_login = findViewById<Button>(R.id.Login)

        btn_signup.setOnClickListener {
            val _intent = Intent(this, signup::class.java)
            startActivity(_intent)

        }

        btn_login.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}