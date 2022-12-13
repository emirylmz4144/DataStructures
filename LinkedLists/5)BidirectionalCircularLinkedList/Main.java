public class Main {
    public static void main(String[] args)
    {
        List list=new List();
        list.addToFirst(0);
        list.addToBetween(1,1);
        list.addToBetween(2,2);
        list.addToLast(3);
        list.addToBetween(1,4);
        list.print();
        list.deleteToBetween(3);
        list.deleteToBetween(0);
        list.deleteToBetween(2);
        list.deleteToBetween(4);
        list.deleteToBetween(1);

        list.print();
    }
}