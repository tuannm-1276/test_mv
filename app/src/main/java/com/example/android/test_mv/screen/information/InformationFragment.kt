package com.example.android.test_mv.screen.information

import com.example.android.test_mv.R
import com.example.android.test_mv.base.BaseFragment

class InformationFragment : BaseFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_information

    override fun initComponents() {
        TODO("Not yet implemented")
    }

    companion object {
        private var instance: InformationFragment? = null
        fun newInstance(): InformationFragment = instance ?: InformationFragment()
            .also { instance = it }
    }
}
