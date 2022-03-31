package com.fourcade7.kotlin_activity_transition_with_animation

import android.app.PendingIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            val intent=Intent(this@MainActivity,MainActivity2::class.java)
            startActivityForResult(intent, 1)
            overridePendingTransition(R.anim.zoom_in,R.anim.zoom_out)
            //startActivity(intent)

        }
    }
}