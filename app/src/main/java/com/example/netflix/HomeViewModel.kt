package com.example.netflix

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    val movieBank1 = mutableListOf(
        MovieItem(R.id.cardView01, false),
        MovieItem(R.id.cardView02, false),
        MovieItem(R.id.cardView03, false),
        MovieItem(R.id.cardView04, false),
        MovieItem(R.id.cardView05, false),
        MovieItem(R.id.cardView06, false),
        MovieItem(R.id.cardView07, false),
        MovieItem(R.id.cardView08, false),
        MovieItem(R.id.cardView09, false),
        MovieItem(R.id.cardView10, false),
        MovieItem(R.id.cardView11, false),
        MovieItem(R.id.cardView12, false),
        MovieItem(R.id.cardView13, false),
        MovieItem(R.id.cardView14, false),
        MovieItem(R.id.cardView15, false),
        MovieItem(R.id.cardView16, false),
        MovieItem(R.id.cardView17, false),
        MovieItem(R.id.cardView18, false),
        MovieItem(R.id.cardView19, false),
        MovieItem(R.id.cardView20, false),
        MovieItem(R.id.cardView21, false)
    )

    val fav: MutableLiveData<Boolean> = MutableLiveData()

    init {
        fav.value = false
    }

    fun favorite() {
        fav.value = true
    }

}