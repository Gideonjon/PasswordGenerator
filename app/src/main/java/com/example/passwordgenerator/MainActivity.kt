package com.example.passwordgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val passwordGenerator = PasswordGenerator()
        textView = findViewById(R.id.text)
        button = findViewById(R.id.btn_generate)

        button.setOnClickListener {

            val passwprd = passwordGenerator.generatePassword(12, "coffee")
            textView.text = passwprd
        }


    }
}