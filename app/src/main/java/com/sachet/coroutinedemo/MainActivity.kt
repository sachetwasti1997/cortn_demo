package com.sachet.coroutinedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CoroutineScope(Dispatchers.IO).launch {
            for (i in 1..2000000){
                Log.i("TTTTAAAAAAGGGGGGGGG1111", "onCreate: $i ${Thread.currentThread().name}")
            }//This process is running in the background so will not effect the Main Thread
        }
//        CoroutineScope(Dispatchers.Main).launch {
//            for (i in 1..200000){
//                Log.i("TTTTAAAAAAGGGGGGGGG2222", "onCreate: $i ${Thread.currentThread().name}")
//            }
//        }
    }
}