package com.example.cursobasicokotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(getString(R.string.btn_login))
        ContextCompat.getColor(this, R.color.teal_200)
        R.drawable.ic_launcher_foreground
        android.R.drawable.ic_delete

    }
}