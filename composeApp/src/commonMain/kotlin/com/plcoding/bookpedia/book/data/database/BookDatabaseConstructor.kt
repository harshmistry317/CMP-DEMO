package com.plcoding.bookpedia.book.data.database

import androidx.room.RoomDatabaseConstructor

/**
 *  we have to suppress this because room will autometicaly declare actual everywhere it needed it wil so error that's why we suprrees this.
 */
@Suppress("NO_ACTUAL_FOR_EXPECT")
expect object BookDatabaseConstructor: RoomDatabaseConstructor<FavoriteBookDataBase> {
    override fun initialize(): FavoriteBookDataBase
}