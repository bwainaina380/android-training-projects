package com.feelgoodapps.adddeduct

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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