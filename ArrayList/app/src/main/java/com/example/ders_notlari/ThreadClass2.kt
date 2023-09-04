package com.example.arraylist

class ThreadClass2: Runnable {
    override fun run() {
        for (i in 200..299){
            println("ikinci Thread : $i")
            Thread.sleep(100)
        }
    }
}