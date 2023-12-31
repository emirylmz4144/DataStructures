## Sona eleman ekleme
````java
  if (index>=qualityOfList)  //Girilen index son elemana ait veya büyük index ise ;
            {
                tail.setNext(eleman);
                tail=eleman;
                tail.setNext(head);

            }
````
![](images/Ekran%20görüntüsü%202023-12-31%20151943.png)

## Sondan eleman silme

````java
 if (value==tail.getValue())//sondaki ise
            {
                Node temp=head;
                while (temp.getNext()!=tail)//Sondan bir öncekine kadar devam eder
                {
                    temp=temp.getNext();//temp sondan bir önceki olarak atanır
                }
                temp.setNext(tail.getNext());//Sondan bir öncekinin pointerı sondakinin pointerı olarak atanır
                tail=temp;//Son eleman sondan bir öncekini olarak ayarlanır
            }
````
![](images/Ekran%20görüntüsü%202023-12-31%20153426.png)