package com.example.netflix

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.netflix.databinding.ProfileBinding

class ProfileFragment : Fragment(R.layout.profile) {
    private lateinit var binding: ProfileBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = ProfileBinding.bind(view)

        val navArgs: ProfileFragmentArgs by navArgs()

        with(binding) {

            profileImage.setImageURI(navArgs.imageUri)
            tvFirstName.text = navArgs.firstname
            tvUserName.text = navArgs.username
            tvEmail.text = navArgs.email
            tvLastName.text = navArgs.lastname
            tvPhoneNumber.text = navArgs.phonenumber
        }
    }
}