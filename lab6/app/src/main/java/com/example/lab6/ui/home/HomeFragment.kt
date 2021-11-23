package com.example.lab6.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.lab6.R
import com.example.lab6.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })


        binding.btnQuestionsList.setOnClickListener{view:View->view.findNavController().navigate(R.id.action_nav_home_to_nav_questions)};
        binding.btnCreateQuestion.setOnClickListener{view:View->view.findNavController().navigate(R.id.action_nav_home_to_nav_new_question)};
        binding.btnQuizTime.setOnClickListener{view:View->view.findNavController().navigate(R.id.action_nav_home_to_nav_quiz_time)};
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}