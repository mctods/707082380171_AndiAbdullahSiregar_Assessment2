package com.example.andisiregar

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.annotation.RequiresApi

class pesan : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesan)

        val spinner: Spinner = findViewById(R.id.spinner)
        val items = arrayOf("Tiket Hari - 1", "Tiket Hari - 2", "Tiket Hari - 3", "Tiket 3 Hari")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, items)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        val btn_login = findViewById<Button>(R.id.Login)
        btn_login.setOnClickListener {
            val intent = Intent(this, splashscreen2::class.java)
            startActivity(intent)
        }
    }
}