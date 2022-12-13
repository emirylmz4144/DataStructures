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
            tail.setNext(null);
        }

        else       //Listede eleman varsa yine başa ekler ama var olan elamanı eklenen elemanın nextine ekler.
        {
            eleman.setNext(head);
            head=eleman;
            tail.setNext(eleman);
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
            tail.setNext(eleman);
        }

        else   //Listede eleman varsa girilen sayıyı sona ekler ve kuyruğu bu elemana atar
        {
            eleman.setNext(null); //Kuyruktaki yapının next'i boş olmalıdır
            tail.setNext(eleman);  //Kuyruktaki düğümün nextini girilen elemana bağlar
            tail=eleman;//Kuyruk yapısını girilen elemana atar ki girilen eleman son eleman olsun
            tail.setNext(eleman);
        }
    }
    public void addToBetween(int index,int value)
    {
        Node eleman=new Node();
        eleman.setvalue(value);


        //elemanın başa eklenmesi için iki ihtimal vardır

        if (head==null && index==0)      //İndex 0 ve baş nullse bu ihtimale girer
        {
            eleman.setNext(null);
            head=eleman;
            tail=eleman;
            tail.setNext(eleman);
        }
       else if (head!=null && index==0)    //index 0 ve eleman doluysa
        {
            eleman.setNext(head);         //girilen düğümün nexti elemana bağlanırki eleman baş olmuş olsun
            head = eleman;                 //eleman başa atanır
            tail.setNext(eleman);
        }

        //Başa eklenmiyorsa iki ihtimal vardır ya sona ya da araya eklenecektir
        else
        {
            Node temp=head;
            Node temp2;

            int qualityOfList=0; //Düğüm miktarını ölçmek için kullanılan sayaç

            while (temp!=null)  //Düğüm miktarı ölçülür
            {
                qualityOfList++;
                temp=temp.getNext();
            }

            if (index==qualityOfList)  //Girilen index son elemana ait index ise ;
            {
                eleman.setNext(null);
                tail.setNext(eleman);     //Eleman sona atanır
                tail=eleman;
                tail.setNext(eleman);
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

            while (temp2.getNext()!=null)
            {
                temp1=temp2;
                temp2=temp2.getNext();

            }
            temp1.setNext(null);
            tail=temp1;
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
        else if (value== head.getValue())
        {
            head=head.getNext();
            counter--;
            Node.setCounter(counter);
        }
        else
        {
            Node temp1=head;
            Node temp2=head;
            while (value!=temp2.getValue())
            {
                temp1=temp2;
                temp2=temp2.getNext();
            }
            temp1.setNext(temp2.getNext());
            counter--;
            Node.setCounter(counter);

        }
    }

    public void print()
    {
        Node temp=head;
        if (temp==null)
        {
            System.out.println("Liste boştur");
        }
        else
        {
            while (temp!=null)
            {
                System.out.print("-->"+temp.getValue());
                temp=temp.getNext();
            }
        }
        System.out.println("Liste "+Node.getCounter()+" Elemanlıdır.");
    }
}
