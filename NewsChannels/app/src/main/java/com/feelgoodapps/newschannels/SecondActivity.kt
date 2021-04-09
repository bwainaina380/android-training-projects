package com.feelgoodapps.newschannels

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent = getIntent()
        val newsCategory = intent.getStringExtra("newsCategory")
        val textDisplay = findViewById<TextView>(R.id.news_category)
        textDisplay.setText(newsCategory)
    }
}