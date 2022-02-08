package com.example.netflix

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.netflix.databinding.ComingsoonBinding

class ComingSoonFragment : Fragment(R.layout.comingsoon) {
    private lateinit var binding: ComingsoonBinding
    private val comingSoonViewModel: RegisterViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = ComingsoonBinding.bind(view)

        with(binding) {
            comingSoonViewModel.isRegisterLiveData.observe(viewLifecycleOwner) { isRegister ->
                if (isRegister) {
                    shareBtn01.visibility = View.VISIBLE
                    shareBtn02.visibility = View.VISIBLE
                    shareBtn03.visibility = View.VISIBLE
                }
            }
            shareBtn01.setOnClickListener {
                shareMovieTitle(title01.text.toString())
            }

            shareBtn02.setOnClickListener {
                shareMovieTitle(title02.text.toString())
            }

            shareBtn03.setOnClickListener {
                shareMovieTitle(title03.text.toString())
            }
        }
    }

    private fun shareMovieTitle(text: String) {
        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, text)
            type = "text/plain"
        }
        val shareIntent = Intent.createChooser(sendIntent, null)
        startActivity(shareIntent)
    }
}




