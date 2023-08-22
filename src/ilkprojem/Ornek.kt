package com.example.ilkprojem

import java.lang.Exception
import java.util.InputMismatchException
import java.util.Scanner

//1. ders
//tek satır deneme yorum satırı

/*
çok satır deneme yorum satırı
çok satır deneme yorum satırı
*/

//print kendisinden sonraki çıktıyı yan yana yazdırır.
//println kendisinden sonraki çıktıyı sonraki satırda yazdırır.

//var-iable(değişken), değerleri sonradan değiştirebliyoruz
//val-ue(değer), değerleri sonradan değiştirilemez

fun main() {
    /*println("Merhaba dunya")
    print("hello world")

    var x = 5
    x = 20

    val y = 4

    var birinciSayi = 1
    var ikinciSayi = 2
    */
    //2. ders
    // var ya da val, değişkenin adı : tür = atadığımız değer
    // Long, daha büyük sayılarda kullanılan değişken türü
    // String, text yazdığımızda kullanılan değişken türü
    // Char karakter atamaları içim kullanılan değişken türü
    // Double, tam sayı olmayan değerlerimiz için kullanılır
    // Float da aynı şekilde kullanılır fakat double daha hassas değerler için kullanılır
    /*val sayi: Int = 10
    val sayi2 = 43.5
    val text: String = "can silaci"
    val text2: Char = 'c'
    val sayi3: Double = 43.2
    val sayi4: Float = 3.6f
    val sayi5: String = "can"
    println(sayi2)

    val yas: Int = 20
    println("$text $sayi2")

    val sayi6: Int = 20
    val sayi7: Int = 29

    println("sayi6 degeri $sayi6 dir, sayi7 değeri $sayi7 dir")
*/

    var i = 42
    var str = i.toString()
    println(str)
    var yazi1 = "NABER"
    try {
        var x = yazi1.toInt()
        println(x)
    }catch (e:Exception){
        println("dönüşümde hata var")
    }
    fun main() {
        val scanner = Scanner(System.`in`)

        println("Yasinizi giriniz :")
        val yas = scanner.nextInt()
        try {
            if (yas >= 0 && yas < 18) {
                println("oy kullanamazsiniz!!")

            }else if (yas >= 18 && yas <= 120) {
                println("oy kullanabilirsiniz!!")
            }
        }catch (e: InputMismatchException){
            println("hatalı giris")
        }

    }

}