package com.kotlin.siddhant.kotlinrecyclerviewdemo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.util.ArrayList


/**
 * Created by Siddhant on 08/12/17.
 */
public  class  RecyclerAdapter(contextz: Context,array:ArrayList<String>) : RecyclerView.Adapter<RecyclerAdapter.Holder>()
{
    var context=contextz

    public var arrayz=array
    override fun getItemCount(): Int {
        return arrayz.size
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    override fun onBindViewHolder(holder: Holder?, position: Int) {
        var name=arrayz.get(position)
        holder?.tvName?.text =name
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int):Holder
    {
        var inflater=LayoutInflater.from(context).inflate(R.layout.recycler_row,parent,false) as View
        return Holder(inflater)
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

        class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
            val tvName=itemView?.findViewById<TextView>(R.id.tvName)
            fun bindItems(name:String) {

                tvName?.text=name
            }

        }






}