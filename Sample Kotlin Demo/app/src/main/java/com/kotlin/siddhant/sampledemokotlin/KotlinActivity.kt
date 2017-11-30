package com.kotlin.siddhant.sampledemokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.Toast


class KotlinActivity : AppCompatActivity() {


    var button:Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        button = findViewById<Button>(R.id.button)
        button?.setOnClickListener {
            Toast.makeText(this,"Hey Kotlin",Toast.LENGTH_LONG).show() // no semicolon
        }



    }
}
