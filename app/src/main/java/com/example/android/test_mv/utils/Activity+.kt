package com.example.android.test_mv.utils

import androidx.fragment.app.Fragment
import com.example.android.test_mv.MainActivity
import com.example.android.test_mv.R

fun MainActivity.switchFragment(fragment: Fragment) {
    supportFragmentManager
        .beginTransaction()
        .addToBackStack(null)
        .replace(R.id.frameContainer, fragment)
        .commit()
}
