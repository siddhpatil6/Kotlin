package com.kotlin.siddhant.kotlinrecyclerviewdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import java.util.ArrayList

class RecyclerViewActivity : AppCompatActivity() {


    var list: ArrayList<String> = ArrayList()
    var holder:RecyclerAdapter.Holder? = null
    var rvList:RecyclerView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        list?.add("Siddhant")
        list?.add("Mayur")
        list?.add("Vilas")
        list?.add("opq")
        list?.add("lmn")
        list?.add("abc")
        list?.add("efg")
        list?.add("hij")
        rvList=findViewById(R.id.rvList) as RecyclerView
        rvList?.layoutManager=StaggeredGridLayoutManager(list.size,StaggeredGridLayoutManager.VERTICAL)
        var adapter= RecyclerAdapter(this,array=list)
        rvList?.adapter=adapter

    }

    override fun onStart() {
        super.onStart()
        println("Start")
    }

    override fun onPause() {
        super.onPause()
        println("Pause")
    }

    override fun onPostResume() {
        super.onPostResume()
        println("Pause")
    }

    override fun onResume() {
        super.onResume()
        println("Pause")
    }
}
