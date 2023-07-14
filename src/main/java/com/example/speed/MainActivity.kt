package com.example.speed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import me.ibrahimsn.lib.Speedometer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val speedometer = findViewById<Speedometer>(R.id.speedometer)

        speedometer.setSpeed(95, 10000L)
        {
            speedometer.setSpeed(85, 10000L) { speedometer.setSpeed(25, 1000L) }
            speedometer.setSpeed(75, 10000L) { speedometer.setSpeed(40, 1000L) }
            speedometer.setSpeed(65, 10000L) { speedometer.setSpeed(95, 10000L) }

            speedometer.setSpeed(60, 10000L) { speedometer.setSpeed(95, 1000L) }
            speedometer.setSpeed(55, 10000L) { speedometer.setSpeed(0, 1000L) }
            speedometer.setSpeed(50, 10000L) { speedometer.setSpeed(8, 1000L) }
            // speed: Int, duration: Long

            speedometer.setSpeed(65, 10000L) {
                // Do on animation end
                speedometer.setSpeed(35, 10000L)
                speedometer.setSpeed(25, 10000L)
                speedometer.setSpeed(75, 10000L)
                speedometer.setSpeed(95, 10000L)
                speedometer.setSpeed(100, 10000L)
                speedometer.setSpeed(25, 10000L)
                speedometer.setSpeed(5, 10000L)
                speedometer.setSpeed(95, 10000L)
                speedometer.setSpeed(100, 10000L)
                speedometer.setSpeed(0, 10000L)
                speedometer.setSpeed(100, 10000L)
            }
            speedometer.setSpeed(100, 10000L) {
                speedometer.setSpeed(0, 10000L)
            }


            speedometer.setSpeed(0, 10000L) {
                speedometer.setSpeed(77, 10000L)
            }
        }
    }
}