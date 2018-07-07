package com.wordpress.meatclubs.courtcounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val THREE_POINT_THROW = 3
    val TWO_POINT_THROW = 2
    val FREE_THROW = 1
    val DEFAULT_SCORE = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun teamAthreePointThrow(view: android.view.View) {
        var score = teamAScoreTextView.text.toString().toInt() + THREE_POINT_THROW
        teamAScoreTextView.text = score.toString()
    }

    fun teamBThreePointThrow(view: android.view.View) {
        var score = teamBScoreTextView.text.toString().toInt() + THREE_POINT_THROW
        teamBScoreTextView.text = score.toString()
    }

    fun teamATwoPointThrow(view: android.view.View) {
        var score = teamAScoreTextView.text.toString().toInt() + TWO_POINT_THROW
        teamAScoreTextView.text = score.toString()
    }

    fun teamBTwoPointThrow(view: android.view.View) {
        var score = teamBScoreTextView.text.toString().toInt() + TWO_POINT_THROW
        teamBScoreTextView.text = score.toString()
    }

    fun teamAFreeThrow(view: android.view.View) {
        var score = teamAScoreTextView.text.toString().toInt() + FREE_THROW
        teamAScoreTextView.text = score.toString()
    }

    fun teamBFreeThrow(view: android.view.View) {
        var score = teamBScoreTextView.text.toString().toInt() + FREE_THROW
        teamBScoreTextView.text = score.toString()
    }

    fun resetCounters(view: android.view.View) {

        teamAScoreTextView.text = DEFAULT_SCORE.toString()
        teamBScoreTextView.text = DEFAULT_SCORE.toString()
    }
}
