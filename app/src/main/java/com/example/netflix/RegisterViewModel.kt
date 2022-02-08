package com.example.netflix

import android.net.Uri
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController

class RegisterViewModel : ViewModel() {

    val isRegisterLiveData: MutableLiveData<Boolean> = MutableLiveData()

    init {
        isRegisterLiveData.value = false
    }

    fun signUp(
        userName: String,
        firstName: String,
        lastName: String,
        email: String,
        phoneNumber: String,
        imageAddresses: Uri,
        nav: Fragment
    ) {
        nav.findNavController().navigate(
            RegisterFragmentDirections.actionRegisterFragmentToProfileFragment(
                userName,
                firstName,
                lastName,
                email,
                phoneNumber,
                imageAddresses
            )
        )

    }

    fun isRegister() {
        isRegisterLiveData.value = true
    }

}
