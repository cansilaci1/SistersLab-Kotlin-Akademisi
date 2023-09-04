package com.example.myapp.hafta1.hackerRank

import java.util.*

fun solveMeFirst(a: Int, b: Int): Int {
    return a+b
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    println("a = ")
    val num1 = sc.nextInt()

    println("b = ")
    val num2 = sc.nextInt()
    val sum = solveMeFirst(num1, num2)

    println("toplam = $sum")
}