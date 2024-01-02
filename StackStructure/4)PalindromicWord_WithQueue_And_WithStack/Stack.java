public class Stack
{
     private Node top;//En üstteki değeri tutar
     private final int size;//Stack'in boyutunu tutar
     private int counter;//Stack'in kaç elemanlı olduğunu ölçmek için sayaç

    public Stack(int size) {
        this.size = size;
        this.top=null;
        this.counter=0;
    }

    public void push(char c)
    {
        if (isFull())
            System.out.println("Stack yapısı doldu");

        else
        {
            Node wordChar=new Node(c);//Her char için bir node üretilir

            if (top != null)//Stack boş değilse ;
                wordChar.setNext(top);//gelen elemanın nexti bir öncekini gösterir

            top=wordChar;//gelen eleman en yığıtın en üstüne gönderilir
            counter++;//yığıttaki eleman sayısını ölçen sayaç arttırılır
        }
    }

    public char pop()
    {
        if(!isEmpty())
        {
            char letter=top.getNewChar();//en üstteki eleman bir değişkene alınır
            top=top.getNext();//En üstteki eleman bir alttaki olarak ayarlanır
            counter--;//eleman sayısı bir azaltılır
            return letter;
        }
        else
            return Character.MIN_VALUE;//character tipinde null böyle dönderilir

    }

    public boolean isFull()
    {
        return counter==size;
    }
    public boolean isEmpty() {return counter==0;}
}
