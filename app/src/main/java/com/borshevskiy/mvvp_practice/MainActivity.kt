package com.borshevskiy.mvvp_practice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.borshevskiy.mvvp_practice.databinding.ActivityMainBinding
import com.borshevskiy.mvvp_practice.utils.ACTIVITY_APP

class MainActivity : AppCompatActivity() {

    lateinit var mNavController: NavController

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ACTIVITY_APP = this
        mNavController = Navigation.findNavController(this,R.id.nav_host_fragment)
        setSupportActionBar(binding.toolbar)
        title = getString(R.string.title)
    }
}