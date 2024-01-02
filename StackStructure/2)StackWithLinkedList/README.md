## Eleman ekleme (push)
````java
 int counter;//Yığıt boyutunu ölçmek için  sayaç


        Node value=new Node(data);//Gelen dataya bir node oluşturulur
        if (isFull())
        System.out.println("Yığın dolu!");
        else
        {
        if (isEmpty())
        top=value;//Yığıt boşsa ilk eleman gelen eleman olur
        else
        {
        value.next=top;//gelen değerin bir sonraki değeri kendinden önceki eleman olarak atanır
        top=value;//gelen değer top değeri olarak atanır
        }
        counter++;//Eleman sayısı arttırılır
        }
````
![](images/Ekran%20görüntüsü%202024-01-02%20115100.png)

##Eleman silme

````java
 if (isEmpty())
            System.out.println("Yığın zaten boş");     
        else
        {
           System.out.println("En üstteki eleman: "+top.data);
           top=top.next;//top bir önceki eleman atanır
           counter--;//Node sayısı azaltılır
        }
````

![](images/Ekran%20görüntüsü%202024-01-02%20115757.png)