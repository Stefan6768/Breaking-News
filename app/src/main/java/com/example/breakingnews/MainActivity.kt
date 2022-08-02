package com.example.breakingnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.breakingnews.adapter.NewsAdapter
import com.example.breakingnews.data.data.Repository
import com.example.breakingnews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    val repository = Repository()

    val newsList = repository.loadNews()

    binding.newsRecycler.adapter = NewsAdapter(newsList)

  }
}