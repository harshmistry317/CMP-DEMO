package com.plcoding.bookpedia.book.domain

import com.plcoding.bookpedia.book.data.database.BookEntity
import com.plcoding.bookpedia.core.domain.DataError
import com.plcoding.bookpedia.core.domain.EmptyResult
import com.plcoding.bookpedia.core.domain.Result
import kotlinx.coroutines.flow.Flow

interface BookRepository {
    suspend fun searchBook(query: String): Result<List<Book>,DataError.Remote>
    suspend fun getBookDetails(bookId: String): Result<String?,DataError>

     fun getFavoriteBooks(): Flow<List<Book>>
     fun isBookFavorite(id:String): Flow<Boolean>

    suspend fun makeAsFavorite(book: Book): EmptyResult<DataError.Local>
    suspend fun deleteFromFavorites(id: String)
}