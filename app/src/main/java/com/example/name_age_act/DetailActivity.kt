package com.example.name_age_act

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initViews()
    }

    fun initViews() {
        val tv_detail = findViewById<TextView>(R.id.tv_detail)
        val name = intent.getStringExtra("name")
        Log.d(TAG, name!!)
        tv_detail.text = name
    }

    companion object {
        val TAG = DetailActivity::class.java.toString()
    }
}