import java.util.Scanner;

public class CafeSystem
{
   private CustomerNode head=null;
   private  CustomerNode tail=null;
   Scanner input= new Scanner(System.in);

   static int id;


    public void addCustomer()
    {
        CafeSystem.id++;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen müşteri adını giriniz: "); String name=input.nextLine();
        System.out.println("Lütfen müşteri siparişini giriniz: "); String order=input.nextLine();
        CustomerNode customer=new CustomerNode(name,order,id);

        if (head==null)
        {
            head=customer;
            tail=customer;
        }

        else
        {
            CustomerNode temp=head;
            while (temp.getNext()!=null)
            {
                temp=temp.getNext();
            }
            temp.setNext(customer);
            customer.setPrev(temp);
            tail=customer;

            System.out.println(customer.getId()+" Numaralı müşteri kaydedilmiştir");
        }
    }



    public void deleteCustomer()
    {
        System.out.println("Silmek istediğiniz müşteri id sini yazınız: ");
        int deleteId=input.nextInt();

        if (head==null)
        {
            System.out.println("Zaten müşteri yok");
        }

        else if (head.getNext()==null && head.getId()==deleteId)
        {
            System.out.println(head.getId()+" Numaralı müşteri silinimiştir");
            head=null;
            tail=null;
        }


        else if (head.getNext()!=null && head.getId()==deleteId)
        {
            System.out.println(head.getId()+" Numaralı müşteri silinimiştir");
            head=head.getNext();
            head.setPrev(null);
        }

        else if (tail.getId()==deleteId)
        {
            System.out.println(tail.getId()+" Numaralı müşteri silinmiştir..");
            tail=tail.getPrev();
            tail.setNext(null);
        }
        else
        {
            CustomerNode temp=head;
            while (temp.getId()!=deleteId)
            {
                temp=temp.getNext();
                if (temp==null)
                {
                    System.out.println("Böyle bir müşteri bulunmamaktadır..");
                    break;
                }
            }

            if (temp!=null)
            {
                System.out.println(temp.getId()+" Numaralı öğrenci silimmiştir..");
                temp.getPrev().setNext(temp.getNext());
                temp.getNext().setPrev(temp.getPrev());
            }
        }

    }

    public void upDate()
    {
        if (head==null)
        {
            System.out.println("Zaten hiç müşteri yok");
        }
        else
        {
            CustomerNode temp=head;
            System.out.println("Lütfen güncellemek istediğiniz müşteri id sini giriniz: ");
            int id=input.nextInt();

            while (temp.getId()!=id)
            {
                temp=temp.getNext();
                if (temp==null)
                {
                    System.out.println("Böyle bir müşteri yoktur..");
                    break;
                }
            }
            if (temp!=null)
            {
                System.out.println("Lütfen yeni siparişi giriniz: ");
                String newOrder=input.nextLine();
                temp.setOrder(newOrder);
                System.out.println("Sipariş başarı ile güncellendi..");
            }
        }

    }

    public void search()
    {
        if (head==null)
        {
            System.out.println("Zaten hiç müşteri yok..");
        }
        else
        {
            CustomerNode temp=head;
            System.out.println("Lütfen güncellemek istediğiniz müşteri id sini giriniz: ");
            int id=input.nextInt();

            while (temp.getId()!=id)
            {
                temp=temp.getNext();
                if (temp==null)
                {
                    System.out.println("Böyle bir müşteri yoktur..");
                    break;
                }
            }
            if (temp!=null)
            {
                System.out.println("------ARANAN MÜŞTERİ BİLGİLERİ----------");
                System.out.println("MÜŞTERİ ID: "+temp.getId());
                System.out.println("MÜŞTERİ ADI: "+temp.getName());
                System.out.println("MÜŞTERİ SİPARİŞİ: "+temp.getOrder());
                System.out.println("-------------------------------------------");
            }
        }

    }


    public void printFromFirst()
    {
        if (head==null)
        {
            System.out.println("Zaten müşteri yok");
        }
        else
        {

            CustomerNode temp=head;
            System.out.println("-----------MÜŞTERİ BİLGİLERİ---------------");
            while (temp!=null)
            {
                System.out.println("MÜŞTERİ ID: "+temp.getId());
                System.out.println("MÜŞTERİ ADI: "+temp.getName());
                System.out.println("MÜŞTERİ SİPARİŞİ: "+temp.getOrder());
                System.out.println("-------------------------------------------");

                temp=temp.getNext();
            }
        }
    }
    public void printFromLast()
    {
        if (head==null)
        {
            System.out.println("Zaten müşteri yok");
        }
        else
        {
            CustomerNode temp=tail;
            System.out.println("-----------MÜŞTERİ BİLGİLERİ---------------");
            while (temp!=null)
            {
                System.out.println("MÜŞTERİ ID: "+temp.getId());
                System.out.println("MÜŞTERİ ADI: "+temp.getName());
                System.out.println("MÜŞTERİ SİPARİŞİ: "+temp.getOrder());
                System.out.println("-------------------------------------------");

                temp=temp.getPrev();
            }
        }

    }
}
