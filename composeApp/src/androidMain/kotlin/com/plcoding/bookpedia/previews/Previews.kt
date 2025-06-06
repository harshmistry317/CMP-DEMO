package com.plcoding.bookpedia.previews

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreen
import com.plcoding.bookpedia.book.presentation.book_list.BookListState
import com.plcoding.bookpedia.book.presentation.book_list.components.BookSearchBar

@Preview(showBackground = true)
@Composable
fun BookSearchBarPreview() {
    MaterialTheme {
        BookSearchBar(
            searchQuery = "kotlin",
            onSearchQueryChange = {},
            onImeSearch = {},
            modifier = Modifier.fillMaxWidth()
        )
    }
}
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
@Preview
@Composable
fun BookListScreenPreview(){
    MaterialTheme {
        BookListScreen(
            state = BookListState(
                searchResult = books
            ),
            onAction = {}
        )
    }
}