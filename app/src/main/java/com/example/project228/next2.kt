package com.example.project228

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class next2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next2)
    }
    fun oneClikGoback (viaw : View){
        val intent = Intent(this , next1 ::class.java)
        startActivity(intent)
    }
}