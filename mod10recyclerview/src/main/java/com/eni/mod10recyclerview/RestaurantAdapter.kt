package com.eni.mod10recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.eni.mod10recyclerview.databinding.RestaurantTemplateListBinding

class RestaurantAdapter(val arrayListRestaurant: ArrayList<Restaurant>) : RecyclerView.Adapter<RestaurantAdapter.RestaurantHolder>() {

    class RestaurantHolder(val binding: RestaurantTemplateListBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantHolder {
        val binding = RestaurantTemplateListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,false)
        return RestaurantHolder(binding)
    }

    override fun onBindViewHolder(holder: RestaurantHolder, position: Int) {
        holder.binding.restau = arrayListRestaurant[position]
    }

    override fun getItemCount(): Int = arrayListRestaurant.size

}