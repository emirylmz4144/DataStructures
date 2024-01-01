![](images/stack.drawio2.png)

## Eleman ekleme(push)
````java
this.indis=-1; //Eleman ekleneceği için her elemandan önce bir arttırılır,ve 0 ile array[indis].elemana ekleme başlar
        
        
        if (isFull())// Dizi doluysa exception hatası yerine bizim hatamız görünür
        System.out.println("Dizi dolu ");
        else
        {
        indis++;
        for (int i=indis;i>0;i--)
        {
        int temp=array[i-1];
        array[i]=temp;
        }
        array[top]=data;
        System.out.println("Dizinin "+indis+".elemanı kaydedildi: "+array[top]);
        }
````

![](images/Ekran%20görüntüsü%202024-01-01%20183045.png)

## Eleman çıkarma(pop)
````java

 if (isEmpty())// Dizi boşsa exception hatası yerine bizim hatamız görünür
            System.out.println("Dizi zaten boş");
        else
        {
            System.out.println("En üstteki elemanınız: "+array[top]);//Elemanı verir ve çıkarır
            for (int i=0;i<indis;i++)//Elemanlar bu sefer başa doğru kaydırılır
                array[i]=array[i+1];
            indis--;//indis azaltılarak dizinin boyutu tekrardan küçültülür
        }
````

![](images/Ekran%20görüntüsü%202024-01-01%20185713.png)