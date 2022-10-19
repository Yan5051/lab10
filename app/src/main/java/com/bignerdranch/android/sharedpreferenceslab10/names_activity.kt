package com.bignerdranch.android.sharedpreferenceslab10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class names_activity : AppCompatActivity() {

    private lateinit var myNames: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_names)


        val ima = intent.getStringExtra("Names")

        myNames = findViewById(R.id.myName)

        myNames.text = "Ваше имя: " + ima.toString()




    }
}