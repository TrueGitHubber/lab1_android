package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text = "Create"
        Log.d("MY_LOG", text)
        Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        var text = "Pause"
        Log.d("MY_LOG", text)
        Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        var text = "Destroy"
        Log.d("MY_LOG", text)
        Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        var text = "Start"
        Log.d("MY_LOG", text)
        Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        var text = "Resume"
        Log.d("MY_LOG", text)
        Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        var text = "Stop"
        Log.d("MY_LOG", text)
        Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
    }
}
