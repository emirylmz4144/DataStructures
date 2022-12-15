import java.util.Scanner;

public class StackActions
{
    public void run()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Yığınınız max kaç elemanlı olacaktır?");
        int size=input.nextInt();
        Stack stack=new Stack(size);

        boolean status=true;
        while (status)
        {
            System.out.println("""
                    Lütfen yapmak istediğiniz işlemi seçiniz
                    1-Yığına eleman ekleme
                    2-En üstteki elemanı göster ve çıkar
                    3-Yığını listele
                    0-Çıkış""");

            int choose=input.nextInt();
            switch (choose) {
                case 1 ->
                {
                    System.out.println("Eklemek istediğiniz elemanı giriniz: ");
                    int value = input.nextInt();
                    stack.push(value);
                }
                case 2 -> stack.pop();
                case 3 -> stack.print();
                case 0 -> status = false;
                default -> System.out.println("Lütfen geçerli bir işlem seçiniz");
            }
        }


    }
}
