package com.example.application1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCold = findViewById<Button>(R.id.button1)
        val btnHot = findViewById<Button>(R.id.button2)
        val linLayout =findViewById<LinearLayout>(R.id.linearlayout)

        btnCold.setOnClickListener{
            //change backgroundColor to blue
            linLayout.setBackgroundColor(getColor(R.color.blue))

        }
        btnHot.setOnClickListener {
            //change backgroundColor to red
            linLayout.setBackgroundColor(getColor(R.color.red))
        }
    }
}