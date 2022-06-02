package com.example.viewpager_swipableview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(val images:List<Int>):RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {


    inner class ViewPagerViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.viewpagerlistitem,parent,false)
        return ViewPagerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return images.size
    }


    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val curimg=images[position]
        holder.itemView.findViewById<ImageView>(R.id.img_swipable).setImageResource(curimg)
    }



}