import java.util.Scanner;

public class QueueActions
{
    Scanner input=new Scanner(System.in);
    public void run()
    {
        System.out.println("Lütfen kuyruk uzunluğunu giriniz: ");
        int size=input.nextInt();
        Queue queue=new Queue(size);

        boolean status=true;
        while (status)
        {
            System.out.println("Kuyruk işlemlerine hoşgeldiniz, Ne yapmak istersiniz");
            System.out.println("""
                    1-Sıraya Müşteri Ekle
                    2-Kuyruktaki İlk müşteriyi içeri al
                    3-Kuyruktaki bir müşterinin alacağı pideyi güncelle
                    4-En baş müşteriden en son müşteriye kadar bilgileri sırala
                    5-En son müşteriden en baş müşteriye kadar bilgileri sırala
                    0-Çıkış""");

            int choose=input.nextInt();
            switch (choose) {
                case 1 -> queue.add();
                case 2 -> queue.delete();
                case 3 -> queue.updateCustomer();
                case 4 -> queue.printAllCustomerToFirst();
                case 5 -> queue.printAllCustomerToLast();
                case 0 -> status = false;
                default -> System.out.println("Lütfen geçerli bir işlem seçiniz..");
            }
        }
    }
}
