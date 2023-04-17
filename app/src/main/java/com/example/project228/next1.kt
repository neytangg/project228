package com.example.project228

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class next1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next1)
    }
    fun oneClikGoback (viaw : View){
        val intent = Intent(this , MainActivity ::class.java)
        startActivity(intent)
    }
    fun oneClikbacknext2 (viaw : View){
        val intent = Intent(this , next2 ::class.java)
        startActivity(intent)
    }
}