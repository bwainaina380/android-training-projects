package com.feelgoodapps.myapplication

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculateAge(view: View) {
        val yearOfBirth = findViewById<EditText>(R.id.year_of_birth).text.toString()
        val age = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth.toInt()
        findViewById<TextView>(R.id.calculated_age).text = "Your age is $age"
    }
}