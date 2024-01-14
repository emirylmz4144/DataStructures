## MERGE SORT

``
Merge sort algoritmamız aşağıdaki şekilde anlatılmışıtr
``

![2.png](images%2F2.png)

``
Şeklin koda dökülmüş hali aşağıdadır
``
````java
public static void mergeSort(int [] array,int start,int end)
    {
        if (start<end)
        {
            int middle=(end+start)/2;

            mergeSort(array,start,middle);
            mergeSort(array,middle+1,end);

            merge(array,start,middle,end);
        }
    }
````

`` Kodun tam olarak ne yaptığı ve recursive mantığı aşağıdaki şekilde verilmiştir ``

![5.png](images%2F5.png)
![4.png](images%2F4.png)

``
Sıralama ve merge işlemi aşağıdaki şemada verilip altında ise kodu yer almaktadır
``

![3.png](images%2F3.png)

```java
int sortingIndex=start,indexOfLeftArray=0,indexOfRightArray=0;

        while (indexOfLeftArray<left.length && indexOfRightArray<right.length)
        {
            //Birleşirme işlemi yapılırken
            if (left[indexOfLeftArray]<right[indexOfRightArray])//sol değer küçükse
            {
                array[sortingIndex]=left[indexOfLeftArray];//en sola yerleştirilir
                indexOfLeftArray++;//dizinin sıralanmış elemanına küçük değer atanır
            }
            else//sağ değer küçükse
            {
                array[sortingIndex]=right[indexOfRightArray];//en sola yerleştirilir
                indexOfRightArray++;//dizinin sıralanmış elemanına küçük değer atanır
            }
            sortingIndex++;
        }

        while (indexOfLeftArray<left.length)//sağ dizide eleman varken
        {
            array[sortingIndex]=left[indexOfLeftArray];//en sağa yerleşitirilir
            indexOfLeftArray++;
            sortingIndex++;
        }
        while (indexOfRightArray<right.length)//sol dizide eleman varken
        {
            array[sortingIndex]=right[indexOfRightArray];
            indexOfRightArray++;
            sortingIndex++;
        }
    }
```