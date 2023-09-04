package com.example.hafta5odev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.hafta5odev.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: TakimlarAdapter
    private lateinit var takimlarArrayList: ArrayList<Takimlar>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)

        val t1 = Takimlar(1,"BEŞİKTAŞ","resim_bir.jpg")
        val t2 = Takimlar(2,"FENERBAHÇE","resim_iki.jpg")
        val t3 = Takimlar(3,"GALATASARAY","resim_uc.jpg")
        val t4 = Takimlar(4,"TRABZONSPOR","resim_dort.jpg")

        takimlarArrayList = ArrayList<Takimlar>()

        takimlarArrayList.add(t1)
        takimlarArrayList.add(t2)
        takimlarArrayList.add(t3)
        takimlarArrayList.add(t4)

        adapter = TakimlarAdapter(this,takimlarArrayList)
        binding.rv.adapter = adapter
    }
}