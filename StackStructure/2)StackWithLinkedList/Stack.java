public class Stack
{
    Node top;//En üstteki elemana ait özel node
    int size;//Yığıtın boyutu
    int counter;//Yığıt boyutunu ölçmek için  sayaç
    public Stack(int size)
    {
        this.size=size;
        this.top=null;
        this.counter=0;
    }

    public void push(int data)
    {
        Node value=new Node(data);//Gelen dataya bir node oluşturulur
        if (isFull())
            System.out.println("Yığın dolu!");
        else
        {
            if (isEmpty())
                top=value;//Yığıt boşsa ilk eleman gelen eleman olur
            else
            {
                value.next=top;//gelen değerin bir sonraki değeri kendinden önceki eleman olarak atanır
                top=value;//gelen değer top değeri olarak atanır
            }
            counter++;//Eleman sayısı arttırılır
        }
    }
    public void pop()
    {
        if (isEmpty())
            System.out.println("Yığın zaten boş");
        else
        {
           System.out.println("En üstteki eleman: "+top.data);
           top=top.next;//top bir önceki eleman atanır
           counter--;//Node sayısı azaltılır
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
            int temp2=counter;//counter sayısı gerçekten azalmasın diye counter'a eşit olan temp değer
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
