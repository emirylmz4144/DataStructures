## Bubble sort

Bubble sort adında da anlaşılacağı gibi her seferinde kendinde gelen indexi alarak
kendisi ve bir sonraki indexteki elemanı kontrol eder ve bu iki elemanı karşılaştırarak
yer ayarlamalarını sağlar böylece her seferinde en büyük elemanı
tıpkı sabundan köpük çıkarır gibi en sona atar.

![1.png](images%2F1.png)

Şekilde de görüldüğü gibi elemanı en sona attıktan sonra (en son eleman
yeşil olmuştur yani sona atılmış olup sıralanmış anlamına gelmektedir.)
bir sonraki kontrole gider ama bu sefer dizinin 1 eksiği kadar kontrol yapar
çünkü bir eleman sıralanmıştır bu yüzden ;
````java
 for (int j=0;j<array.length-i-1;j++)
````
kodunda dizinin boyutundan i-1 i çıkardık çünki dıştaki for döngüsünde 
i sıralanmış her elemanın sayısını tutuyor gibi de düşünebiliriz.
O zaman şekillerle devam edelim

![2.png](images%2F2.png)
![3.png](images%2F3.png)

### DİPNOT
``
Fark ettiysen kontrol edilenlere girmiyor bunun sebebi daha önce bahsedilen
dıştaki for döngüsünde yer alan sayaçtaki i nin kontrol edilen eleman
sayısını tutmasıdır içteki ise i her arttığında kendi döngüsünden çıkararak
kontrol edilenleri tekrar kontrol etmez
``



![4.png](images%2F4.png)


## SONUC

![sonuc.png](images%2Fsonuc.png)