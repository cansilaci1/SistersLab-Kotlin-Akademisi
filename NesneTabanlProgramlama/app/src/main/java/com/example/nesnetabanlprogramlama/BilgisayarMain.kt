package com.example.nesnetabanlprogramlama
//Nullable - null safety bir değişkenin null olmasını kontrol altına almak için kullanılır. ?,!!
//primitif tipler INT,STRİNG,BOOLEAN
//lateinit referans tiplerinde geçerlidir, primitif tiplerde kullanılamaz

fun main() {
    lateinit var asus: Bilgisayar
    val metin = "      Merhaba!         "
    val temizlenmisMetin = metin.trim()
    println("Orjinal metin:  '$metin'")
    println("Temizlenmiş metin: '$temizlenmisMetin'")
/*var asus = Bilgisayar("siyah",10,false)
prtln(asus.hiz)
println(asus.renk)
println(asus.calisiyorMu)

println("--------DEĞERLERİ DEĞİŞTİRDİKTEN SONRA-----")

asus.hiz = 15
asus.renk = "turuncu"
asus.calisiyorMu = true
asus.bilgiAl()
asus.hiz = 30
asus.bilgiAl()
asus.bilgisayarCalisiyorMu()

val intel = Bilgisayar("beyaz",5,true)
intel.renk = "mavi"*/

/*var str1:String? = null
str1?.trim()*/
}





