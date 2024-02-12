package com.example.logsandlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Log.d--> Debugging
        //Log.e-->Error
        //Log.w-->Warning
        //Log.i -->Info
        //Log.v-->Verbose
        //syntax
        //log.d("tag","your Msg")
        Log.w("logexample","Oncreate Method Entered")
           //onCreate
          //onResume
         //onStart
        //OnPause
       //onRestart
      //onDestory
     // onStop
    }

    override fun onStart()
    {
        super.onStart()
        Log.w("logexample","onStart Method Entered")
    }

    override fun onResume()
    {
        super.onResume()

        Log.w("logexample","onResume Method Entered")
    }

    override fun onRestart()
    {
        super.onRestart()
        Log.w("logexample","onRestart Method Entered")
    }

    override fun onPause()
    {
        super.onPause()
        Log.w("logexample","onPause Method Entered")
    }

    override fun onStop()
    {
        super.onStop()
        Log.w("logexample","onStop Method Entered")

    }

    override fun onDestroy()
    {
        super.onDestroy()
        Log.w("logexample","onDestroy Method Entered")
    }
}