package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //１）id
        val tx: TextView = findViewById(R.id.tv)
        val btn1: Button = findViewById(R.id.btnRice)
        val btn2: Button = findViewById(R.id.btnBread)
        val btn3: Button = findViewById(R.id.btnClear)

        //２）クリック処理
        btn1.setOnClickListener {
            tx.text = "米"
        }
        btn2.setOnClickListener {
            tx.text = "パン"
        }
        btn3.setOnClickListener {
            tx.text = "..."
        }

    }
}