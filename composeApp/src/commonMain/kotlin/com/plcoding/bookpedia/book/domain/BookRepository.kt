package com.plcoding.bookpedia.book.domain

import com.plcoding.bookpedia.core.domain.DataError
import com.plcoding.bookpedia.core.domain.Result

interface BookRepository {
    suspend fun searchBook(query: String): Result<List<Book>,DataError.Remote>
    suspend fun getBookDetails(bookId: String): Result<String?,DataError>
}