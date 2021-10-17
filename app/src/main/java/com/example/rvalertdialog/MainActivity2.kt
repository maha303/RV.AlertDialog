package com.example.rvalertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tv2=findViewById<TextView>(R.id.tv2)
        val intent = intent
        val name = intent.getStringExtra("name")
        tv2.text="Your name is : $name"
    }
}