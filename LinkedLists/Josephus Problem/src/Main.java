import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Circular circular=new Circular();
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen josephon problemine kaç kişinin katılacağını yazınız: ");
        int personNumber=input.nextInt();

        for (int i=1; i<personNumber;i++)
        {
            circular.add(i);
        }

        Node startingNode=circular.head;
        while (circular.quality()>2)
        {
            circular.print();
            circular.delete(startingNode);
            startingNode=circular.head.next.next;
        }
    }
}