package com.sammy.extensionsdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.* // extension Used here
// Note  - Please check build.gradle of App
/*
apply plugin: 'kotlin-android-extensions' it is used to enable mapping of layout id to activity
we can use it in fragment as well
 */

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun sumbit(view: View)
    {
        if(etName.text.isNullOrBlank())
        {
            Toast.makeText(this,"Please enter username",Toast.LENGTH_LONG).show()

        }
        else if(etPassword.text.isNullOrEmpty())
        {
            Toast.makeText(this,"Please enter password",Toast.LENGTH_LONG).show()
        }
        else
        {
            Toast.makeText(this,"Thank You",Toast.LENGTH_LONG).show()
        }
    }


}
