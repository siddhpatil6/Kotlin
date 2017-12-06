package com.kotlin.siddhant.kotlinlistview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class KotlinListActivity : AppCompatActivity() {

    var lvKotling: ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_list)

        lvKotling=findViewById<ListView>(R.id.lvKotlin)
        var array=ArrayList<String>()
        array.add("Siddhant")
        array.add("Mayur")
        array.add("vilas")
        var adapter=ListAdaper(this,array)
        lvKotling?.adapter= adapter

        lvKotling?.setOnItemClickListener { adapterView, view, i, l ->

            Toast.makeText(this,array[i],Toast.LENGTH_LONG).show()
        }
    }
}

