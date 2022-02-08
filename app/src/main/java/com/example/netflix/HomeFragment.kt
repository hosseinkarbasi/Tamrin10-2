package com.example.netflix

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.netflix.databinding.HomeBinding

class HomeFragment : Fragment(R.layout.home) {

    private lateinit var binding: HomeBinding
    private val registerViewModel: RegisterViewModel by activityViewModels()
    private val homeViewModel: HomeViewModel by activityViewModels()
    private val favorites = Array(7) {
        arrayOfNulls<CheckBox>(
            3
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = HomeBinding.bind(view)

        for (i in 0..6) {
            for (j in 0..2) {
                val id = resources.getIdentifier("favCheck_$i$j", "id", context?.packageName)
                favorites[i][j] = view.findViewById(id)

                registerViewModel.isRegisterLiveData.observe(viewLifecycleOwner) { isRegister ->
                    if (isRegister) {
                        favorites[i][j]?.visibility = View.VISIBLE
                    }
                    if (binding.favCheck00.isChecked) {
                        homeViewModel.favorite()
                    }
                }
            }
        }
    }
}







