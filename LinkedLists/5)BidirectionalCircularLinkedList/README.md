![](images/Ekran%20görüntüsü%202024-01-01%20111136.png)

## Eleman ekleme

````java
Node eleman=new Node(data);
        if (head==null)
        {
            head=eleman;
            tail=eleman;

            head.next=tail;
            tail.prev=head;
        }
        else
        {
            tail.next=eleman;
            eleman.prev=tail;
            tail=eleman;

            head.prev=tail;
            tail.next=eleman;
        }
````

![](images/Ekran%20görüntüsü%202024-01-01%20112301.png)

## Eleman silme

````java
if (head==null && tail==null)
        {
            System.out.println("Liste zaten boş");
        }
        else if (head==tail)
        {
            head=null;
            tail=null;
        }
        else
        {
            tail=tail.prev;
            tail.next=head;
            head.prev=tail;
        }
````
![](images/Ekran%20görüntüsü%202024-01-01%20113600.png)