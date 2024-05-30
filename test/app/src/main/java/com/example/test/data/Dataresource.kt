package com.example.affirmations.data
import Affirmation
import com.example.test.R

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf(
            Affirmation(R.string.affirmation1, R.string.day1, R.string.description1, R.drawable.anh1),
            Affirmation(R.string.affirmation2, R.string.day2, R.string.description2, R.drawable.anh2),
            Affirmation(R.string.affirmation3, R.string.day3, R.string.description3, R.drawable.anh3),
            Affirmation(R.string.affirmation4, R.string.day4, R.string.description4, R.drawable.anh4),
            Affirmation(R.string.affirmation5, R.string.day5, R.string.description5, R.drawable.anh5),
            Affirmation(R.string.affirmation6, R.string.day6, R.string.description6, R.drawable.anh6),
            Affirmation(R.string.affirmation7, R.string.day7, R.string.description7, R.drawable.anh7),
            Affirmation(R.string.affirmation8, R.string.day8, R.string.description8, R.drawable.anh8),
            Affirmation(R.string.affirmation9, R.string.day9, R.string.description9, R.drawable.anh9),
            Affirmation(R.string.affirmation10, R.string.day10, R.string.description10, R.drawable.anh10)
        )
    }
}