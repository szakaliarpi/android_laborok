package com.example.lab6.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NewQuestionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is NewQuestion Fragment"
    }
    val text: LiveData<String> = _text
}