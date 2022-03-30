package com.example.notesapplication;

import androidx.cardview.widget.CardView;

import com.example.notesapplication.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
