package com.example.tugas_p5

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextUsername = findViewById<EditText>(R.id.editTextUsername)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)
        val textViewRegister = findViewById<TextView>(R.id.member)
        val textViewregister = findViewById<TextView>(R.id.textViewRegister)
        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)


        buttonLogin.setOnClickListener { v: View? -> }

        textViewregister.setOnClickListener { v: View? -> }
    }
}