package com.example.hafta3.odev5

import android.content.res.Resources.Theme

fun main() {
    //NESNELERİMİZİ OLUŞTURUYORUZ
    val birinciThread = Thread(Thread1())
    val ikinciThread = Thread(Thread2())

    birinciThread.start()
    ikinciThread.start()

    for (i in 1..6){
        println("Ana Thread :$i")
        Thread.sleep(6000)
    }

}