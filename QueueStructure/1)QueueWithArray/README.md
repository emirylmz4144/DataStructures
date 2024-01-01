## DİZİLER İLE STACK OLUŞTURULMASI

![](images/Ekran%20görüntüsü%202024-01-01%20141649.png)

### enqueue
````java
i back =-1;//diziler 0 dan başladığı için 0 dan küçük bir değer ile boş mu dolu mu kontrokü yapılması için

        this.back++;//ilk elemandan itibaren 0 dan başlanarak arttırma yapılır
        queue[back]=data;//sayacın her artan değeri dizinin o değerine atanır
````

### dequeue

````java

front=0;//Son eleman en başa geleceğinden en baş yani 0.indisi bir değişkene atıyoruz
back =-1;//diziler 0 dan başladığı için 0 dan küçük bir değer ile boş mu dolu mu kontrokü yapılması için

        int sayi=queue[front];//çıkarılan sayı gösterilip silineceği için bir değişkene atanır
        for (int i = 1; i<= back; i++)
        queue[i-1]=queue[i];// eleman çıkarıldığı için her elaman bir öne alınır

        System.out.println("En öndeki  eleman: "+sayi);
        this.back--;//eleman sayısı azaltılır
````