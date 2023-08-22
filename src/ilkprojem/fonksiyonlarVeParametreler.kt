package com.example.ilkprojem

import java.util.Calendar

//fun fonksiyonAdi(parametre: Tipi, parametre2: Tipi) :GeriDonusTipi{
//return geriDonusDegeri
// }
//iki tip fonksiyon vardır birisi geriye değer döndüren(geriye donus tipi belirtmemiz gerekir) birisi geriye değer döndürmeyen(void)
//fonksiyonlar kodun okunabilirliğini artırır, program daha düzenli ve modüler hale gelir
fun main() {
//zamanTarihGoster()
    /*selamla("can silaci")
    selamla("ela silaci", "merhaba")*/
        val rastgeleFonksiyon: () -> Int = ::rastgeleSayi


}
fun toplama(sayi1: Int,sayi2: Int) :Int{
    val toplam = sayi1 + sayi2
    println(toplam)
    return toplam
}
/*
fun yazdir(metin: String){
    println(metin)
*/

fun zamanTarihGoster() {
    val simdikiZaman = Calendar.getInstance().time
    println("suanki zaman: $simdikiZaman")
}
/*fun selamla(isim: String, zaman: String = "gunaydin")  {
    println("$zaman, $isim")
}*/
fun rastgeleSayi(): Int{

    return (1..100).random()
}