package com.example.kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RideAdapter(private var rideList: List<RideModel>) : RecyclerView.Adapter<RideAdapter.RideViewHolder>() {

    class RideViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvSource: TextView = view.findViewById(R.id.tvSource)
        val tvDestination: TextView = view.findViewById(R.id.tvDestination)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RideViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_ride, parent, false)
        return RideViewHolder(view)
    }

    override fun onBindViewHolder(holder: RideViewHolder, position: Int) {
        val ride = rideList[position]
        holder.tvSource.text = ride.empSource // Assuming empSource is the source field in RideModel
        holder.tvDestination.text = ride.empDestination // Assuming empDestination is the destination field in RideModel        
    }

    override fun getItemCount(): Int = rideList.size

    fun updateData(newList: List<RideModel>) {
        rideList = newList
        notifyDataSetChanged()
    }
}
