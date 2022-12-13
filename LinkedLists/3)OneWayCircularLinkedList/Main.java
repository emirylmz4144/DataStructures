public class Main {
    public static void main(String[] args)
    {
        ListActions listActions=new ListActions();
        listActions.run();
        List list =new List();
        System.out.println(list.tail.getNext().getValue());
    }

}