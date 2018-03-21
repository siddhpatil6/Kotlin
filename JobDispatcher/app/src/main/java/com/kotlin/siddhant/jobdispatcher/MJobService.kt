package com.kotlin.siddhant.jobdispatcher

import com.firebase.jobdispatcher.JobService


/**
 * Created by Siddhant on 21/03/18.
 */
public class MJobService:JobService()
{
    override fun onStopJob(job: com.firebase.jobdispatcher.JobParameters?): Boolean {

        return true
    }

    override fun onStartJob(job: com.firebase.jobdispatcher.JobParameters?): Boolean {
        var backGroundTask=BackGroundTask(applicationContext)
        backGroundTask.execute()
        if (job != null) {
            jobFinished(job,false)
        }
        return true
    }

}