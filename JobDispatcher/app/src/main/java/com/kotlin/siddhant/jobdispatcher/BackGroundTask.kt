package com.kotlin.siddhant.jobdispatcher

import android.content.Context
import android.os.AsyncTask
import android.widget.Toast

/**
 * Created by Siddhant on 21/03/18.
 */
public class BackGroundTask(context: Context):AsyncTask<Any,Any,String>()
{
    var contex=context
    override fun doInBackground(vararg p0: Any?): String {

        return "completed"
    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
        Toast.makeText(contex,"background task is "+result,Toast.LENGTH_LONG).show()
    }


}