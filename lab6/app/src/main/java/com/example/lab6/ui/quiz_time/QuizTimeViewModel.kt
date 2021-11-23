package com.example.lab6.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuizTimeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Quiz Time Fragment"
    }
    val text: LiveData<String> = _text
}