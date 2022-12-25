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
                    1-Kuyruğa Eleman Ekle
                    2-Kuyruktaki İlk elemanı göster ve kuyruktan çıkar
                    3-Kuyruktaki bir elemanı güncelle
                    4-Kuyruğu baştan sona listele
                    5-Kuyruğu sondan başa listele
                    0-Çıkış""");

            int choose=input.nextInt();
            switch (choose) {
                case 1 -> queue.enQueue();
                case 2 -> queue.dequeue();
                case 3 -> queue.update();
                case 4 -> queue.printToFirst();
                case 5 -> queue.printToLast();
                case 0 -> status = false;
                default -> System.out.println("Lütfen geçerli bir işlem seçiniz..");
            }
        }
    }
}
