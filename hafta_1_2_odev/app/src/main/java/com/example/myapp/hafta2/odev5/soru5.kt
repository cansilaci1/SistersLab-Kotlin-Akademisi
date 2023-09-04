
class Kullanici {
    var ad: String? = null
    var soyad: String? = null
}

fun main() {


    val kullanici = Kullanici()

    if (kullanici.ad != null) {
        println("Ad: ${kullanici.ad}")
    } else {
        println("Ad bilgisi girilmemiş.")
    }

    if (kullanici.soyad != null) {
        println("Soyad: ${kullanici.soyad}")
    } else {
        println("Soyad bilgisi girilmemiş.")
    }
}
/*
*yukarıda yazdığım kodlara bakılacağı üzere if else bloğu ile null kontrolü yapılabilir.
*
* */
