public class Queue
{
   private Node front;//Kuyruktaki en önde olan elemana özel bir node
   private Node rear;//Kuyruk mantığı ile elemanları her zaman bir arkaya ekleriz
   private int size;//Kuyruğun boyutunu ölçer
   private int counter;//Kuyruktaki eleman miktarını ölçmek için kullanılır

   public Queue(int size)
   {
      this.size=size;
      this.rear=null;
      this.front=null;
      this.counter=0;
   }

   public void enQueue(char c)
   {
      if (isFull())
         System.out.println("Kuyruk yapısı dolu");
      else
      {
         Node wordChar=new Node(c);//Her karaktere bir node oluşturulur

         if (front==null)//Hiç eleman yokse
            front=wordChar;//gelen eleman en öne eklenir

         rear.setNext(wordChar);//gelen eleman kuyruğun bir sonraki elemanı olarak ayarlanır
         rear=wordChar;//bir sonraki elemanı olarak ayarlandıktan sonra kendisi kuyruk olur
         counter++;
      }
   }

   public char deQueue()
   {
      if (isEmpty())
      {
         System.out.println("Kuyruk yapısı boş");
         return Character.MIN_VALUE;//character veri tipinde null ifadesi bu şekilde döndürülür
      }
      else
      {
         char letter=front.getNewChar();//elemanlar en önden alınır
         front=front.getNext();//bir arkadaki en öne alınır
         counter--;
         return letter;
      }
   }
   public boolean isFull() {return counter==size;}
   public boolean isEmpty() {return counter==0;}
}
