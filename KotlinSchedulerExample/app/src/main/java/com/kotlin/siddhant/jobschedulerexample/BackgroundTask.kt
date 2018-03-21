package com.kotlin.siddhant.jobschedulerexample

import android.content.Context
import android.os.AsyncTask
import android.widget.Toast

/**
 * Created by Siddhant on 19/03/18.
 */
public class BackgroundTask(context:Context) : AsyncTask<Any, Any, String>()
{
    var context=context
    override fun doInBackground(vararg p0: Any?): String {

        return "Job Scheduled Task Completed....."
    }

    override fun onPostExecute(result: String?) {

        Toast.makeText(context,result,Toast.LENGTH_LONG).show()

    }
}