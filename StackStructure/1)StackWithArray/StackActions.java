import java.util.Scanner;


public class StackActions
{

    public void run()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Dizinin büyüklüğü ne olacak: ");
        int size=input.nextInt();
        OurStack ourStack=new OurStack(size);

        boolean status=true;
        while (status)
        {
            System.out.println("""
                Diziye yapacağınız işlemi seçiniz:\s
                1-Ekleme
                2-Çıkarma
                0-Çıkış""");
            int choose=input.nextInt();
            switch (choose) {
                case 1 -> {
                    System.out.println("Gireceğiniz eleman nedir");
                    int data = input.nextInt();
                    ourStack.push(data);
                }
                case 2 -> ourStack.pop();
                case 0 -> status = false;
            }
        }

    }
}
