package com.jan.jmoviesdb.ui.main

import com.jan.jmoviesdb.R
import com.jan.jmoviesdb.baseui.BaseActivity
import com.jan.jmoviesdb.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    override fun layoutRes(): Int = R.layout.activity_main
}