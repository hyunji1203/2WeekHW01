package com.example.a2weekhw01

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LIstViewModel : ViewModel() {

    private val repo = Repo()

    fun fetchData(): LiveData<MutableList<User>> {
        val mutableData = MutableLiveData<MutableList<User>>()
        repo.getData().observeForever{
            mutableData.value = it
        }

        return mutableData
    }
}