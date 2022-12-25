public class Queue
{
   private Node front;
   private Node rear;
   private int size;
   private int counter;

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
      {
         System.out.println("Kuyruk yapısı dolu");
      }
      else
      {
         Node wordChar=new Node(c);

         if (front==null)
         {
            front=wordChar;
         }
         else
         {
            rear.setNext(wordChar);
         }
         rear=wordChar;
         counter++;
      }
   }

   public char deQueue()
   {
      if (isEmpty())
      {
         System.out.println("Kuyruk yapısı boş");
      }
      else
      {
         char letter=front.getNewChar();
         front=front.getNext();
         counter--;
         return letter;
      }
      return '-';
   }

   public boolean isFull()
   {
      return counter==size;
   }
   public boolean isEmpty()
   {
      return counter==0;
   }
}
