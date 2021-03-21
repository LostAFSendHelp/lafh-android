package com.laf.lafh.fragments

import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.laf.lafh.R
import com.laf.lafh.utils.LafStdLog

class SplashFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.actionBar?.hide()
        LafStdLog.debugFuncCalled(this, this::onCreate.name)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        LafStdLog.debugFuncCalled(this, this::onCreateView.name)
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onStart() {
        super.onStart()
        LafStdLog.debugFuncCalled(this, this::onStart.name)
        Handler().postDelayed({
            findNavController().navigate(R.id.action_splashFragment_to_onboardingFragment)
        }, 2000)
    }

    override fun onDestroy() {
        super.onDestroy()
        LafStdLog.debugFuncCalled(this, this::onDestroy.name)
    }
}