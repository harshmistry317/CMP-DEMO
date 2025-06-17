package com.plcoding.bookpedia.book.data.database

import androidx.room.ConstructedBy
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    entities = [BookEntity::class],
    version = 1
)
@TypeConverters(
    StringListTypeConverter::class
)
@ConstructedBy(BookDatabaseConstructor::class) // need for other plate-form android it will work
abstract class FavoriteBookDataBase: RoomDatabase() {
    abstract val favoriteBookDao: FavoriteBookDao
    companion object{
        const val DB_NAME = "book.db"
    }
}