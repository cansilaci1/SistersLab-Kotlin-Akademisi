package com.example.myapp.hafta2.odev6

/*
* Null-safety, Kotlin'in en önemli özelliklerinden biridir ve diğer programlama dilleriyle karşılaştırıldığında önemli avantajları vardır.
*  İşte Kotlin'in null-safety özelliğinin diğer dillerden farklılıkları ve avantajları:

Güvenli çalışma zamanı (Safe Runtime): Kotlin, null değerlerle ilgili hataları çalışma zamanında (runtime) önler.
* Diğer bazı dillerde, null değerlerle ilgili hatalar genellikle çalışma zamanında hata fırlatarak programın çökmesine neden olabilir.
*  Ancak Kotlin, null-safety özelliği sayesinde böyle hataları çalışma zamanında yakalar ve uygulamayı çökmeden çalışmaya devam ettirebilir.

Nullable ve Non-nullable tiplerin açık bir şekilde belirtilmesi: Kotlin'de, değişkenlerin nullable olup olmadığı açık bir şekilde belirtilir.
*  String? gibi bir tip, nullable bir String tipini temsil ederken,
* String tipi nullable olmayan (non-nullable) bir String tipini temsil eder.
* Bu, kodun okunabilirliğini artırır ve olası null değerlerin kullanımı hakkında daha açık bilgi verir.

Null-safety operatörleri: Kotlin, null değerlerle çalışırken hızlı ve kolay null kontrolü ve işlemleri yapmak için null-safety operatörleri sağlar.
* Örneğin, ?. operatörü, null değeri içeren bir nesne üzerinde güvenli bir şekilde işlem yapmak için kullanılabilir.

Smart Casts (Akıllı Dönüşümler): Kotlin, null değer kontrolünden sonra otomatik olarak değişkenlerin tipini değiştirme yeteneğine sahiptir.
* Bu, null kontrolünden sonra if bloklarında veya döngülerde değişkenlerin null olmayan bir tipe dönüştürülmesi için
* gereksiz dönüşümleri önler ve kodun daha basit ve anlaşılır olmasını sağlar.

Platform tipi uyarlamaları: Kotlin, Java'dan geçişte platform tipleri ile uyumlu olmak için Nullable,
* Non-Nullable ve Platform olmak üzere üç farklı tipi destekler. Bu sayede,
* Java'dan Kotlin'e geçişte geçmiş Java kodunu daha sorunsuz bir şekilde entegre etmek mümkün olur.

Kotlin'in diğer dillerden farklılıkları ve avantajları, null-safety özelliğini kullanarak kodun daha güvenli, okunabilir ve hatasız olmasını sağlamaktadır. Bu özellik, programcıların daha az hata yapmasına yardımcı olur ve programların daha sağlam ve güvenilir olmasını sağlar.*/