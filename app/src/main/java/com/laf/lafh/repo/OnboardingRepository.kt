package com.laf.lafh.repo

import android.content.Context
import com.laf.lafh.R
import com.laf.lafh.models.OnboardingModel

interface OnboardingRepositoryExpected {
    fun getAllModels(): ArrayList<OnboardingModel>
}

class OnboardingRepository(private val context: Context) : OnboardingRepositoryExpected {
    override fun getAllModels(): ArrayList<OnboardingModel> {
        return arrayListOf(
            OnboardingModel(context.getString(R.string.lafh_onboarding_description_1), context.getString(R.string.lafh_button_text)),
            OnboardingModel(context.getString(R.string.lafh_onboarding_description_2), context.getString(R.string.lafh_button_text)),
            OnboardingModel(context.getString(R.string.lafh_onboarding_description_3), context.getString(R.string.lafh_button_text))
        )
    }
}