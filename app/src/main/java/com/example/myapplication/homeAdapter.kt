package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.Chip

class homeAdapter(private val list: List<items>,private  val clickListener: (items) -> Unit)
    : RecyclerView.Adapter<ArchivioViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArchivioViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ArchivioViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: ArchivioViewHolder, position: Int) {
        val item: items = list[position]
        holder.bind(item)
        holder.touch(item,clickListener)
    }

    override fun getItemCount(): Int = list.size

}

class ArchivioViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.list_item, parent, false)) {

    private var titolo: TextView? = null
    private var qta: Chip? = null
    private var desc: TextView? = null


    init {
        titolo = itemView.findViewById(R.id.titolo)
        qta = itemView.findViewById(R.id.qta)
        desc = itemView.findViewById(R.id.desc)
    }

    fun bind(item: items) {
        titolo?.text = item.title
        qta?.text = item.qta.toString()
        desc?.text = item.desc
    }

    fun touch(item: items, clickListener: (items) -> Unit) {
        itemView.setOnClickListener { clickListener(item) }
    }
}