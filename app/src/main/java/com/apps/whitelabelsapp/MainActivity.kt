package com.apps.whitelabelsapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.apps.whitelabelapps.SecondActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.text_view)
        textView.text = BuildConfig.FLAVOR

        findViewById<MaterialButton>(R.id.btn_next).setOnClickListener {
            startActivity(Intent(applicationContext, SecondActivity::class.java))
        }
    }
}