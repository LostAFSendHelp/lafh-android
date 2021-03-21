package com.laf.lafh.viewModels

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.laf.lafh.models.OnboardingModel
import com.laf.lafh.repo.OnboardingRepositoryExpected

class OnboardingFragmentViewModel(): ViewModel() {
    private lateinit var repo: OnboardingRepositoryExpected
    private val models: MutableLiveData<ArrayList<OnboardingModel>> = MutableLiveData()

    fun getData(): LiveData<ArrayList<OnboardingModel>> {
        return models
    }

    fun fetchAllModels() {
        models.postValue(repo.getAllModels())
    }

    class Factory(private val repo: OnboardingRepositoryExpected): ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            val vm = OnboardingFragmentViewModel()
            vm.repo = repo

            return vm as T
        }

    }
}