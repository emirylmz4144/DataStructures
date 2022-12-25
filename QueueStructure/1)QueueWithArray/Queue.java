public class Queue
{
   private final int [] queue;
   private final int size;
   private final int front;
   private int rear;

    public Queue (int size)
    {
        this.size=size;
        this.queue=new int[size];
        front=0;
        rear=-1;
    }

    public void enQueue(int data)
    {
        if (isFull())
        {
            System.out.println("Kuyruk yapısı dolu");
        }
        else
        {
            this.rear++;
            queue[rear]=data;
        }
    }
    public void deQueue()
    {
        if (isEmpty())
        {
            System.out.println("Kuyruk yapısı boş");
        }
        else
        {
            int sayi=queue[front];
            for (int i=1; i<=rear;i++)
            {
                queue[i-1]=queue[i];
            }
            System.out.println("En öndeki  eleman: "+sayi);
            this.rear--;

        }
    }
    public void othorInformations()
    {
        System.out.println("------------------------------");
        System.out.println("Kuyruk max booyutu: "+this.size);
        if (rear==-1) {System.out.println("Kuyruktaki eleman sayısı: " + 0);}
        else {System.out.println("Kuyruktaki eleman sayısı: "+(this.rear+1));}

        System.out.println("------------------------------");
    }


    public boolean isFull()
    {
        return rear>=size-1;
    }
    public boolean isEmpty()
    {
        return rear==-1;
    }

}
