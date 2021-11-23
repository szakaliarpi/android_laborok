package com.example.lab6.ui.list_of_questions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab6.CustomAdapter
import com.example.lab6.constants.Constants
import com.example.lab6.databinding.FragmentHomeBinding
import com.example.lab6.databinding.ListOfQuestionsBinding
import com.example.lab6.ui.home.HomeViewModel

class ListOfQuestionsFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: ListOfQuestionsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = ListOfQuestionsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        recyclerView = binding.recyclerView

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                context,
                DividerItemDecoration.VERTICAL
            )
        )

        recyclerView.adapter = CustomAdapter(Constants.getQuestions())

        return root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}