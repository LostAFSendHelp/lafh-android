package com.laf.lafh.repo

import android.content.Context
import com.laf.lafh.R
import com.laf.lafh.models.OnboardingModel

interface OnboardingRepositoryExpected {
    val onboardingModels: ArrayList<OnboardingModel>
}

class OnboardingRepository(val context: Context) : OnboardingRepositoryExpected {
    override val onboardingModels: ArrayList<OnboardingModel> = arrayListOf(
        OnboardingModel(context.getString(R.string.lafh_onboarding_description_1), context.getString(R.string.lafh_button_text)),
        OnboardingModel(context.getString(R.string.lafh_onboarding_description_2), context.getString(R.string.lafh_button_text)),
        OnboardingModel(context.getString(R.string.lafh_onboarding_description_3), context.getString(R.string.lafh_button_text))
    )
}