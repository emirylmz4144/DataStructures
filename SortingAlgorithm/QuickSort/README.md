## QUİCK SORT
![1.png](images%2F1.png)

````java
...
...
...
i++;// Pivotun indexine ulaşmak için yani ortalaya gelmek için arttır
swapped(array,i,end);

private static void swapped(int[] array, int i, int j) {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        }
````
* Yukarıdaki kod şunu anlatmak istiyor en sondaki swap işlemi pivotun 
konumunu doğru ayarlamak için yapılmışır
* Yani kodda sol taraf ayarlanmıştır fakat sağ tarafın doğru olması için
pivotun sol tarafın hemen yanına yani tam ortaya gelmesi gerekir

aşağıdaki şekle bakarak anlayabiliriz

![2.png](images%2F2.png)

Bu şekilde pivotun sağı ve solu ayarlanmış olur.