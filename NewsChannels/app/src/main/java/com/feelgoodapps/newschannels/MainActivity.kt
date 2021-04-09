package com.feelgoodapps.newschannels

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val channels = Channels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getChannels(view : View) {
        val newsCategory: Spinner = findViewById(R.id.category)
        val channelsDisplay: TextView = findViewById(R.id.channels_for_category)
        val selectedCategory = newsCategory.selectedItem.toString()

        channelsDisplay.setText(channels.getChannels(selectedCategory))
    }

    fun nextActivity(view : View) {
        val newsCategory: Spinner = findViewById(R.id.category)
        val newsCategoryText = newsCategory.selectedItem.toString()
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("newsCategory", newsCategoryText)
        startActivity(intent)
    }
}