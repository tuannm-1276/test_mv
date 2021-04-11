package com.example.android.test_mv.screen.favorite

import com.example.android.test_mv.R
import com.example.android.test_mv.base.BaseFragment

class FavoriteFragment : BaseFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_favorite

    override fun initComponents() {
        TODO("Not yet implemented")
    }

    companion object {
        private var instance: FavoriteFragment? = null
        fun newInstance(): FavoriteFragment = instance ?: FavoriteFragment()
            .also { instance = it }
    }
}
