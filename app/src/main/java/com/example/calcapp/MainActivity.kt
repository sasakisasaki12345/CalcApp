package com.example.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.support.design.widget.Snackbar
import android.util.Log

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        if ( editText1.text.toString() == ""  || editText2.text.toString() == "") {
            Snackbar.make(v,"数字を入力してください",Snackbar.LENGTH_SHORT).show()
        } else {

        val number1 = editText1.text.toString().toDouble()
        val number2 = editText2.text.toString().toDouble()



            var intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("VALUE1", number1)
            intent.putExtra("VALUE2", number2)

            when (v.id) {
                R.id.button1 -> intent.putExtra("type", 1)
                R.id.button2 -> intent.putExtra("type", 2)
                R.id.button3 -> intent.putExtra("type", 3)
                R.id.button4 -> intent.putExtra("type", 4)
            }

            startActivity(intent)
        }

    }


}
