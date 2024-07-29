package com.aman.notes

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Get_Started : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_get_started)
        changeStatusBarColor("013220")

        val first_button = findViewById<Button>(R.id.first)

        first_button.setOnClickListener{

            val intent=Intent(this,Registration::class.java)
            startActivity(intent)
        }

        var name : String ="Aman"
        name = null.toString()
        println(name.length)



    }

    private fun changeStatusBarColor(color: String) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window: Window = window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = android.graphics.Color.parseColor("#$color")
        }
    }



}