public class Node
{
     int value;

     Node next; //Burada sınıf içerisinde aynı sınıfı üreterek birbirini gösterecek nodeları elde ediyoruz.

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
