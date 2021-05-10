package com.example.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.*

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_btn)
        falseButton = findViewById(R.id.false_btn)

        trueButton.setOnClickListener {
            val toast = makeText(this, R.string.correct_toast, LENGTH_SHORT)
            toast.setGravity(Gravity.LEFT, 0, 0)
            toast.show()
        }
        falseButton.setOnClickListener {
            val toast = makeText(this, R.string.incorrect_toast, LENGTH_SHORT)
            toast.setGravity(Gravity.RIGHT, 0, 0)
            toast.show()


        }
    }
}