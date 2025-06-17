package com.plcoding.bookpedia.book.data.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

actual class DatabaseFactory(
    private val context: Context
) {
    actual fun create(): RoomDatabase.Builder<FavoriteBookDataBase> {
       val applicationContext = context.applicationContext
        val dbFile = applicationContext.getDatabasePath(FavoriteBookDataBase.DB_NAME)
        return Room.databaseBuilder(
            context = applicationContext,
            name = dbFile.absolutePath)
    }
}