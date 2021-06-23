package com.example.mygym

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer

class Stopwatch : AppCompatActivity() {

    private lateinit var btnstart: Button
    private lateinit var btnpause: Button
    private lateinit var btnreset: Button
    private lateinit var stopwatch: Chronometer
    var pauseAt: Long=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stopwatch)

        btnstart = findViewById(R.id.btnstart)
        btnpause = findViewById(R.id.btnpause)
        btnreset = findViewById(R.id.btnreset)
        stopwatch = findViewById(R.id.stopwatch)


        btnstart.setOnClickListener() {
            stopwatch.base= SystemClock.elapsedRealtime()-pauseAt
            stopwatch.start()
        }

        btnpause.setOnClickListener {
            pauseAt = SystemClock.elapsedRealtime()-stopwatch.base
            stopwatch.stop()
        }

        btnreset.setOnClickListener {
            stopwatch.base= SystemClock.elapsedRealtime()
        }





    }
}