public class Queue
{
   private final int [] queue;//Queue için dizi oluşturulmuştur
   private final int size;//Dizinin boyutu
   private final int front;//en öndeki eleman
   private int back;//en son elemanını ve eleman miktarını tutan kuyruk (eleman eklenirse kuyruk olması için)

    public Queue (int size)
    {
        this.size=size;//Kullanıcıdan alınan boyut bilgisi atanır
        this.queue=new int[size];
        front=0;//en öndeki elemanı sabitlemek için
        back =-1;//Diziler 0 dan başladığı için eleman eklenirse kuyruk 0 olacak
    }

    /**Stack yapısına veri ekler**/
    public void enQueue(int data)
    {
        if (isFull())
            System.out.println("Kuyruk yapısı dolu");
        else
        {
            this.back++;//ilk elemandan itibaren 0 dan başlanarak arttırma yapılır
            queue[back]=data;//sayacın her artan değeri dizinin o değerine atanır
        }
    }
    /**Stack'ten veri çıkarır**/
    public void deQueue()
    {
        if (isEmpty())
            System.out.println("Kuyruk yapısı boş");
        else
        {
            int sayi=queue[front];//çıkarılan sayı gösterilip silineceği için bir değişkene atanır
            for (int i = 1; i<= back; i++)
                queue[i-1]=queue[i];// eleman çıkarıldığı için her elaman bir öne alınır

            System.out.println("En öndeki  eleman: "+sayi);
            this.back--;//eleman sayısı azaltılır

        }
    }
    public void othorInformations()
    {
        System.out.println("------------------------------");
        System.out.println("Kuyruk max booyutu: "+this.size);
        if (back ==-1)
            System.out.println("Kuyruktaki eleman sayısı: " + 0);
        else
        System.out.println("Kuyruktaki eleman sayısı: "+(this.back +1));

        System.out.println("------------------------------");
    }


    public boolean isFull()
    {
        return back >=size-1;
    }
    public boolean isEmpty()
    {
        return back ==-1;
    }

}
