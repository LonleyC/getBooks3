package com.example.ananthu.getbooks3;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface AuthorDBAccess {

    @Query("SELECT * FROM author WHERE id IS (:id)")
    Author findByID(Integer id);

    @Insert
    void insertAll(AuthorDBEntity... authors);

    @Delete
    void delete(AuthorDBEntity author);
}
