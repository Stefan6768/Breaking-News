package com.example.breakingnews

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.breakingnews.data.data.Repository
import com.example.breakingnews.data.data.model.NewsArticle

class MainViewModel : ViewModel() {

  private val repository = Repository()

  private val _news = MutableLiveData<List<NewsArticle>>()
  val news: LiveData<List<NewsArticle>>
  get() = _news

  init {
    _news.value = repository.loadNews()
  }

}