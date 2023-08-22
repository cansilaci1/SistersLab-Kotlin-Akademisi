package com.example.ilkprojem

class DegiskenKapsami {
    var x = 15 //global
    var y = 20

    fun topla() {
        var x = 40
        var z = x + y //local
        //local her zaman daha baskındır ve localdeki değerleri alınarak işlem yapılır
        println(z)
    }

}