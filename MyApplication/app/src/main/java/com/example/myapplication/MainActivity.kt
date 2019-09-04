package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.R
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById(R.id.Button)
        val e1 =
            findViewById(R.id.textView) as EditText//Make Sure that this is EditText or TextView
        val e2 = findViewById(R.id.textView2) as EditText
        val t1 = findViewById(R.id.textView3) as EditText
        val num1 = Integer.parseInt(e1.text.toString())
        val num2 = Integer.parseInt(e2.text.toString())
        val sum = num1 + num2
        button.setOnClickListener(object : View.OnClickListener() {
            fun onClick(v: View) {
                t1.setText(Integer.toString(sum))
            }
        })
    }
}
