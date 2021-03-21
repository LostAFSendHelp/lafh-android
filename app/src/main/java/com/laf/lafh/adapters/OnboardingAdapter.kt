package com.laf.lafh.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.laf.lafh.fragments.OnboardingScreenFragment
import com.laf.lafh.models.OnboardingModel

class OnboardingAdapter(activity: AppCompatActivity, private val models: ArrayList<OnboardingModel>) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return models.count();
    }

    override fun createFragment(position: Int): Fragment {
        return OnboardingScreenFragment.newInstance(models[position])
    }
}