package com.example.netflix

import android.os.Bundle
import android.util.Patterns
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.netflix.databinding.RegisterBinding

class RegisterFragment : Fragment(R.layout.register) {
    private lateinit var binding: RegisterBinding
    private val navController by lazy { findNavController() }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = RegisterBinding.bind(view)

        with(binding) {
            btnRegister.setOnClickListener {

                val firstName = edFirstName.text.toString()
                val lastName = edLastName.text.toString()
                val userName = edUserName.text.toString()
                val email = edEmail.text.toString()
                val phoneNumber = edPhoneNumber.text.toString()

                if (!validateEmail() || !validateFirstName() || !validateLastName()) {
                    return@setOnClickListener
                } else {
                    navController.navigate(
                        RegisterFragmentDirections.actionRegisterFragmentToProfileFragment(
                            userName,
                            firstName,
                            lastName,
                            email,
                            phoneNumber
                        )
                    )
                }
            }
        }
    }


    private fun validateFirstName(): Boolean {
        return if (binding.edFirstName.text!!.isEmpty()) {
            binding.textInputFirstName.error = "Field can not be empty"
            false
        } else {
            binding.textInputFirstName.error = null
            true
        }
    }

    private fun validateLastName(): Boolean {
        return if (binding.edLastName.text!!.isEmpty()) {
            binding.textInputLastName.error = "Field can not be empty"
            false
        } else {
            binding.textInputLastName.error = null
            true
        }
    }

    private fun validateEmail(): Boolean {
        return if (binding.edEmail.text!!.isEmpty()) {
            binding.textInputEmail.error = "Field can not be empty"
            false
        } else if (!Patterns.EMAIL_ADDRESS.matcher(binding.edEmail.text.toString()).matches()) {
            binding.textInputEmail.error = "Please enter a valid email address"
            false
        } else {
            binding.textInputEmail.error = null
            true
        }
    }
}




