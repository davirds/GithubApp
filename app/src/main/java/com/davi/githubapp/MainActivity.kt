package com.davi.githubapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.davi.githubapp.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(android.R.id.content, MainFragment.newInstance())
                .commitNow()
        }
    }
}
