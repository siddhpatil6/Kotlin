package com.kotlin.kumar.mvpdemo.contract

import android.view.View

/**
 * Created by Siddhant on 13/03/18.
 */
public interface MainActivityContract
{

    // View Interface for Activity
    public interface View
    {
        public fun initView()
        public fun setData(data:String)
    }

    // Model Interface for Model class
   public interface Model
   {
        public fun getData():String
   }

    // Presenter Interface for Presenter class to write logics
    public interface Presenter
    {
        public fun onClick(view:android.view.View)
    }
}