package com.example.viewpagerindicatordemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.viewpagerindicatordemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPager = binding.viewpager
        val indicator = binding.indicator

        setUpViewPager(viewPager)
        indicator.setViewPager(viewPager)


    }

    private fun setUpViewPager(viewPager: ViewPager){
        var adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(FirstFragment())
        adapter.addFragment(SecondFragment())

        viewPager.adapter = adapter
    }
}