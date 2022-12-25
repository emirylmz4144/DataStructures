public class Node
{
    private char newChar;
    private Node next;

    public Node(char newChar)
    {
        this.newChar=newChar;
        this.next=null;
    }

    public char getNewChar() {
        return newChar;
    }

    public void setNewChar(char newChar) {
        this.newChar = newChar;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
