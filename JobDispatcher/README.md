#Job Dispatcher
From android Oreo onward there is strict limitations in execution background services. The android team block many broadcast receivers and limit the number of background task for improving performance and ensure extended battery life for the device.   

Google recommend android developers to use Job Scheduler API for performing background operations. But the problem is that the Job Scheduler API is available from android API 21 and above. If your app target API 21 and above then you can go for the Framework Job Scheduler API. If your app support lower than API 21 then you can use the firebase jobdispatcher for scheduling background job.  
The firebase Jobdispatcher available from android API 9 and above. For the Firebase Dispatcher the only thing needed is the Google Play Service, because it use the Google Play service for the background service execution. 
