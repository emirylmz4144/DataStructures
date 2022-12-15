public class Stack
{
    Node top;
    int size;
    int counter;
    public Stack(int size)
    {
        this.size=size;
        this.top=null;
        this.counter=0;
    }

    public void push(int data)
    {
        Node value=new Node(data);
        if (isFull())
        {
            System.out.println("Yığın dolu!");
        }
        else
        {

            if (isEmpty())
            {
                top=value;
            }
            else
            {
                value.next=top;
                top=value;
            }
            counter++;

        }
    }
    public void pop()
    {
        if (isEmpty())
        {
            System.out.println("Yığın zaten boş");
        }
        else
        {
                System.out.println("En üstteki eleman: "+top.data);
                top=top.next;
                counter--;
        }
    }

    public void print()
    {
        if (isEmpty())
        {
            System.out.println("Yığın boş");
        }
        else
        {
            Node temp=top;
            int temp2=counter;
            while (temp2!=0)
            {
                System.out.println(temp.data);
                temp=temp.next;
                temp2--;
            }
        }

    }

   public boolean isEmpty()
   {
       return top == null;
   }
   public boolean isFull()
   {
       return counter >= size;
   }
}
