package com.mz.portalberita.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mz.portalberita.R
import com.mz.portalberita.data.Komentar

class KomentarAdapter (private val list:ArrayList<Komentar>)
    :RecyclerView.Adapter<KomentarAdapter.KomentarViewHolder>(){



    class KomentarViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val username = itemView.findViewById<TextView>(R.id.txtUserName)
        private val komentar = itemView.findViewById<TextView>(R.id.txtKomen)

        fun bind(get: Komentar) {
            username.text = get.username
            komentar.text = get.komentar
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KomentarViewHolder {
      return KomentarViewHolder(LayoutInflater.from(parent.context)
          .inflate(R.layout.list_komentar,parent,false))
    }

    override fun getItemCount(): Int {
      return list.size
    }

    override fun onBindViewHolder(holder: KomentarViewHolder, position: Int) {
        holder.bind(list[position])
    }
}