package com.kotlin.kumar.mvpdemo.presenter

import android.view.View
import com.kotlin.kumar.mvpdemo.contract.MainActivityContract
import com.kotlin.kumar.mvpdemo.model.MainActivityModel

/**
 * Created by Siddhant on 13/03/18.
 */
public class MainActivityPresenter(viewz:MainActivityContract.View):MainActivityContract.Presenter
{
    var viewz=viewz

    init {
        viewz.initView()
    }

    // click events
    override fun onClick(view: View) {
        var model=MainActivityModel()
        viewz.setData(model.getData())
    }



}