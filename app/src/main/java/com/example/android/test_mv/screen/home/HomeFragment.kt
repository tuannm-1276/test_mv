package com.example.android.test_mv.screen.home

import com.example.android.test_mv.R
import com.example.android.test_mv.base.BaseFragment

class HomeFragment : BaseFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_home

    override fun initComponents() {
        TODO("Not yet implemented")
    }

    companion object {
        private var instance: HomeFragment? = null
        fun newInstance(): HomeFragment = instance ?: HomeFragment()
            .also { instance = it }
    }
}
