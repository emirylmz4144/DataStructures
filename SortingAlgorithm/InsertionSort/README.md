![1.png](images%2F1.png)

````java
int checkValue=i;//Her elaman önceki tüm elemanlarla kontrol edilecek
````
``
Her gelen eleman kendinden önce gelen tüm elemanlarla 
kontrol edileceği için check value i değerini alır
``
````java
for (int j=i;j>=0;j--)//bu yüzden en son eleman checkValue olup geriye doğru kontrol sağlanacak
````
``
sayaçta biraz önceki durum gösterilmiştir sayaç
geriye giderek  kendinden tüm önceki elemanlarla kontrol sağlanır
``
````java
if (array[j]>array[checkValue])
        {
        int temp=array[j];
        array[j]=array[checkValue];
        array[checkValue]=temp;
        }
````

``
Bir önceki eleman kontrol elemandan büyükse yer değiştirme işlemi yapılır
``

## Burası önemli
````java
checkValue=j
````
``
Yer değiştirme işlemi gerçekleştiğinden dolayı kontrol 
elemanımız bir sola kayar ve bu sola kaymadan dolayı
kontrol elemanımızın indexi yer değiştirdiği elemanın
indexine dönüşür doğru kontrol yapmak için de kontrol elemanı
eğer şart sağlanırsa j değerini alır aşağıdaki şema 
incelenirse daha rahat anlaşılacaktır
``
![2.png](images%2F2.png)