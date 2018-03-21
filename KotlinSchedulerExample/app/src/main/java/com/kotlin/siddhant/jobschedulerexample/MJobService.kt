package com.kotlin.siddhant.jobschedulerexample

import android.app.job.JobParameters
import android.app.job.JobService


/**
 * Created by Siddhant on 19/03/18.
 */
public open class MJobService: JobService()
{
    var mBackgroundTask:BackgroundTask?=null
    override fun onStopJob(p0: JobParameters?): Boolean {

        // it cancels job
        mBackgroundTask?.cancel(true)
        return false
    }



    override fun onStartJob(p0: JobParameters?): Boolean {
        mBackgroundTask= BackgroundTask(applicationContext)

        mBackgroundTask?.execute()
        jobFinished(p0,false)
        return true
    }

}