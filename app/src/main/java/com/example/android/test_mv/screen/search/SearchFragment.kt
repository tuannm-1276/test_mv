package com.example.android.test_mv.screen.search

import com.example.android.test_mv.R
import com.example.android.test_mv.base.BaseFragment

class SearchFragment : BaseFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_search

    override fun initComponents() {
        TODO("Not yet implemented")
    }

    companion object {
        private var instance: SearchFragment? = null
        fun newInstance(): SearchFragment = instance ?: SearchFragment()
            .also { instance = it }
    }
}
