package com.example.vaishnavi.kotlintest

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.text.FieldPosition

public class CustomAdapter(val userList : ArrayList<User>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>(){

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(user : User){
            val textViewName = itemView.findViewById(R.id.textViewUsername) as TextView
            val textViewAddress = itemView.findViewById(R.id.textViewAddress) as TextView
            textViewName.text = user.name
            textViewAddress.text = user.address
        }

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int) : CustomAdapter.ViewHolder {
        val v = LayoutInflater.from(p0.context).inflate(R.layout.list_layout,p0,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return  userList.size
    }

    override fun onBindViewHolder(holder:CustomAdapter.ViewHolder, position : Int) {
        holder.bindItems(userList[position])
    }

}