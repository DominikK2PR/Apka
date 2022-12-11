package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.sqrt
import kotlin.math.floor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button=findViewById<Button>(R.id.button)
        var input=findViewById<EditText>(R.id.editTextNumber)
        var text=findViewById<TextView>(R.id.textView)
        button.setOnClickListener() {
            var arrayInt = arrayOf<Int>()
            var a = input.text.toString().toInt()
            var b = 2
            var c = floor(sqrt(a.toFloat().toDouble()))
            while (b <= c) {
                while (a % b == 0) {
                    arrayInt += b
                    a /= b
                    c = floor(sqrt((a.toFloat().toDouble())))
                }
                b += 1
            }
            if (a > 1) {
                arrayInt += a
            }
            var results = arrayInt.contentToString().replace("[", "").replace("]", "")
            text.text = results

        }

    }
}