package com.huifeideyema.jetpak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.huifeideyema.jetpak.model.UserData
import com.huifeideyema.jetpak.view_model.UserViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userViewModel = ViewModelProvider.
        userViewModel.getUser().observe(this, Observer<UserData> { userData ->
            tv_hello.text = userData.userName
        })

        val usrData = UserData()
        usrData.userName = "萧莉斯"
        usrData.address = "河南"
        userViewModel.getUser().value = usrData
    }
}
