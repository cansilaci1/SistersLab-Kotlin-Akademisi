package com.example.hafta3.odev5

class Thread1:Runnable {
    override fun run() {
        for (i in 1..5){
            println("Birinci Thread :$i")
            Thread.sleep(5000)
        }
    }
}