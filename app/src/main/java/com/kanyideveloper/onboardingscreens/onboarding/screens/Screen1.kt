package com.kanyideveloper.onboardingscreens.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.kanyideveloper.onboardingscreens.R

class Screen1 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_screen1, container, false)

        val viewPager: ViewPager2? = activity?.findViewById(R.id.viewPager2)
        val next1: TextView = view.findViewById(R.id.next)

        next1.setOnClickListener {
            viewPager?.currentItem = 1
        }
        return view
    }
}