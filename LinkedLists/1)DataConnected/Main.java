public class Main {
    public static void main(String[] args)
    {
      Node node1=new Node();
      Node node2=new Node();
      Node node3=new Node();

      node1.setValue(10);
      node2.setValue(20);
      node3.setValue(30);

      node1.setNext(node2);
      node2.setNext(node3);
      node3.setNext(null);

        Node temp=node1;
        while (temp!=null)
        {
            System.out.println(temp.getValue());
            temp=temp.getNext();
        }
    }
}