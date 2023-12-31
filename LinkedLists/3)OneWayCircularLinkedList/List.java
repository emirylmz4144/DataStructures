public class List
{
    Node head=null;
    Node tail=null;

    public void addFirst(int value)       //Başa eleman ekleme için kullanılır
    {
        Node eleman=new Node();              //Eklenecek eleman için düğüm oluşturulur
        eleman.setvalue(value);              //Girilen değer oluşan düğüme atanır

        if (head==null)                      //Listede eleman yoksa girilen elemanı başa ve sona ekler
        {
            eleman.setNext(null);
            head=eleman;
            tail=eleman;
            tail.setNext(head);
        }

        else       //Listede eleman varsa yine başa ekler ama var olan elamanı eklenen elemanın nextine ekler.
        {
            eleman.setNext(head);
            head=eleman;
            tail.setNext(head);
        }
    }



    public void addLast(int value)   //Sona eleman eklemek için kullanılır
    {
        Node eleman=new Node();        //Eklenecek eleman için düğüm oluşturulur
        eleman.setvalue(value);        //Girilen değer oluşan düğüme atanır

        if (head==null)               //Listede eleman yoksa girilen elemanı başa ve sona ekler
        {
            eleman.setNext(null);
            head=eleman;
            tail=eleman;
            tail.setNext(head);
        }

        else   //Listede eleman varsa girilen sayıyı sona ekler ve kuyruğu bu elemana atar
        {
            eleman.setNext(null); //Kuyruktaki yapının next'i boş olmalıdır
            tail.setNext(eleman);  //Kuyruktaki düğümün nextini girilen elemana bağlar
            tail=eleman;       //Kuyruk yapısını girilen elemana atar ki girilen eleman son eleman olsun
            tail.setNext(head);
        }
    }
    public void addToBetween(int index,int value)
    {
        Node eleman=new Node();
        eleman.setvalue(value);


        //elemanın başa eklenmesi için iki ihtimal vardır

        if (head==null)      //İndex 0 ve baş nullse bu ihtimale girer
        {
            eleman.setNext(null);
            head=eleman;
            tail=eleman;
            tail.setNext(head);
        }
       else if (head!=null && index==0)    //index 0 ve eleman doluysa
        {
            eleman.setNext(head);         //girilen düğümün nexti elemana bağlanırki eleman baş olmuş olsun
            head = eleman;                 //eleman başa atanır
        }

        //Başa eklenmiyorsa iki ihtimal vardır ya sona ya da araya eklenecektir
        else
        {
            Node temp=head;
            Node temp2;

            int qualityOfList=0; //Düğüm miktarını ölçmek için kullanılan sayaç

            while (temp!=tail) //Dairesel olduğu için asla null olmaz
            {
               qualityOfList++;
               temp=temp.getNext();
            }

            if (index>=qualityOfList)  //Girilen index son elemana ait veya büyük index ise ;
            {
                tail.setNext(eleman);
                tail=eleman;
                tail.setNext(head);

            }
            else                     //Girilen eleman sona ait değilse araya eklenecek demektir
            {
                //Girilen eleman 2 ve 3.index arasına girecekse     ;

                temp=head;    //2 ve 3 e ait olan düğümleri geçici olarak tutan temp düğümleri oluşturulacak
                temp2=head;    //Oluşan temp düğümleri girecek olan düğümü rahatça araya alabilecektir
                int i=0;
                while (i!=index)
                {
                    temp2=temp;    //Hangi indexe girileceğini belirler
                    temp=temp.getNext();   //O indise girdikten sonra ise elemanın nextini bir sonraki düğüme bağlamak için bir sonraki düğümü tutar
                    i++;
                }
                temp2.setNext(eleman);
                eleman.setNext(temp);     //Yukarıda bahsedilen işlemler

            }
        }
    }
    public void removeFirst()
    {
        int counter=Node.getCounter();
        if(head==null)
        {
            System.out.println("Listede zaten eleman yok");
        }
        else if (head.getNext()==null)
        {
            head=null;
            tail=null;
            counter--;
            Node.setCounter(counter);
        }
        else
        {
            head=head.getNext();
            counter--;
            Node.setCounter(counter);

        }
    }
    public void removeLast()
    {
        int counter=Node.getCounter();
        if (head==null)
        {
            System.out.println("Liste zaten boştur");
        }
        else if (head.getNext()==null)
        {
            head=null;
            tail=null;
            counter--;
            Node.setCounter(counter);
        }
        else
        {
            Node temp1=head;
            Node temp2=head;

            while (temp2.getNext()!=head)//Son elemanın nexti başı gösterdiği için sona geldiğimizi bu yolla anlarız
            {
                temp1=temp2;
                temp2=temp2.getNext();

            }
            //Sondan bir önceki elaman sona atanır ve nexti başı gösterir
            tail=temp1;
            tail.setNext(head);
            counter--;
            Node.setCounter(counter);

        }

    }
    public void removeToBetween(int value)
    {
        int counter=Node.getCounter();
        if (head==null )
        {
            System.out.println("Liste zaten boştur");
        }
        else if(head==tail && value==head.getValue())//Değer baştaki ise ve baştaki tek elemansa
        {
            head=null;
            tail=null;
        }
        else if (value== head.getValue())//Değer sadece baştaki elemansa
        {
            head=head.getNext();
            counter--;
            Node.setCounter(counter);
        }

        else // O zaman ya sondaki ya da ortalardaki bir eleman silinecek
        {
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
            else {
                Node temp1 = head;
                Node temp2 = head;
                while (value != temp2.getValue())
                {
                    temp1 = temp2;
                    temp2 = temp2.getNext();
                }
                temp1.setNext(temp2.getNext());
            }


        }
    }

    public void print()
    {
        Node temp=head;
        if (head==null)
        {
            System.out.println("Liste boştur");
        }
        else
        {
           while (temp!=tail)
           {
               while (temp!=tail)
               {
                   System.out.println("-->"+temp.getValue());
                   temp=temp.getNext();
               }
               System.out.println("-->"+tail.getValue());
           }

        }
        System.out.println("Liste "+Node.getCounter()+" Elemanlıdır.");
    }
}
