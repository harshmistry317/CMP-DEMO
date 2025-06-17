@file:OptIn(ExperimentalForeignApi::class)

package com.plcoding.bookpedia.book.data.database

import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.cinterop.ExperimentalForeignApi
import platform.Foundation.NSDocumentDirectory
import platform.Foundation.NSFileManager
import platform.Foundation.NSUserDomainMask

actual class DatabaseFactory {
    actual fun create(): RoomDatabase.Builder<FavoriteBookDataBase> {
        val dbFile = documentDirectory() + "/${FavoriteBookDataBase.DB_NAME}"
        return Room.databaseBuilder<FavoriteBookDataBase>(
            name = dbFile
        )
    }
    private fun documentDirectory() : String{
        val documentDirectory = NSFileManager.defaultManager.URLForDirectory(
            directory = NSDocumentDirectory,
            inDomain = NSUserDomainMask,
            appropriateForURL = null,
            create = false,
            error = null
        )
        return requireNotNull(documentDirectory?.path)
    }
}