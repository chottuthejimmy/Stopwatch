package com.chottuthejimmy.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val timer = MyCounter(100000000, 1000)
    var  countervalue : Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startBtn.setOnClickListener {
            timer.start()
            startBtn.isEnabled = false
        }
        stopBtn.setOnClickListener {
            timer.cancel()
            startBtn.isEnabled = true
        }
    }
    inner class MyCounter(millisInFuture: Long, countDownInterval: Long) : CountDownTimer(millisInFuture, countDownInterval) {
        override fun onFinish() {
        }
        override fun onTick(millisUntilFinished: Long) {
            countervalue++
            viewNumber.text = (countervalue).toString()
            wreset.setOnClickListener {
                    countervalue = 0
                viewNumber.text = (countervalue).toString()
            }
            }
    }
}