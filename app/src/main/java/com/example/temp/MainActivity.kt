package com.example.temp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val temp = findViewById<EditText>(R.id.temp)
        val tvres = findViewById<TextView>(R.id.tvres)
        val celtofar = findViewById<Button>(R.id.celtofar)
//        val celtofar : Button?= null;
//        celtofar!!.text= "click me "
        val fartocel = findViewById<Button>(R.id.fartocel)

        celtofar.setOnClickListener {

            val temp = temp.text.toString().toInt()
            tvres.text =((temp*1.8)+32).toString()

        }

        fartocel.setOnClickListener {
            val temp = temp.text.toString().toInt()
            tvres.text =((temp-32)*5/9).toString()

        }

    }
}