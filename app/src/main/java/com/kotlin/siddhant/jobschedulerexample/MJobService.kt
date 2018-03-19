package com.kotlin.siddhant.jobschedulerexample

import android.app.job.JobParameters
import android.app.job.JobService
import android.widget.Toast
import android.widget.TextView



/**
 * Created by Siddhant on 19/03/18.
 */
public open class JobScheduler: JobService()
{
    var mJobExecuter:JobExecuter?=null
    override fun onStopJob(p0: JobParameters?): Boolean {

        // it cancels job
        mJobExecuter?.cancel(true)
        return false
    }



    override fun onStartJob(p0: JobParameters?): Boolean {
        mJobExecuter= JobExecuter(applicationContext)

        mJobExecuter?.execute()
        return true
    }

}