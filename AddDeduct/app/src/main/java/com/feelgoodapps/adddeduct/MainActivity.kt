package com.feelgoodapps.adddeduct

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    var score = 0
    private lateinit var viewModel: AddDeductViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Activity Created", Toast.LENGTH_SHORT).show()

        Log.i("MainActivity", "called viewModelProvider.get")
        viewModel = ViewModelProvider(this).get(AddDeductViewModel::class.java)

        if(savedInstanceState != null) {
            score = savedInstanceState.getInt("score")
            var scoreText: TextView = findViewById(R.id.score_display)
            scoreText.setText(score.toString())
        }
    }

    override fun onSaveInstanceState(bundle: Bundle){
        super.onSaveInstanceState(bundle)
        bundle.putInt("score", score)
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "Activity Pausing", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Activity Resuming", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "Activity Starting", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "Activity Stopping", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "Activity Restarting", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Activity Destroyed", Toast.LENGTH_SHORT).show()
    }

    fun addScore(view: View) {
        var scoreText: TextView = findViewById(R.id.score_display)
        score++
        scoreText.setText(score.toString())
    }

    fun deductScore(view: View) {
        var scoreText: TextView = findViewById(R.id.score_display)
        score--
        scoreText.setText(score.toString())
    }
}