public class Node
{
    private int value;
    private Node next;
    private static int counter=0;
    public Node()
    {
        counter++;
    }
    public Node getNext()
    {
        return this.next;
    }
    public void setNext(Node next)
    {
        this.next=next;
    }
    public int getValue() {return this.value;}
    public void setvalue(int value) {
        this.value = value;
    }
    public static int getCounter() {return counter;}

    public static void setCounter(int counter) {Node.counter = counter;}
}
