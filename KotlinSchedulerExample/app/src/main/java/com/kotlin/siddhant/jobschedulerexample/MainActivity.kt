package com.kotlin.siddhant.jobschedulerexample

import android.app.job.JobInfo
import android.app.job.JobScheduler
import android.content.ComponentName
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    companion object {
        final var JOB_ID=101
    }
    var jobScheduler:JobScheduler?=null
    var jobInfo:JobInfo?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // first we passed our scheduler (JobService) class to component Name
        var componentName=ComponentName(this,com.kotlin.siddhant.jobschedulerexample.MJobService::class.java)
        var builder=JobInfo.Builder(JOB_ID,componentName) // we build Job here and assign job id to identify JOB Uniquely
        builder.setPeriodic(5000) // we set Period for job to be executed
        builder.setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY) // to define required network type
        builder.setPersisted(true) //if set true this job will exist after system reboot as well
       // builder.setRequiresBatteryNotLow(true) // schedule job when battery not low
        //builder.setRequiresStorageNotLow(true)  // schedule job when Storage is not low
        builder.setRequiresCharging(true)    // schedule job when charging
        jobInfo=builder.build()
        jobScheduler= getSystemService(Context.JOB_SCHEDULER_SERVICE) as JobScheduler?
    }
    public fun startSchedule(view: View)
    {
        jobScheduler?.schedule(jobInfo) // here we schedule job with job info
        Toast.makeText(this,"Job Scheduled...",Toast.LENGTH_LONG).show()

    }
    public fun endSchedule(view: View)
    {
        jobScheduler?.cancel(JOB_ID) // cancels job with JOB_ID which was assigned to Job
    }
}

