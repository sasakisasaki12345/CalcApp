package com.example.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val value1 = intent.getDoubleExtra("VALUE1",0.0)
        val value2 = intent.getDoubleExtra("VALUE2",0.0)
        val  type = intent.getIntExtra("type",0)

        when(type){
            1 -> textView.text ="${value1 + value2}"
            2 -> textView.text ="${value1 - value2}"
            3 -> textView.text ="${value1 * value2}"
            4 -> textView.text ="${value1 / value2}"
        }






    }
}
