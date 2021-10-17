package com.example.rvalertdialog

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.LayoutDirection
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn1)

        btn.setOnClickListener {}
        val dialog = AlertDialog.Builder(this)
        val dialogView = layoutInflater.inflate(R.layout.login_dialog,null)
        dialog.setView(dialogView)
        dialog.setCancelable(false)
        dialog.show()

        val edName = dialogView.findViewById<EditText>(R.id.edName)
        val tv1 = dialogView.findViewById<TextView>(R.id.tv1)
        val btn2 = dialogView.findViewById<Button>(R.id.btnTv)
        val btn1 = dialogView.findViewById<Button>(R.id.btnGo)
        btn2.setOnClickListener{
            tv1.text=edName.text
        }
        btn1.setOnClickListener{
            val name = edName.text.toString()
            val int = Intent(this,MainActivity2::class.java)
            int.putExtra("name",name)
            startActivity(int)
        }

    }





}