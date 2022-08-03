package com.example.breakingnews.data.data

import com.example.breakingnews.R
import com.example.breakingnews.data.data.model.NewsArticle

class Repository {

  fun loadNews(): List<NewsArticle> {

    return listOf(
      NewsArticle(
        1,
        "Deutsche Frauen werden EM 2. !",
        R.drawable.frauenem,
        location = "England",
        "31.07.2022",
        "Leider hat es nicht zum Sieg gereicht, das Spiel wurde 2:1 verloren"

      ),
      NewsArticle(
        2,
        "Holland und das Wasser !!!",
        R.drawable.klima,
        "Holland",
        "01.08.2022",
        "zu wenig Wasser in Holland , durch den Klimawandel"
      ),
      NewsArticle(
        3,
        "Kanzler weiter schweigsam !!!",
        R.drawable.kanzler,
        "Berlin",
        "01.08.2022",
      "Der Kanzelr ist weiterhin zurück haltend mit seinen Äusserungen zum Klima , zur Energie, zum Krieg"
      ),
      NewsArticle(
        4,
        "Corona was kommt im Herbst auf uns zu ?",
        R.drawable.corona,
        "Berlin",
        "01.08.2022",
      "wird es im Herbst eine neue Welle geben und wenn wird es wieder einen Lockdown geben?"
      ),
      NewsArticle(
        5,
        "Energieversorgung im Herbst !!",
        R.drawable.fakten,
        "Berlin",
        "01.08.2022",
        "wird es einen kalten Winter geben, haben wir genügend Gas und Öl ? "

      )
    )
  }
}