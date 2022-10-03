package com.asifddlks.androidactivtylifecycleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showLog("onCreate")
        showToast("onCreate")
    }

    override fun onStart() {
        super.onStart()

        showLog("onStart")
        showToast("onStart")
    }

    override fun onRestart() {
        super.onRestart()

        showLog("onRestart")
        showToast("onRestart")
    }

    override fun onResume() {
        super.onResume()

        showLog("onResume")
        showToast("onResume")
    }

    override fun onPause() {
        super.onPause()

        showLog("onPause")
        showToast("onPause")
    }

    override fun onStop() {
        super.onStop()

        showLog("onStop")
        showToast("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        showLog("onDestroy")
        showToast("onDestroy")
    }

    fun showToast(msg:String){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
    }

    fun showLog(msg:String){
        Log.d(TAG, msg)
    }
}