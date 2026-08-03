package com.example.georgepierce_contactsaddressbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val contactButton1 = findViewById<Button>(R.id.contactButton1)
        contactButton1.setOnClickListener {
            startActivity(Intent(this, contact1Activity::class.java))
        }
        val contactButton2 = findViewById<Button>(R.id.contactButton2)
        contactButton2.setOnClickListener {
            startActivity(Intent(this, contact2Activity::class.java))
        }

    }
}