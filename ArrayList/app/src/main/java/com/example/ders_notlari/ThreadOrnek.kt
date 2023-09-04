package com.example.arraylist
//thread yapısı aynı anda birden fazla işlem yapmamıza olanak sağlar
//1. yöntem  Thread(){} -- kalıtım yöntemiyle tanımlama
//2.yöntem Runnable{} --  interface yöntemiyle tanımlama
fun main() {
    val birinciThread = ThreadClass1()
    val ikinciThread = Thread(ThreadClass2()) //interface tanımlamalarda bu şekilde nesne oluşturulur


    birinciThread.start() //threadler için start metodu gerekli
    ikinciThread.start()

    for (i in 900..999){
        println("Main Thread : $i")
        Thread.sleep(100)
    }
}