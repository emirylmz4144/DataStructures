import java.util.Scanner;

public class Queue
{
    private PersonNode front;
    private PersonNode rear;
    private  int size;
    private int counter;

    Scanner input=new Scanner(System.in);
    static int number=0;

    public Queue(int size)
    {
        this.size = size;
        this.front=null;
        this.rear=null;
        this.counter=0;
    }

    public void add()
    {
        System.out.println("-----------------------------------");
        if (isFull())
        {
            System.out.println("-----------------------------------");
            System.out.println("Sıra dolu ..");
            System.out.println("-----------------------------------");
        }
        else
        {
            number++;
            System.out.println("Lütfen müşteri adıını giriniz: ");  String name=input.nextLine();
            System.out.println("Lütfen alınacak pide miktarını giriniz: ");int quality=input.nextInt();
            input.nextLine();//  \n ile gelecek boş karakteri yutacak.

            PersonNode newPerson=new PersonNode(name,quality,number);

            if (front==null)
            {
                setFront(newPerson);
                setRear(newPerson);
            }
            else
            {
                getRear().setNext(newPerson);
                newPerson.setPrev(rear);
                setRear(newPerson);
            }
            counter++;
            System.out.println(newPerson.getNumber()+"numaralı müşteri sıraya eklendi");
        }
        System.out.println("-----------------------------------");
    }

    public void delete()
    {
        System.out.println("-----------------------------------");
        if (isEmpty())
        {
            System.out.println("-----------------------------------");
            System.out.println("Kuyrukta eleman yok..");
            System.out.println("-----------------------------------");
        }
        else
        {
            System.out.println("------ALINAN MÜŞTERİ BİLGİLERİ-------");
            System.out.println("Müşteri sırası: "+front.getNumber());
            System.out.println("Müşteri Adı: "+front.getName());
            System.out.println("Müşteri Pide Miktarı: "+front.getQuality());
            System.out.println("Müşterinin ödeyeceği miktar: "+front.getPrice());


            setFront(getFront().getNext());
            if (counter>1)
            {
                // eğer tek eleman varsa silindikten sonra null olmasın diye eklenen koşul
                getFront().setPrev(null);
            }
            counter--;
        }
        System.out.println("-----------------------------------");
    }


    public void updateCustomer()
    {
        System.out.println("-----------------------------------");
        if (front==null)
        {
            System.out.println("-----------------------------------");
            System.out.println("Hiç müşteri olmadığından güncelleme yapamazsınız..");
            System.out.println("-----------------------------------");
        }
        else
        {
            System.out.println("Lütfen güncellemek istediğiniz müşterinin numarasını giriniz: ");
            int id=input.nextInt();

            PersonNode temp=front;

            while (temp.getNumber()!=id)
            {
                temp=temp.getNext();
                if (temp==null)
                {
                    System.out.println("-----------------------------------");
                    System.out.println("Böyle bir müşteri yoktur..");
                    System.out.println("-----------------------------------");
                    break;
                }
            }
            if (temp!=null)
            {
                System.out.println("Kaç adet pide alacaksınız ");
                int newQuality=input.nextInt();
                temp.setQuality(newQuality);
                temp.setPrice(temp.getQuality()*3);
                System.out.println(temp.getName()+" adlı müşterinin pide miktari "+temp.getQuality()+" olarak güncellendi.");
            }

        }
        System.out.println("-----------------------------------");
    }

    public void printAllCustomerToFirst()
    {
        System.out.println("-----------------------------------");
        if (front==null)
        {
            System.out.println("-----------------------------------");
            System.out.println("Sırada bekleyen kimse yok");
            System.out.println("-----------------------------------");
        }
        else
        {
            PersonNode temp=front;
            while (temp!=null)
            {
                System.out.println("Müşteri sırası: "+temp.getNumber());
                System.out.println("Müşteri Adı: "+temp.getName());
                System.out.println("Müşteri Pide Miktarı: "+temp.getQuality());
                System.out.println("Müşterinin ödeyeceği miktar: "+temp.getPrice());
                System.out.println("----------");
                System.out.println("----------");


                temp=temp.getNext();
            }
        }
        System.out.println("-----------------------------------");
    }



    public void printAllCustomerToLast()
    {
        System.out.println("-----------------------------------");
        if (front==null)
        {
            System.out.println("-----------------------------------");
            System.out.println("Sırada kimse yok");
            System.out.println("-----------------------------------");
        }
        else
        {
            System.out.println("-----------------------------------");
            PersonNode temp=rear;
            while (temp!=null)
            {
                System.out.println("Müşteri sırası: "+temp.getNumber());
                System.out.println("Müşteri Adı: "+temp.getName());
                System.out.println("Müşteri Pide Miktarı: "+temp.getQuality());
                System.out.println("Müşterinin ödeyeceği miktar: "+temp.getPrice());
                System.out.println("----------");
                System.out.println("----------");


                temp=temp.getPrev();
            }
        }
        System.out.println("-----------------------------------");
    }

    public boolean isEmpty()
    {
        return counter==0;
    }

    public boolean isFull()
    {
        return counter==size;
    }

    public PersonNode getFront() {
        return front;
    }

    public void setFront(PersonNode front) {
        this.front = front;
    }

    public PersonNode getRear() {
        return rear;
    }

    public void setRear(PersonNode rear) {
        this.rear = rear;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
