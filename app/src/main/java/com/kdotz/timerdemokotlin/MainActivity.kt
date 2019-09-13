package com.kdotz.timerdemokotlin

import android.os.Bundle
import android.os.CountDownTimer
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timer = object: CountDownTimer(20000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                Log.i("Seconds left!", (millisUntilFinished / 1000).toString())
            }

            override fun onFinish() {
                Log.i("We're done", "No more countdown")
            }
        }
        timer.start()

//        var handler = Handler()
//        val runnableCode = object: Runnable {
//            override fun run() {
//                Log.i("HI", "This is a second")
//                handler.postDelayed(this, 5000)
//            }
//        }
//        handler.post(runnableCode)
    }
}
