import java.util.Scanner;

public class StudentAffairsActions
{
    public void run()
    {
        Scanner input=new Scanner(System.in);
        StudentAffairs studentAffairs=new StudentAffairs();

        boolean status=true;
        while (status)
        {
            System.out.println("""
                Öğrenci işleri otomasyonu sistemine hoşgeldiniz:\s
                Yapmak istediğiniz işlemi seçiniz:
                1-Öğrenci Ekle
                2-Öğrenci sil
                3-Öğrencileri listele
                0-Çıkış yap""");

            int choose=input.nextInt();
            switch (choose) {
                case 1 -> studentAffairs.addStudent();
                case 2 -> studentAffairs.deleteStudent();
                case 3 -> studentAffairs.listStudent();
                case 0 -> status = false;
                default -> System.out.println("Lütfen geçerli bir işlem giriniz: ");
            }

        }

    }
}
