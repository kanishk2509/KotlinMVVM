package com.kappstudio.apps.mvvm_sample.View.activity

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.kappstudio.apps.mvvm_sample.Bus.Event.PostEvent
import com.kappstudio.apps.mvvm_sample.R

class MainActivity : AppCompatActivity(), PostEvent {

    private var toast : Toast? = null

    override fun onDataReceived() {
        toast!!.setText("hello")
    }

    override fun onDataUpdated() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private var mTextMessage: TextView? = null

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                mTextMessage!!.setText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                mTextMessage!!.setText(R.string.title_dashboard)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                mTextMessage!!.setText(R.string.title_notifications)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mTextMessage = findViewById(R.id.message) as TextView
        val navigation = findViewById(R.id.navigation) as BottomNavigationView
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        toast!!.setText("Hello")
    }

    override fun onStop() {
        Log.e("Hello", "Stopping activity")
        super.onStop()
    }

}
