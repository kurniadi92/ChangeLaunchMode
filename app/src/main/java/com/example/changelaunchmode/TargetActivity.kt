package com.example.changelaunchmode

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

open class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.target_activity)
    }
}

class TargetActivityStandart: TargetActivity() {

}