package com.example.name_age_act

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initviews()
    }

    fun initviews() {
        val b_detail = findViewById<Button>(R.id.b_detail)
        b_detail.setOnClickListener { openDetailActivity() }
    }

    fun openDetailActivity() {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("name", "Odinayev Golibjon")
        startActivity(intent)
    }
}