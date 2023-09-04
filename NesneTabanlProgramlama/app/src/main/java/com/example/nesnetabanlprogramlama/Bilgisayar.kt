package com.example.nesnetabanlprogramlama

class Bilgisayar(var renk:String,var hiz:Int,var calisiyorMu:Boolean) {

    fun bilgiAl(){
        println("renk: $renk")
        println("hız: $hiz")
        println("çalışıyor mu? $calisiyorMu")
    }

    fun bilgisayarCalisiyorMu() {
        calisiyorMu = true
        println("çalışıyor mu? $calisiyorMu")
    }
}

