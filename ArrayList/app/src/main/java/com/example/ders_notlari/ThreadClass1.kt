package com.example.arraylist

class ThreadClass1: Thread() {
    //run metodu bize thread özelliğini sağlamış olacak
    override fun run() {
        for (i in 100..199){
            println("Birinci thread: $i")
            Thread.sleep(100)
        }
    }
}