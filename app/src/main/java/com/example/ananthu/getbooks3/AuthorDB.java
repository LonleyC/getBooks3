package com.example.ananthu.getbooks3;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

@Database(entities = {AuthorDBEntity.class}, version = 1)
@TypeConverters({DBConverterHelper.class})
public abstract class AuthorDB extends RoomDatabase{
    public abstract AuthorDBAccess mAuthorDBAccess();
}
