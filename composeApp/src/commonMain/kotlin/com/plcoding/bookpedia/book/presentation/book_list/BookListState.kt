package com.plcoding.bookpedia.book.presentation.book_list

import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResult: List<Book> = books,
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorText: UiText? = null
)

private val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book ${it}",
        imageUrl = "https://test.com",
        authors = listOf("Harsh Mistry"),
        description = "Description ${it}",
        languages = emptyList(),
        firstPublishYear = null,
        averageRating = 4.6565,
        ratingCount = 5,
        numPages = 100,
        numEditions = 3,
    )
}
