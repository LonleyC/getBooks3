package com.example.ananthu.getbooks3;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "author")
public class AuthorDBEntity {

    @PrimaryKey
    private Integer id;

    @ColumnInfo
    private Author author;

//    @ColumnInfo(name = "modified_date")
//    private Date modifiedDate;

    public AuthorDBEntity(Author author){
        this.author = author;

        id = author.getId();
        //modifiedDate = new Date();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

//    public Date getModifiedDate() {
//        return modifiedDate;
//    }
//
//    public void setModifiedDate(Date modifiedDate) {
//        this.modifiedDate = modifiedDate;
//    }
}
