package com.example.cocukeglence.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.cocukeglence.ui.adapter.IceriklerAdapter
import com.example.cocukeglence.data.repo.Bilgiler
import com.example.cocukeglence.data.entity.Icerikler
import com.example.cocukeglence.data.entity.Kategoriler
import com.example.cocukeglence.databinding.ActivityIcerikBinding

class IcerikActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIcerikBinding
    private lateinit var icerikListe:ArrayList<Icerikler>
    private lateinit var adapter: IceriklerAdapter
    private lateinit var bilgiler: Bilgiler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIcerikBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bilgiler = Bilgiler()
        val kategori = intent.getSerializableExtra("kategoriNesne") as Kategoriler

        binding.toolbarIcerikler.title = " ${kategori.kategori_ad}"
        setSupportActionBar(binding.toolbarIcerikler)

        binding.iceriklerRv.setHasFixedSize(true)
        binding.iceriklerRv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        icerikListe = ArrayList()

        listeDoldur(kategori)

        adapter = IceriklerAdapter(this,icerikListe)
        binding.iceriklerRv.adapter = adapter

    }

    fun listeDoldur(kategori: Kategoriler){

        if (kategori.kategori_ad == "Masal"){
            icerikListe = bilgiler.getMasalListesi()

        }

        else if (kategori.kategori_ad == "Fıkra"){
            icerikListe = bilgiler.getIFikraListesi()
        }

        else if (kategori.kategori_ad == "Bilmece"){
            icerikListe = bilgiler.getBilmeceListesi()
        }

        else if (kategori.kategori_ad == "Tekerleme"){
            icerikListe = bilgiler.getTekerlemeListesi()
        }

    }

}