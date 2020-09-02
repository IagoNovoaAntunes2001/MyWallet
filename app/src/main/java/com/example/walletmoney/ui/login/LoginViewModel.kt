package com.example.walletmoney.ui.login

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel

class LoginViewModel(application: Application): AndroidViewModel(application)  {

    fun googleButton() {
        Log.i("MYTAG", "GOOGLE BUTTON")
    }

    fun facebookButton() {
        Log.i("MYTAG", "FACEBOOK BUTTON")
    }
}