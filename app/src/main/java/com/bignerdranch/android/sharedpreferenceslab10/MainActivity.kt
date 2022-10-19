package com.bignerdranch.android.sharedpreferenceslab10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {


    private lateinit var soxrIma: Button
    private lateinit var Ima: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        soxrIma = findViewById(R.id.setName)
        Ima = findViewById(R.id.editName)


        val imass = getSharedPreferences("Names", MODE_PRIVATE)

        if(imass.contains("IMA")){

            val name = Intent(this, names_activity::class.java)
            name.putExtra("Names", imass.getString("IMA","why?").toString())
            startActivity(name)
        }


        soxrIma.setOnClickListener{
            val edit = imass.edit()
            edit.putString("IMA",Ima.text.toString())
            val name = Intent(this, names_activity::class.java)
            edit.apply()
            name.putExtra("Names", imass.getString("IMA","wgy?").toString())
            startActivity(name)

        }
    }
}