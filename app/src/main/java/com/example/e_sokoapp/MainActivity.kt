package com.example.e_sokoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnHome:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        clickButton()
    }
    fun castViews(){
        btnHome=findViewById(R.id.btnHome)

    }
    fun clickButton(){
        btnHome.setOnClickListener {
            val intent=Intent(baseContext,SignUP::class.java)
            startActivity(intent)

        }
    }

}