package com.kotlin.kumar.mvpdemo.model

import com.kotlin.kumar.mvpdemo.contract.MainActivityContract
import java.io.Serializable

/**
 * Created by Siddhant on 13/03/18.
 */
public class MainActivityModel:Serializable,MainActivityContract.Model
{


    // get method to provide data
    public override fun getData():String
    {
        return "Hello World"
    }
}