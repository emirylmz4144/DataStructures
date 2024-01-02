import java.util.Scanner;

public class Queue
{
    private QueueNode top;//En üstteki elemanı tutan node
    private QueueNode back;//En arkadaki elemanı tutan ve eleman eklenirse onu kuyruk yapacak node
    private final int size;//Kuyruğun boyutu
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
            System.out.println("Kuyruk yapısı dolu..");
        else
        {
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
                queueNode.setPrev(back);//Kuyruk mantığına uyarak kendisinden önce gelen bir önündekidir (okul sırası)
                setBack(queueNode);// En son gelen en arka yani kuyruk olur
            }
            counter++;//Kuyruktaki eleman sayısı bir arttı

            System.out.println("Eleman eklendi: "+value);
        }
    }
    public  void dequeue()
    {
        if (isEmpty())
            System.out.println("Kuyrukta eleman yok..");
        else
        {
            System.out.println("Kuyruğa ilk giren eleman: "+ top.getData());
            setTop(getTop().getNext());//Eleman çıktığına göre bir sonraki en öndeki olan çıkanın bir arkasındakidir
            if (counter>1)
                getTop().setPrev(null);//En öne gelen elemanın önünde kimse olmadığından önü boş ayarlanır
            counter--;
        }
    }

    public void update()
    {
        if (isEmpty())
            System.out.println("Listede zaten eleman yok..");
        else
        {
            System.out.println("Kaçıncı sıradaki elemanı güncelleyeceksiniz: ");
            int index=input.nextInt();

            while (index>counter)//Güncellemek istenen kişi var olan kişi sayısından büyükse
                System.out.println("Lütfen kuyruk sırasından küçük eleman giriniz: ");  index=input.nextInt();

            QueueNode temp= top;//Güncellenmek istenen kişiyi bulmak için bir temp node'u
            int intTemp=1;

            while (index!=intTemp)//Girilen indexe gelene kadar temp artar
            {
                temp=temp.getNext();
                intTemp++;
            }
            System.out.println("Bu sıradaki elemanın yerine hangi sayıyı girmek istersiniz: ");
            int oldValue=temp.getData();
            int newValue=input.nextInt();
            temp.setData(newValue);

            System.out.print("Eleman güncellendi: "+oldValue+"->"+temp.getData()+"\n");
        }


    }

    /**Kuyruğu baştan listeler**/
    public  void printToFirst()
    {
        if (isEmpty())
            System.out.println("Yazdırılacak eleman yok..");
        else
        {
            QueueNode temp= top;
            for (int i=1;i<=counter;i++)
            {
                System.out.println(i+". sıradaki eleman: "+temp.getData());
                temp=temp.getNext();
            }
        }

    }

    /**Kuyruğu sondan listeler**/
    public void printToLast()
    {
        if (top ==null)
            System.out.println("Yazdırılacak eleman yok..");
        else
        {
            QueueNode temp= back;
            for (int i=counter;i>=1;i--)
            {
                System.out.println(i+".sıradaki eleman: "+temp.getData());
                temp=temp.getPrev();
            }

        }
    }

    public boolean isEmpty() {return counter==0;}
    public boolean isFull() {return counter==size;}
    public QueueNode getTop() {return top;}
    public void setTop(QueueNode top) {this.top = top;}
    public QueueNode getBack() {return back;}
    public void setBack(QueueNode back) {this.back = back;}

}
