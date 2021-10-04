package com.borshevskiy.mvvp_practice.screens.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.borshevskiy.mvvp_practice.databinding.NoteItemBinding
import com.borshevskiy.mvvp_practice.models.AppNote

class MainAdapter: RecyclerView.Adapter<MainAdapter.MyViewHolder>() {

    var noteList = emptyList<AppNote>()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    class MyViewHolder(val noteItemBinding: NoteItemBinding): RecyclerView.ViewHolder(noteItemBinding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(NoteItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentNote = noteList[position]
        with(holder.noteItemBinding) {
            itemNoteName.text = currentNote.name
            itemNoteText.text = currentNote.text
        }
    }

    override fun getItemCount(): Int {
        return noteList.size
    }
}