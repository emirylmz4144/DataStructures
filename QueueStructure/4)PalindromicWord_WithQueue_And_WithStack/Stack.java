public class Stack
{
     private Node top;
     private int size;
     private int counter;

    public Stack(int size) {
        this.size = size;
        this.top=null;
        this.counter=0;
    }

    public void push(char c)
    {
        if (isFull())
        {
            System.out.println("Stack yapısı doldu");
        }
        else
        {
            Node wordChar=new Node(c);

            if (top != null)
            {
                wordChar.setNext(top);
            }
            top=wordChar;
            counter++;
        }

    }

    public char pop()
    {
        if(!isEmpty())
        {
            char letter=top.getNewChar();
            top=top.getNext();
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



    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
