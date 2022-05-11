package com.apps.whitelabelapps

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.apps.whitelabelsapp.BuildConfig
import com.apps.whitelabelsapp.R

class SecondActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        findViewById<TextView>(R.id.text_view).text =
            "Welcome to ${BuildConfig.FLAVOR} Second Activity."
    }
}