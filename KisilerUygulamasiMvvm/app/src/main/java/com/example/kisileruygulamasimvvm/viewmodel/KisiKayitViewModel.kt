package com.example.kisileruygulamasimvvm.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasimvvm.data.repo.KisilerDaRepository

class KisiKayitViewModel : ViewModel() {

    val krepo = KisilerDaRepository()

    fun kayit(kisiAd:String, kisiTel:String){
        krepo.kisiKayit(kisiAd,kisiTel)
    }

}