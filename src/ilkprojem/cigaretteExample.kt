package com.example.ilkprojem

import java.util.Scanner

class cigaretteExample {
    var count : Int = 0
    var quantityInThePack : Int = 0
    var price : Int = 0
    var profit : Float = 0F
    var loss : Float = 0F

    fun calculate(){

        var scanner = Scanner(System.`in`)

        println("günde kaç tane sigara içiyorsunuz?")
        var count = scanner.nextInt()

        println("bir pakette kaç sigara var?")
        var quantityInThePack = scanner.nextInt()
        println("bir paket sigara kaç lira?")
        var price = scanner.nextInt()

        print("seçmek istediğiniz işlemi seçiniz?" +
                "A)1 AYDA NE KADAR PARA HARCIYORUM VE SİGARA İÇİYORUM\n" +
                "B)1 YILDA NE KADAR PARA HARCIYORUM VE SİGARA İÇİYORUM")
        val choice = scanner.next()
        if (choice.equals("A", ignoreCase = true)  ){
            val result = ((price/quantityInThePack)*count)*30
            println("Bir ayda sigaraya harcadığınız para = " + result)
        }

        return calculate()
    }


}