package com.example.recyclerviewtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerviewtest.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        val iconListesi = ArrayList<Icon>()
        binding.rv.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)

        val i1 = Icon(1, "icon1", "Hamburger")
        val i2 = Icon(2, "icon2", "Salatalar")
        val i3 = Icon(3, "icon3", "Döner")
        val i4 = Icon(4, "icon4", "Pizza")
        val i5 = Icon(5, "icon5", "Atıştırmalık")
        val i6 = Icon(6, "icon6", "Hamburger")
        val i7 = Icon(7, "icon7", "Salatalar")
        val i8 = Icon(8, "icon8", "Döner")
        val i9 = Icon(9, "icon9", "Pizza")
        val i10 = Icon(10, "icon1", "Atıştırmalık")

        iconListesi.add(i1)
        iconListesi.add(i2)
        iconListesi.add(i3)
        iconListesi.add(i4)
        iconListesi.add(i5)
        iconListesi.add(i6)
        iconListesi.add(i7)
        iconListesi.add(i8)
        iconListesi.add(i9)
        iconListesi.add(i10)

        val adapter = IconAdapter(requireContext(), iconListesi)
        binding.rv.adapter = adapter

        return binding.root

    }
}