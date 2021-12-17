package com.example.projectfinle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class customAdapter(val array:ArrayList<Plants>): RecyclerView.Adapter<customAdapter.Dataholder>() {

    //  عرض البيانات
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Dataholder {
val dataholder:Dataholder = Dataholder(LayoutInflater.from(parent.context).
inflate(R.layout.custom_layout,parent,false))
return dataholder
    }
//  عرض البيانات المختلفه المقصود فيها  مثلاً اسماء النباتات في كل خانه
    override fun onBindViewHolder(holder:Dataholder, position: Int) {
   val Plants=array.get(position)
    holder.imageView.setImageResource(Plants.imag)
   holder.tvName.setText(Plants.name)
   holder.tvdxe.setText(Plants.dce)
    }

    //"عدد تكرار الخليا"
    override fun getItemCount(): Int {
return array.size
    }
class Dataholder(view:View):RecyclerView.ViewHolder(view){
    val imageView:ImageView=view.findViewById(R.id.imView)
    val tvName:TextView =view.findViewById(R.id.tvName)
    val tvdxe:TextView =view.findViewById(R.id.tvdxe)
}
}