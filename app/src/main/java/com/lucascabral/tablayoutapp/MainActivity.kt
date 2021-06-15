package com.lucascabral.tablayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lucascabral.tablayoutapp.adapter.PageAdapter
import com.lucascabral.tablayoutapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            mainViewPager.adapter = PageAdapter(supportFragmentManager)
            mainTabLayout.setupWithViewPager(mainViewPager)
        }
    }
}