package com.laf.lafh.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.laf.lafh.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
    }
}