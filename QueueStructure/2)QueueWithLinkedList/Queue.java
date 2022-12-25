import java.util.Scanner;

public class Queue
{
    private QueueNode front;
    private QueueNode rear;
    private final int size;
    private int counter;

    Scanner input=new Scanner(System.in);

    public Queue(int size)
    {
        this.size=size;
        this.front=null;
        this.rear=null;
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

            if (front==null)
            {
                setFront(queueNode);
                setRear(queueNode);
            }
            else
            {
                getRear().setNext(queueNode);
                queueNode.setPrev(rear);
                setRear(queueNode);
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
            System.out.println("Kuyruğa ilk giren eleman: "+front.getData());
            setFront(getFront().getNext());
            if (counter>1)
            {
                getFront().setPrev(null);
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


            QueueNode temp=front;
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
            QueueNode temp=front;
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
        if (front==null)
        {
            System.out.println("-----------------------------------");
            System.out.println("Yazdırılacak eleman yok..");
            System.out.println("-----------------------------------");
        }
        else
        {System.out.println("-----------------------------------");
            QueueNode temp=rear;
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

    public QueueNode getFront() {
        return front;
    }

    public void setFront(QueueNode front) {
        this.front = front;
    }

    public QueueNode getRear() {
        return rear;
    }

    public void setRear(QueueNode rear) {
        this.rear = rear;
    }

}
