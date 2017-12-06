package com.kotlin.siddhant.kotlinlistview

import android.app.Activity
import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.list_row.view.*

/**
 * Created by Siddhant on 06/12/17.
 */
class ListAdaper(context: Context,array: ArrayList<String>) : BaseAdapter() {

    var context:Context?=context
    var array:ArrayList<String>?=array

    override fun getView(index: Int, viewz: View?, viewGroup: ViewGroup?): View {
        var vi=viewz
        var inflater:LayoutInflater= context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        vi=inflater.inflate(R.layout.list_row,null)

        if(vi!=null)
        {
            val tvName:TextView= vi?.tvName?.findViewById(R.id.tvName) as TextView
            tvName.text= array?.get(index) as String
        }
        return vi
    }

    override fun getItem(index: Int): String? {

        return array?.get(index)
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemId(id: Int): Long {
        return id.toLong()
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
        return array!!.count()
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}