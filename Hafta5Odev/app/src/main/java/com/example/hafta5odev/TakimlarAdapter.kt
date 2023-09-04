package com.example.hafta5odev

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.hafta5odev.databinding.TakimTasarimBinding

class TakimlarAdapter(private val mContext: Context, private val takimlarListesi: List<Takimlar>) :RecyclerView.Adapter<TakimlarAdapter.TakimTasarimNesneleriniTutucu>() {
    inner class TakimTasarimNesneleriniTutucu(val binding: TakimTasarimBinding) :RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TakimTasarimNesneleriniTutucu {
        val binding = TakimTasarimBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TakimTasarimNesneleriniTutucu(binding)
    }

    override fun getItemCount(): Int {
        return takimlarListesi.size
    }

    override fun onBindViewHolder(holder: TakimTasarimNesneleriniTutucu, position: Int) {
        val takim = takimlarListesi[position]
        val binding = holder.binding

        binding.textView.text = takim.takim_adi


        val resimId = mContext.resources.getIdentifier(takim.takim_resim_adi, "drawable",mContext.packageName)
        binding.imageViewTakimResmi.setImageResource(resimId)

    }
}
