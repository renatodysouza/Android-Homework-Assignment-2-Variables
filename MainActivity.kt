package com.example.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import song
import artist
import year
import deathAge
import death


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Song", song)
        Log.d("Artist", artist)
        Log.d("Year", year)
        Log.d("Death", deathAge.toString())
        Log.d("Death", death.toString())
    }
}

