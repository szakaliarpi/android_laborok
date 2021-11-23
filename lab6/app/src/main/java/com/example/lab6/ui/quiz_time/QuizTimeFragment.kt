package com.example.lab6.ui.quiz_time

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lab6.databinding.QuizTimeBinding
import com.example.lab6.ui.home.QuizTimeViewModel

class QuizTimeFragment : Fragment() {

    private lateinit var quizTimeViewModel: QuizTimeViewModel
    private var _binding: QuizTimeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        quizTimeViewModel =
            ViewModelProvider(this).get(QuizTimeViewModel::class.java)

        _binding = QuizTimeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSlideshow
        quizTimeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}