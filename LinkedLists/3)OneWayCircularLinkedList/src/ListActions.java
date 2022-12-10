import java.util.Scanner;

public class ListActions
{
    private final List list=new List();
    Scanner input=new Scanner(System.in);

    public void run()
    {
        while (true) {

            System.out.println("Lütfen yapmak istediğiniz işlemi giriniz: ");
            System.out.println("""
                    1-Eleman Ekleme\s
                    2-Eleman Silme \s
                    3-Listeyi görüntüle
                    0-Çıkış""");
            int choose = input.nextInt();


            if (choose == 1)
            {
                chooseDetailsAdd();
            }
            else if (choose == 2)
            {
                chooseDetailsRemove();
            }
            else if (choose == 3)
            {
                list.print();

            }
            else if (choose == 0)
            {
                System.out.println("Çıkış yapılmıştır");
                break;

            }


        }
    }
    private void chooseDetailsAdd()
    {
        System.out.println("Lütfen eklemek istediğiniz elemanı giriniz:");
        int addValue=input.nextInt();


        System.out.println("Lütfen ekleme işleminin listenin neresine olacağını seçiniz: ");
        System.out.println("""
                1-Listenin başına
                2-Listenin sonuna
                3-Lisenin arasına
                """);
        int detailsChoose=input.nextInt();


        switch (detailsChoose)
        {
            case 1 -> list.addFirst(addValue);
            case 2 -> list.addLast(addValue);
            case 3 ->
            {
                System.out.println("Lütfen elemanı hangi indexe eklemek isteğinizi yazınız: ");
                int index = input.nextInt();
                list.addToBetween(index, addValue);
            }
            default -> System.out.println("Lütfen geçerli bir işlem giriniz ");
        }
    }
    private void chooseDetailsRemove()
    {

        System.out.println("Lütfen silme  işleminin listenin neresine olacağını seçiniz: ");
        System.out.println("1-Listenin başından" +
                           "2-Listenin sonundan" +
                          "3-Lisenin arasından");
        int detailsChoose=input.nextInt();


        switch (detailsChoose)
        {
            case 1 -> list.removeFirst();
            case 2 -> list.removeLast();
            case 3 ->
            {
                System.out.println("Lütfen hangi elemanı silmek istediğinizi yazınız: ");
                int value = input.nextInt();
                list.removeToBetween(value);
            }
            default -> System.out.println("Lütfen geçerli bir işlem giriniz ");
        }
    }
}
