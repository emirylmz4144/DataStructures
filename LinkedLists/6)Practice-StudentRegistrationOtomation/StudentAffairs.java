import java.util.Scanner;

public class StudentAffairs {
    StudentNode head;
    StudentNode tail;

    Scanner input = new Scanner(System.in);

    public void addStudent() {
        //Bilgiler alınır
        System.out.println("Lütfen öğrenci   numarasını giriniz");
        int number = input.nextInt();
        input.nextLine();
        System.out.println("Lütfen öğrenici  adını      giriniz: ");
        String name = input.nextLine();
        System.out.println("Lütfen öğrenici  soyadını   giriniz: ");
        String surName = input.nextLine();
        System.out.println("Lütfen öğrenici  vize       notunu giriniz: ");
        int firstExam = input.nextInt();
        System.out.println("Lütfen öğrenici  final      notunuvgiriniz: ");
        int lastExam = input.nextInt();

        //Öğrenci node oluşturulur
        StudentNode ourNewStudent = new StudentNode(number, name, surName, firstExam, lastExam);

        if (head == null)//eğer öğrenci yoksa
        {
            head = ourNewStudent;
            tail = ourNewStudent;
            tail.next=head;
            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println(number + " numaralı ilk öğrenci kaydedildi");
        }
        else
        { //Öğrenci sona eklenir
            StudentNode temp=head;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=ourNewStudent;
            tail=ourNewStudent;
            tail.next=head;

            System.out.println("------------------------------------------");
            System.out.println(number + "  numaralı öğrenci kaydedildi");
        }
        System.out.println("------------------------------------------");


    }


    public void deleteStudent() {
        if (head == null) {
            System.out.println("Listede zaten öğrenci yok");
        }
        else
        {
            System.out.println("Lütfen silmek istediğiniz öğrencinin numarasını giriniz: ");
            int numberForDelete = input.nextInt();

            if (numberForDelete == head.getNumber() && head.next == null) {
                head = null;
                tail = null;
                System.out.println(numberForDelete + " numaralı öğrenci silindi");

            }
            else if (numberForDelete == head.getNumber())//Eğer öğrenci baştaysa
            {
                head = head.next;
                System.out.println(numberForDelete + " numaralı öğrenci silindi");

            } else
            {
                StudentNode studentNode = head;
                StudentNode studentNode2 = head;

                if (numberForDelete == tail.getNumber()) //Eğer öğrenci sondaysa
                {
                    while (studentNode2 != null)
                    {
                        studentNode = studentNode2;
                        studentNode2 = studentNode2.next;
                    }
                    tail = studentNode;
                    tail.next=head;
                    System.out.println(numberForDelete + " numaralı öğrenci silindi ");
                }
                else// Eğer öğrenci aradaysa
                {
                    studentNode = head;
                    studentNode2 = head;
                    while (studentNode2.getNumber() != numberForDelete)
                    {
                        //sondan bir önceki eleman değilse böyle bir öğrenci yoktur çünki sondaki eleman kontrolünü daha önce yapmıştık
                        if (studentNode2.next == null)
                        {
                            System.out.println("Böyle bir eleman yoktur");
                            break;
                        } else
                        {
                            studentNode = studentNode2;
                            studentNode2 = studentNode2.next;//silinecek öğrenciyi studentNode2 tutar
                        }
                    }
                    studentNode.next = studentNode2.next;//silinecek öğrenciden öncekini sonraskine bağlar ve öğrenci silinir
                    System.out.println(numberForDelete + " numaralı öğrenci silindi");
                }

            }
        }
    }


    public void listStudent()
    {
        if (head == null)
        {
            System.out.println("Liste boş");
        }
        else
        {
            StudentNode temp=head;
            while (temp!=null)
            {
                System.out.println("Öğrencinin Numarası: "+temp.getNumber());
                System.out.println("Öğrencinin Adı :     "+temp.getName());
                System.out.println("Öğrencinin Soyadı:   "+temp.getSurName());
                System.out.println("Öğrencinin Vizesi  : "+temp.getFirstExam());
                System.out.println("Öğrencinin Finali  : "+temp.getLastExam());
                System.out.println("Öğrenci  Ortalaması: "+temp.getAvarage());
                System.out.println("Öğrencinin Durumu :  "+temp.getStatus());

                temp=temp.next;
            }

        }

    }
}

