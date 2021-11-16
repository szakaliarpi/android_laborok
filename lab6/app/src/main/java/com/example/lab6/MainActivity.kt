package com.example.lab6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.lab6.fragments.*

class MainActivity : AppCompatActivity() {

    private val homeFragment = HomeFragment()
    private val QuizTimeFragment = QuizTimeFragment()
    private val profileFragment = ProfileFragment()
    private val listOfQuestionsFragment = ListOfQuestionsFragment()
    private val newQuestionFragment = NewQuestionFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(homeFragment)


    }


    private fun replaceFragment(fragment: Fragment){
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }

}