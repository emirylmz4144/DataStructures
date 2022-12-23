import java.util.Scanner;

public class Course
{
    private final int capasity;
    private StudentNode top;
    private int counter;
    static int id=0;

    Scanner input=new Scanner(System.in);

    Course (int capasity)
    {
        this.capasity=capasity;
        this.counter=0;
        this.top=null;
    }

    public void push()
    {
        if (isFull())
        {
            System.out.println("Yığın doldu..");
        }
        else
        {
            System.out.println("Lütfen öğrenci adını giriniz "); String name=input.nextLine();
            System.out.println("Lütfen öğrencinin aldığı kursun adını giriniz ");  String course=input.nextLine();
            System.out.println("Lütfen öğrencinin yaşını giriniz: "); int age=input.nextInt();
            input.nextLine();
            id++;

            StudentNode newStudent=new StudentNode(name,course,age,id);

            if (top != null)
            {
                newStudent.setNext(top);
            }
            top=newStudent;
            this.counter++;
        }


    }

    public void pop()
    {
        if (isEmpty())
        {
            System.out.println("Yığın boş..");
        }
        else
        {
            System.out.println("-------Sisteme en son eklenen öğrenci bilgileri-----------");
            System.out.println("Mezun edilen öğreci id: "+top.getId());
            System.out.println("Mezun edilen öğreci adı: "+top.getName());
            System.out.println("Mezun edilen öğreci kursu: "+top.getLesson());
            System.out.println("Mezun edilen öğreci yaşı: "+top.getAge());
            System.out.println("----------------------------------------------------------------");


            top=top.getNext();
            this.counter--;
        }

    }

    public void changeStudentInformations()
    {
        if (isEmpty())
        {
            System.out.println("Hiç öğrenci olmadığından güncelleme yapamazsınız..");
        }
        else
        {
            System.out.println("Lütfen güncellenecek öğrenci id sini giriniz: ");
            int id=input.nextInt();

            StudentNode temp=top;
            while (temp.getId()!=id)
            {
                temp=temp.getNext();
                if (temp==null)
                {
                    System.out.println("Böyle bir öğrenci yoktur..");
                    break;
                }
            }
            if (temp!=null)
            {
                System.out.println("""
                    Hangi bilgiyi değiştireceksiniz:\s
                    <A>d değişikliği
                    <K>urs değişikliği
                    <Y>aşını değişikliği
                    <C>ıkıs""");

                String choose=input.nextLine();
                while (choose.length()!=1)
                {
                    System.out.println("Lütfen tek bir harf giriniz: ");
                    choose=input.nextLine();
                }
                choose=choose.toUpperCase();

                while (!choose.equals("C"))
                {
                    System.out.println("Değişiklik yapmaktan vazgeçtiyseniz 'c' tuşuna basınız " +
                            "yapmak isterseniz anahtar harfi tekrar tuşlayınız:   ");// Başka bilgileri güncellemek istemezsek c harfine basarız
                    choose=input.nextLine();
                    choose=choose.toUpperCase();

                    switch (choose)
                    {
                        case "A" ->
                        {
                            System.out.println("Yeni adı giriniz: ");
                            String name = input.nextLine();
                            temp.setName(name);
                            System.out.println("Ad başarı ile güncellendi");
                        }
                        case "K" ->
                        {
                            System.out.println("Yeni kursu giriniz: ");
                            String course = input.nextLine();
                            temp.setLesson(course);
                            System.out.println("Kurs adı başarı ile güncellendi");
                        }
                        case "Y" ->
                        {
                            System.out.println("Yeni yaşı giriniz: ");
                            int age = input.nextInt();
                            temp.setAge(age);
                            System.out.println("Yaş başarı ile güncellendi");
                        }
                        default -> System.out.println("Lütfen geçerli bir işlem giriniz..");
                    }
                }

            }
        }

    }


    public boolean isEmpty()
    {
        return this.counter==0;
    }

    public  boolean isFull()
    {
        return capasity==this.counter;
    }
}
