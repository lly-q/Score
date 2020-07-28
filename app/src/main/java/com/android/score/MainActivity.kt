package com.android.score

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.android.score.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding:ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val  viewModel:MyViewModel = ViewModelProvider.AndroidViewModelFactory(application).create(MyViewModel::class.java)
        binding.data =viewModel
        binding.lifecycleOwner = this

    }
}