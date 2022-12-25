import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz: ");
        String word=input.nextLine();

        char [] charArray=word.toCharArray();
        int size=charArray.length;


        Stack stack=new Stack(size);
        Queue queue=new Queue(size);

        for (int i=0;i<size;i++)
        {
            stack.push(charArray[i]);
            queue.enQueue(charArray[i]);
        }

        boolean result=true;

        while (!stack.isEmpty())
        {
            if (stack.pop()!=queue.deQueue())
            {
                result=false;
                break;
            }
        }

        if(result)
        {
            System.out.println("Palindromik kelime girdiniz..");
        }
        else
        {
            System.out.println("Girdiğiniz kelime palindromik değildir");
        }
    }
}