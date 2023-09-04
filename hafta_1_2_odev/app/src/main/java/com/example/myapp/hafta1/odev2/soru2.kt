package com.example.myapp.hafta1.odev2

import java.lang.Exception
import java.lang.NumberFormatException
import java.util.InputMismatchException
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)


    try {
        println("Yasinizi giriniz :")
        val yas = scanner.nextInt()
        if (yas >= 0 && yas < 18) {
            println("oy kullanamazsiniz!!")

        } else if (yas >= 18 && yas <= 120) {
            println("oy kullanabilirsiniz!!")
        }
    } catch (e: InputMismatchException) {
        println("hatalı giris")
    }
}