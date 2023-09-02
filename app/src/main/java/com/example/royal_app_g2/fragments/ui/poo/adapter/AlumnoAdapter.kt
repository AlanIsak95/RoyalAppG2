package com.example.royal_app_g2.fragments.ui.poo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.royal_app_g2.R

class AlumnoAdapter(val listaAlumnos : List<String>) : RecyclerView.Adapter<AlumnoAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listaAlumnos[position]
        holder.itemText.text = item
    }

    override fun getItemCount() = listaAlumnos.size


    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val itemText : TextView = itemView.findViewById(R.id.tv_recycler_view_item)
    }

}