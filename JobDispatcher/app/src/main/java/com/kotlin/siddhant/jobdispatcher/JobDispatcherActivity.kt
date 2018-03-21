package com.kotlin.siddhant.jobdispatcher

import android.app.job.JobScheduler
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.firebase.jobdispatcher.*
import kotlinx.android.synthetic.*

class JobDispatcherActivity : AppCompatActivity() {
    var jobDispatcher:FirebaseJobDispatcher?=null
    var mJob:JobService?=null
    companion object {
        public var JOB_TAG="101"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job_dispatcher)




    }
    public fun startJob(view: View)
    {

        jobDispatcher=FirebaseJobDispatcher(GooglePlayDriver(this)) // Firebase Dispatcher initialized

        var mJob:Job= jobDispatcher!!.newJobBuilder().
                setLifetime(Lifetime.FOREVER).  // here we set life time of job  // UNITL_NEXT_BOOT option is available
                setService(MJobService::class.java). // we set JobService which we want to run in background
                setRecurring(true).
                setConstraints(Constraint.ON_ANY_NETWORK).
                setRetryStrategy(RetryStrategy.DEFAULT_EXPONENTIAL).
                setTrigger(Trigger.executionWindow(10,15)). // it will decide starting point where job will start running and job interval
                setTag(JOB_TAG).build() // job tag set to identify job
        jobDispatcher!!.mustSchedule(mJob)
        Toast.makeText(this,"Job Started",Toast.LENGTH_LONG).show()
    }
    public fun stopJob(view: View)
    {
        jobDispatcher?.cancel(JOB_TAG)
    }
}
