package com.example.netflix

import androidx.lifecycle.ViewModel

class MovieViewModel : ViewModel() {
    private val movieImgBank = listOf(
        MovieItem(R.drawable.movie01, "1917", false),
        MovieItem(R.drawable.movie02, "355", false),
        MovieItem(R.drawable.movie03, "Above Suspicion", false),
        MovieItem(R.drawable.movie04, "Batman", false),
        MovieItem(R.drawable.movie05, "Belfast", false),
        MovieItem(R.drawable.movie06, "Boss Baby", false),
        MovieItem(R.drawable.movie07, "Capone", false),
        MovieItem(R.drawable.movie08, "Don't Look Up", false),
        MovieItem(R.drawable.movie09, "Finch", false),
        MovieItem(R.drawable.movie10, "Gretel And Hansel", false),
        MovieItem(R.drawable.movie11, "Hitman Wifes Bodyguard", false),
        MovieItem(R.drawable.movie12, "News World", false),
        MovieItem(R.drawable.movie13, "Nobody", false),
        MovieItem(R.drawable.movie14, "No Time To Die", false),
        MovieItem(R.drawable.movie15, "Scream", false),
        MovieItem(R.drawable.movie16, "Spider Man", false),
        MovieItem(R.drawable.movie17, "The Guilty", false),
        MovieItem(R.drawable.movie18, "Tenet", false),
        MovieItem(R.drawable.movie19, "The Power Of The Dog", false),
        MovieItem(R.drawable.movie20, "Venom", false),
        MovieItem(R.drawable.movie21, "Wrath Of Man", false)
    )
}