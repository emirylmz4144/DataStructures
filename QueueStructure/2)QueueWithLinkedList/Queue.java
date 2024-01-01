import java.util.Scanner;

public class Queue
{
    private QueueNode top;//En üstteki elemanı tutan node
    private QueueNode back;//En arkadaki elemanı tutan node
    private final int size;//Yığıtın boyutu
    private int counter;//Yığıttaki eleman miktarı

    Scanner input=new Scanner(System.in);

    public Queue(int size)
    {
        this.size=size;
        this.top =null;
        this.back =null;
        this.counter=0;
    }

    public void enQueue()
    {
        if (isFull())
        {
            System.out.println("-----------------------------------");
            System.out.println("Kuyruk yapısı dolu..");
            System.out.println("-----------------------------------");
        }
        else
        {
            System.out.println("-----------------------------------");
            System.out.println("Lütfen bir eleman giriniz: ");
            int value=input.nextInt();

            QueueNode queueNode=new QueueNode(value);

            if (top ==null)//Eğer top boşsa ilk eleman gelen değerdir ve en arkada en önde bu elemandır
            {
                setTop(queueNode);
                setBack(queueNode);
            }
            else
            {
                getBack().setNext(queueNode);//En arkadaki elemanın bir arkası yeni gelen eleman olarak atanır
                queueNode.setPrev(back);//
                setBack(queueNode);
            }
            counter++;


            System.out.println("-----------------------------------");
            System.out.println("Eleman eklendi: "+value);
            System.out.println("-----------------------------------");
            System.out.println("-----------------------------------");
        }
    }

    public  void dequeue()
    {
        if (isEmpty())
        {
            System.out.println("-----------------------------------");
            System.out.println("Kuyrukta eleman yok..");
            System.out.println("-----------------------------------");
        }
        else
        {
            System.out.println("-----------------------------------");
            System.out.println("Kuyruğa ilk giren eleman: "+ top.getData());
            setTop(getTop().getNext());
            if (counter>1)
            {
                getTop().setPrev(null);
            }
            counter--;
            System.out.println("-----------------------------------");
        }
    }

    public void update()
    {
        if (isEmpty())
        {
            System.out.println("-----------------------------------");
            System.out.println("Listede zaten eleman yok..");
            System.out.println("-----------------------------------");
        }
        else
        {
            System.out.println("-----------------------------------");
            System.out.println("Kaçıncı sıradaki elemanı güncelleyeceksiniz: ");
            int index=input.nextInt();

            while (index>counter)
            {
                System.out.println("Lütfen kuyruk sırasından küçük eleman giriniz: ");
                index=input.nextInt();
            }


            QueueNode temp= top;
            int intTemp=1;

            while (index!=intTemp)
            {
                temp=temp.getNext();
                intTemp++;
            }
            System.out.println("Bu sıradaki elemanın yerine hangi sayıyı girmek istersiniz: ");
            int oldValue=temp.getData();
            int newValue=input.nextInt();
            temp.setData(newValue);

            System.out.println("-----------------------------------");
            System.out.print("Eleman güncellendi: "+oldValue+"->"+temp.getData()+"\n");
            System.out.println("-----------------------------------");
            System.out.println("-----------------------------------");
        }


    }

    public  void printToFirst()
    {
        if (isEmpty())
        {
            System.out.println("-----------------------------------");
            System.out.println("Yazdırılacak eleman yok..");
            System.out.println("-----------------------------------");
        }
        else
        {
            System.out.println("-----------------------------------");
            QueueNode temp= top;
            for (int i=1;i<=counter;i++)
            {
                System.out.println(i+". sıradaki eleman: "+temp.getData());
                temp=temp.getNext();
            }
            System.out.println("-----------------------------------");
        }

    }

    public void printToLast()
    {
        if (top ==null)
        {
            System.out.println("-----------------------------------");
            System.out.println("Yazdırılacak eleman yok..");
            System.out.println("-----------------------------------");
        }
        else
        {System.out.println("-----------------------------------");
            QueueNode temp= back;
            for (int i=counter;i>=1;i--)
            {
                System.out.println(i+".sıradaki eleman: "+temp.getData());
                temp=temp.getPrev();
            }
            System.out.println("-----------------------------------");

        }

    }

    public boolean isEmpty()
    {
        return counter==0;
    }

    public boolean isFull()
    {
        return counter==size;
    }

    public QueueNode getTop() {
        return top;
    }

    public void setTop(QueueNode top) {
        this.top = top;
    }

    public QueueNode getBack() {
        return back;
    }

    public void setBack(QueueNode back) {
        this.back = back;
    }

}
