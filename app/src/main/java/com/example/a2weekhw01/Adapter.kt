package com.example.a2weekhw01

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val context: MainActivity): RecyclerView.Adapter<Adapter.ViewHolder>(){

    private var userList = mutableListOf<User>()

    fun setListData(data:MutableList<User>){
        userList = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val user : User = userList[position]
        holder.name.text = user.name
        holder.one.text = user.middle.toString()
        holder.two.text = user.measure.toString()
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val name : TextView = itemView.findViewById(R.id.name)
        val one : TextView = itemView.findViewById(R.id.one)
        val two : TextView = itemView.findViewById(R.id.two)
    }
}