package com.example.breakingnews.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.example.breakingnews.MainViewModel
import com.example.breakingnews.adapter.NewsAdapter
import com.example.breakingnews.databinding.FragmentHomeBinding

class Homefragment : Fragment() {

  private lateinit var binding: FragmentHomeBinding
  private val viewModel: MainViewModel by activityViewModels()

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    binding = FragmentHomeBinding.inflate(inflater)

    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    viewModel.news.observe(
      viewLifecycleOwner,
      Observer {

        binding.homeNewsRecycler.adapter = NewsAdapter(it)
      }
    )
  }


}