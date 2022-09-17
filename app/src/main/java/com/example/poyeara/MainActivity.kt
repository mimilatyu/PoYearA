package com.example.poyeara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.poyeara.databinding.ActivityMainBinding
import com.example.poyeara.fragments.MainFragment

class MainActivity : AppCompatActivity() {


    //при создании мэйнАктивити
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.placeHolder, MainFragment.newInstance()).commit()
    }
}