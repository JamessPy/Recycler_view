package com.example.recyclerviewtest

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtest.databinding.AdapterLayoutBinding

class IconAdapter(var mContext: Context, var iconListesi:List<Icon>) :
    RecyclerView.Adapter<IconAdapter.HoldingCard>() {

    inner class HoldingCard(binding: AdapterLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var binding: AdapterLayoutBinding

        init {
            this.binding = binding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoldingCard {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = AdapterLayoutBinding.inflate(layoutInflater, parent, false)

        return HoldingCard(binding)
    }

    override fun onBindViewHolder(holder: HoldingCard, position: Int) {

        val icon = iconListesi.get(position)
        val t = holder.binding

        t.imageViewIcon.setImageResource(
            mContext.resources.getIdentifier(
                icon.imageName,
                "drawable",
                mContext.packageName
            )
        )
        t.imageAciklama.text = icon.aciklama

    }

    override fun getItemCount(): Int {
        return iconListesi.size
    }
}