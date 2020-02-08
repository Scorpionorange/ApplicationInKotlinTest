package com.example.applicationinkotlintest

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        show()
    }

    fun show(){
        var output:String = "Hello World"
        var tw = findViewById(R.id.output) as TextView
        tw.setText(output)
    }

}
