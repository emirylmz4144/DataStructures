![1.png](images%2F1.png)
````java
 int minValue=i;//en baş eleman en küçük eleman index'i seçilerek başlatılır
                for (int j=i+1;j<array.length;j++)
                {
                    if (array[j]<array[minValue])//eğer dizi[enKüçükDeğereAitIndexNo]>dizi[j]
                        minValue=j;//enKüçükDeğereAitIndexNo=j
                }
````
![2.png](images%2F2.png)
````java
 int temp=array[minValue];//eski en küçük değer geçici değişkende tutulur
                array[minValue]=array[i];//dizinin ŞİMDİKİ en küçük değeri ilgili konuma getirilir
                array[i]=temp;//eski en küçük değerle şimdiki en küçük değerin yerleri değiştirilir
````
![3.png](images%2F3.png)![4.png](images%2F4.png)
![5.png](images%2F5.png)