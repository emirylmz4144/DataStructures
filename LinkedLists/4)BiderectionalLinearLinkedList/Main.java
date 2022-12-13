public class Main {
    public static void main(String[] args)
    {
       List list=new List();
       list.addToBetween(0,7);
       list.addToBetween(0,9);
       list.addToBetween(1,8);
       list.addToBetween(1,3);
       list.addToBetween(2,13);
       list.addToBetween(2,40);
       list.addToBetween(1,75);
       list.print();
       list.deleteFirst();
       list.deleteLast();
       list.print();
       list.deleteToBetween(40);
       list.print();


    }
}