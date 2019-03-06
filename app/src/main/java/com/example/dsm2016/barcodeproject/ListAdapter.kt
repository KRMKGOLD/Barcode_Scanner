package com.example.dsm2016.barcodeproject

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class ListAdapter(val context: Context, val codeList : ArrayList<codeData>) : RecyclerView.Adapter<ListAdapter.ListHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.recycler_row, parent, false)
        return ListHolder(view)
    }

    override fun getItemCount(): Int = codeList.size

    override fun onBindViewHolder(holder: ListHolder, position: Int) {
        holder.bind(codeList[position])
    }


    inner class ListHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val codeImage = itemView.findViewById<ImageView>(R.id.listImage)
        val codeText = itemView.findViewById<TextView>(R.id.listText)

        fun bind(toBindList : codeData){
            codeImage.setImageBitmap(toBindList.codeImage)
            codeText.text = toBindList.content
        }
    }
}