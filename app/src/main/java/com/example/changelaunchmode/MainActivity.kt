package com.example.changelaunchmode

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.targetButton)
        button.setOnClickListener {
            if(Build.VERSION.SDK_INT >= 26) {
                val intent = Intent(this, TargetActivity::class.java)
                startActivity(intent)
            }else{
                val intent = Intent(this, TargetActivityStandart::class.java)
                startActivity(intent)
            }
        }
    }
}