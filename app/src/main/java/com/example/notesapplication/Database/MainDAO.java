package com.example.notesapplication.Database;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.notesapplication.Models.Notes;

import java.util.List;

@Dao
public interface MainDAO {
    // DAO = Data Access Object

    @Insert(onConflict = REPLACE)
    void insert(Notes notes);

    // getting all the notes in a query
    @Query("SELECT * FROM notes ORDER BY id DESC")
    List<Notes> getAll();

    // Updating note
    @Query("UPDATE notes SET title = :title, notes = :notes WHERE ID = :id")
    void update(int id, String title, String notes);

    // Delete note
    @Delete
    void delete(Notes notes);

    // pin note
    @Query("UPDATE notes SET pinned = :pin WHERE ID = :id")
    void pin(int id, boolean pin);


}
