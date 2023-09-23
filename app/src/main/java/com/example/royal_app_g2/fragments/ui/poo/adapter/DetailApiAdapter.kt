package com.example.royal_app_g2.fragments.ui.poo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieAnimationView
import com.example.royal_app_g2.R
import com.example.royal_app_g2.data.retrofit.entity.Result
import com.example.royal_app_g2.fragments.ui.poo.funciones_extension.showToast

class DetailApiAdapter(
    val resultList : List<Result?>?
): RecyclerView.Adapter<DetailApiAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        /* Valor de cada elemento de la lista*/
        val item = resultList?.get(position)

        /** Asignacion de cada elemento a cada vista*/

        holder.itemTextView.text = item?.name

        holder.itemTextViewDetail.setOnClickListener {
            holder.itemView.context.showToast("Click en Detalle de ${item?.name}")
        }

    }

    override fun getItemCount() = resultList?.size?:0

    /* */
    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        /** Implementacion de vistas para cada elemento de la lista*/
        val itemTextView : TextView = itemView.findViewById(R.id.tv_recycler_view_item)
        val itemLottieAnimation : LottieAnimationView = itemView.findViewById(R.id.lav_recycler_view_item)
        val itemTextViewDetail : TextView = itemView.findViewById(R.id.tv_recycler_view_detail)

    }

}