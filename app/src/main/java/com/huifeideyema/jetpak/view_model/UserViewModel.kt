package com.huifeideyema.jetpak.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.huifeideyema.jetpak.model.UserData

/**
 * @author : mr.zang
 * description
 * createDate: 2020-01-06 17:28
 */
class UserViewModel : ViewModel() {

    fun getUser(): MutableLiveData<UserData> {
        return loaderUser()
    }

    private fun loaderUser(): MutableLiveData<UserData> {
        return MutableLiveData()
    }

}