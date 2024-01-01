![](images/Ekran%20görüntüsü%202024-01-01%20094638.png)

## Eleman ekleme
````java
/*araya ekleme iki eleman arasına yapılacağı için iki temp oluşturuyoruz çünki elemean bu
                * ikisinin arasına girecektir */
              else// Sona da eklemiyorsa kesin araya ekleyecektir
                      {
                      /*araya ekleme iki eleman arasına yapılacağı için iki temp oluşturuyoruz çünki elemean bu
                       * ikisinin arasına girecektir */
                      temp1=head;
                      Node temp2=head;
                      int n=0;//index için sayaç
                      while (index!=n)
                      {
                      temp1=temp2;
                      temp2=temp2.next;
                      n++;
                      }
                      temp1.next=value;
                      value.prev=temp1;
                      value.next=temp2;
                      temp2.prev=value;
                      }
````
![](images/Ekran%20görüntüsü%202024-01-01%20100815.png)

## Eleman silme 
````java
else
        {
            if (value==tail.data)
            {
                tail.prev.next=null;//Aradaki bağ koparılırılarak ilk head boşa çıkarılır
                tail=tail.next;
            }
            else
            {
                Node temp1=head;
                Node temp2=head;

                while (temp2.data!=value)
                {
                    temp1=temp2;
                    temp2=temp2.next;
                }
                temp1.next=temp2.next;
                temp2.next.prev=temp2.prev;
            }
        }
````

![](images/Ekran%20görüntüsü%202024-01-01%20104300.png)