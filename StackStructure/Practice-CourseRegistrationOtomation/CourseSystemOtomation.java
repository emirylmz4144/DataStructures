import java.util.Scanner;

public class CourseSystemOtomation
{
    Scanner input=new Scanner(System.in);
    public void run()
    {
        System.out.println("Lütfen maximum kapasiteyi giriniz: ");
        int capasity=input.nextInt();
        Course course=new Course(capasity);


        boolean status=true;
        while (status)
        {
            System.out.println("""
                    Lütfen yapacağınız işlemi seçiniz:\s
                    1-Öğrenci Ekleme
                    2-En son eklenen öğrenci bilgileri
                    3-Öğrenci bilgilerini güncelle
                    0-Çıkış""");

            int choose=input.nextInt();
            switch (choose)
            {
                case 1 -> course.push();
                case 2 -> course.pop();
                case 3 -> course.changeStudentInformations();
                case 0 -> status = false;
                default -> System.out.println("Lütfen geçerli bir işlem giriniz..");
            }
        }




    }
}
