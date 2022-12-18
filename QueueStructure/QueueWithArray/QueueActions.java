import java.util.Scanner;

public class QueueActions
{
    public void run()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen kuyruğun max boyutunu giriniz: ");
        int queueSize=input.nextInt();
        Queue queue=new Queue(queueSize);


        boolean status=true;
        while (status)
        {
            System.out.println("""
                    Lütfen yapmak istediğiniz işlemi seçiniz
                    1-Kuyruk yapısına eleman ekleme
                    2-Kuyruktaki ilk elemanı görüntüleyip çıkarma
                    3-Diğer bilgiler
                    0-Çıkış""");

            int choose=input.nextInt();
            switch (choose) {
                case 1 -> {
                    System.out.println("Lütfen eklemek istediğiniz elemanı yazınız: ");
                    int data = input.nextInt();
                    queue.enQueue(data);
                }
                case 2 -> queue.deQueue();
                case 3 -> queue.othorInformations();
                case 0 -> status = false;
                default -> System.out.println("Hatalı seçim yaptınız..");
            }
        }

    }
}
