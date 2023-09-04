package com.example.hafta3.odev5

class Thread2: Runnable {
    override fun run() {
        for (i in 1..3){
            println("İkinci Thread :$i")
            Thread.sleep(3000)
        }
    }

}