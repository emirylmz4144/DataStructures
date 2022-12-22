import java.util.Scanner;

public class CafeSystemOtomation
{
    public void run()
    {
        Scanner input=new Scanner(System.in);
        CafeSystem cafeSystem=new CafeSystem();

        boolean status=true;
        System.out.println("BEYHUN CAFE'YE HOŞGELDİNİZ  :)");
        while (status)
        {
            System.out.println("""
                Lütfen yapmak istediğiniz işlemi seçiniz:\s
                1-Müşteri girişi ekleme
                2-Müşteri çıkışı yapma
                3-Müşteri siparişi güncelleme
                4-Müşteri Arama
                5-Müşterileri ilk girişe göre sırala
                6-Müşterileri son girişie göre sırala
                0-Çıkış""");
            int choose=input.nextInt();
            while (choose<0 || choose>6)
            {
                System.out.println("Lütfen geçerli bir işlem giriniz: ");
                choose=input.nextInt();
            }
            switch (choose) {
                case 1 -> cafeSystem.addCustomer();
                case 2 -> cafeSystem.deleteCustomer();
                case 3 -> cafeSystem.upDate();
                case 4 -> cafeSystem.search();
                case 5 -> cafeSystem.printFromFirst();
                case 6 -> cafeSystem.printFromLast();
                case 0-> status=false;
            }


        }
    }

}
