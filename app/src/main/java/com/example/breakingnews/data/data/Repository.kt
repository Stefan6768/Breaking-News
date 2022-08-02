package com.example.breakingnews.data.data

import com.example.breakingnews.R
import com.example.breakingnews.data.data.model.NewsArticle

class Repository {

  fun loadNews(): List<NewsArticle> {

    return listOf(
      NewsArticle(
        "Deutsche Frauen werden EM 2. !",
        R.drawable.frauenem,
        location = "England Wembley",
        "31.07.2022"
      ),
      NewsArticle(
        "Holland und das Wasser !!!",
        R.drawable.klima,
        "Holland",
        "01.08.2022",
      ),
      NewsArticle(
        "Kanzler weiter schweigsam !!!",
        R.drawable.kanzler,
        "Berlin",
        "01.08.2022"
      ),
      NewsArticle(
        "Corona was kommt im Herbst auf uns zu ?",
        R.drawable.corona,
        "Berlin",
        "01.08.2022"
      ),
      NewsArticle(
        "Wie steht es um unsere Energieversorgung",
        R.drawable.fakten,
        "Berlin",
        "01.08.2022"
      )
    )
  }
}