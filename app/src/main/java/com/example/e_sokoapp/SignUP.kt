package com.example.e_sokoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class SignUP : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var spGender: Spinner
    lateinit var etPhone: EditText
    lateinit var etPass: EditText
    lateinit var etEmail: EditText
    lateinit var btnSignIn: Button
    lateinit var btnSignUP: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        castViews()
        clickButton()
    }

    fun castViews() {
        etName = findViewById(R.id.etName)
        etEmail = findViewById(R.id.etEmail)
        etPass = findViewById(R.id.etPass)
        spGender = findViewById(R.id.spGender)
        etPhone = findViewById(R.id.etPhone)
        btnSignIn = findViewById(R.id.btnSignin)
        btnSignUP = findViewById(R.id.btnSignup)

        var gender = arrayOf("choose gender", "Female", "Male")
        var genderAdapter = ArrayAdapter(baseContext, android.R.layout.simple_spinner_item, gender)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spGender.adapter = genderAdapter

    }

    fun clickButton() {
        btnSignIn.setOnClickListener {
            val intent = Intent(baseContext, SignIn::class.java)
            startActivity(intent)
        }
        btnSignUP.setOnClickListener {
            if (etName.text.toString().isEmpty() || etEmail.text.toString()
                    .isEmpty() || etPhone.text.toString().isEmpty() || etPass.text.toString()
                    .isEmpty()
            ) {
                etName.setError("Name required")
                etEmail.setError("Email is required")
                etPass.setError("Password is required")
                etPhone.setError("Phone number is required")
            } else {
                val intent = Intent(baseContext, Home::class.java)
                startActivity(intent)


            }
        }
    }
}