package com.example.cocukeglence.data.repo

import com.example.cocukeglence.data.entity.IcerikDetay
import com.example.cocukeglence.data.entity.Icerikler
import com.example.cocukeglence.data.entity.Kategoriler

class Bilgiler() {


    private val kategori_masal = Kategoriler(1,"Masal")
    private val kategori_fikra = Kategoriler(2,"Fıkra")
    private val kategori_bilmece = Kategoriler(3,"Bilmece")
    private val kategori_tekerleme = Kategoriler(4,"Tekerleme")

    private val icerik_detay_masal = IcerikDetay(1,"Masal")
    private val icerik_detay_fikra = IcerikDetay(2,"Fıkra")
    private val icerik_detay_bilmece = IcerikDetay(3,"Bilmece")
    private val icerik_detay_tekerleme = IcerikDetay(4,"Tekerleme")


    private val masal_bir = Icerikler(1,"Prens","Prens","prens",kategori_masal,icerik_detay_masal)
    private val masal_iki = Icerikler(2,"Yavru Kuş","yavrukus","ucyavrukus",kategori_masal,icerik_detay_masal)
    private val masal_uc = Icerikler(3,"Rapunzel","rapunzel","rapunzel",kategori_masal,icerik_detay_masal)
    private val masal_dort = Icerikler(4,"Üzgün Ördek","uzgunordek","uzgunordek",kategori_masal,icerik_detay_masal)

    private val fikra_bir = Icerikler(5,"Ağır","Ağır","resim_posta",kategori_fikra,icerik_detay_fikra)
    private val fikra_iki = Icerikler(6,"Maymun","Maymun","resim_bebek",kategori_fikra,icerik_detay_fikra)
    private val fikra_uc = Icerikler(7,"Papağan","Papagan","resim_papagan",kategori_fikra,icerik_detay_fikra)
    private val fikra_dort = Icerikler(8,"Temel","Temel","resim_temel",kategori_fikra,icerik_detay_fikra)

    private val bilmece_bir  = Icerikler(9,"","at","soru_isareti",kategori_bilmece,icerik_detay_bilmece)
    private val bilmece_iki  = Icerikler(10,"","bilgisayar","soru_isareti",kategori_bilmece,icerik_detay_bilmece)
    private val bilmece_uc  = Icerikler(11,"","kelebek","soru_isareti",kategori_bilmece,icerik_detay_bilmece)
    private val bilmece_dort  = Icerikler(12,"","oyuncak","soru_isareti",kategori_bilmece,icerik_detay_bilmece)

    private val tekerleme_bir = Icerikler(13,"","ordek","tekerleme_bir",kategori_tekerleme,icerik_detay_tekerleme)
    private val tekerleme_iki = Icerikler(14,"","pirinc","tekerleme_iki",kategori_tekerleme,icerik_detay_tekerleme)
    private val tekerleme_uc = Icerikler(15,"","sise","tekerleme_uc",kategori_tekerleme,icerik_detay_tekerleme)
    private val tekerleme_dort = Icerikler(16,"","yogurt","tekerleme_dort",kategori_tekerleme,icerik_detay_tekerleme)

    private var masalListe: ArrayList<Icerikler> = arrayListOf(masal_bir,masal_iki,masal_uc,masal_dort)
    private var fikraListe: ArrayList<Icerikler> = arrayListOf(fikra_bir,fikra_iki,fikra_uc,fikra_dort)
    private var bilmeceListe: ArrayList<Icerikler> = arrayListOf(bilmece_bir,bilmece_iki,bilmece_uc,bilmece_dort)
    private var tekerlemeListe: ArrayList<Icerikler> = arrayListOf(tekerleme_bir,tekerleme_iki,tekerleme_uc,tekerleme_dort)
    // var prens: String? = ""

    fun getMasalListesi(): ArrayList<Icerikler>{
        return masalListe
    }
    fun getIFikraListesi(): ArrayList<Icerikler>{
        return fikraListe
    }
    fun getBilmeceListesi(): ArrayList<Icerikler>{
        return bilmeceListe
    }
    fun getTekerlemeListesi(): ArrayList<Icerikler>{
        return tekerlemeListe
    }

    /*fun getFromFirebase(): String? {
        val database = FirebaseDatabase.getInstance()
        val dbMasalRef = database.getReference().child("Masal/prens")
        dbMasalRef.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                prens = snapshot.getValue<String>().toString()


            }
            override fun onCancelled(error: DatabaseError) {

            }

        })
        return prens
    }*/

}