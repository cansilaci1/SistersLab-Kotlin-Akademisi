package com.example.ilkprojem

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("bir meyve adı giriniz")
    val meyve = scanner.nextLine()

    if (meyve.equals("elma", ignoreCase = false)) {
        println("evet girdiğiniz kelime elmadır")
    } else {
        println("girdiğiniz kelime elma kelimesinden farklı bir kelimedir")
    }
    //ignoreCase girilen parametreyle yapılan karşılaştırmada büyük küçük harf farkını göz ardı etmek için kullanılır
    //equals() bir nesnenin başka bir nesneyle eşit olup olmadığını kontrol eder
}