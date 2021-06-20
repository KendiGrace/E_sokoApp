package com.example.e_sokoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignIn : AppCompatActivity() {
    lateinit var etUsername: EditText
    lateinit var etPassword: EditText
    lateinit var etConfirm: EditText
    lateinit var btnLOGIN: Button
    lateinit var btnSign2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        castViews()
        clickButton()
    }
    fun castViews(){
        etUsername=findViewById(R.id.etUsername)
        etPassword=findViewById(R.id.etPassword)
        etConfirm=findViewById(R.id.etConfirm)
        btnLOGIN=findViewById(R.id.btnLOGIN)
        btnSign2=findViewById(R.id.btnSign2)
    }
    fun clickButton() {
        btnSign2.setOnClickListener {
            val intent = Intent(baseContext, SignUP::class.java)
            startActivity(intent)
        }
        btnLOGIN.setOnClickListener {
            if (etUsername.text.toString().isEmpty() || etPassword.text.toString().isEmpty() || etConfirm != etPassword.text) {
                etUsername.setError("Email is required")
                etPassword.setError("Password is required")
                etConfirm.setError(("Password is incorrect"))

            }
            else {
                val intent = Intent(baseContext, Home::class.java)
                startActivity(intent)
            }

        }


    }
}
