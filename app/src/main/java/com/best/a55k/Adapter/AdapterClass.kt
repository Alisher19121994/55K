package com.best.a55k.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.best.a55k.Module.User
import com.best.a55k.R

class AdapterClass(var list: ArrayList<User>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var ONLINE = 0
    private var OFFLINE = 1


    override fun getItemCount(): Int {
        return list.size
    }

    override fun getItemViewType(position: Int): Int {
        return if (list[position].available) {
            ONLINE
        } else {
            OFFLINE
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == ONLINE){
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.online, parent, false)
        return Mode(view)}else{
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.offline, parent, false)
            return Mode1(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user = list[position]
        if (holder is Mode && holder is Mode1) {
            holder.textView.text = user.available.toString()
            holder.textView1.text = user.available.toString()
        }
    }


    inner class Mode(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.txtBtnOnline)
    }
    inner class Mode1(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView1: TextView = itemView.findViewById(R.id.txtBtnOffline)
    }
}