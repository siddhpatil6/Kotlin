package com.kotlin.kumar.mvpdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.kotlin.kumar.mvpdemo.contract.MainActivityContract
import com.kotlin.kumar.mvpdemo.presenter.MainActivityPresenter


// view Interface used from MainActivityContract
class MainActivity : AppCompatActivity(),MainActivityContract.View{

    var btnSumbit:Button? = null

    // inititalization done where method implemented from View Inteface from MainActivityContract
    override fun initView() {

        btnSumbit=findViewById(R.id.btnSumbit)
    }

    //data set from Presenter, this method is called to connect presenter to View
    override fun setData(data: String) {
        Toast.makeText(this,data,Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var preseter=MainActivityPresenter(this)

        // instance pass to presenter to perform actions of logic
        btnSumbit?.setOnClickListener {
            preseter.onClick(it)
        }
    }
}
