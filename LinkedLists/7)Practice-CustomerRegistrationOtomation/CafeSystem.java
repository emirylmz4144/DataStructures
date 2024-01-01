import java.util.Scanner;

public class CafeSystem
{
   private CustomerNode head=null;
   private  CustomerNode tail=null;
   Scanner input= new Scanner(System.in);

   static int id;


   /**Yeni müşteri eklenir**/
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
            while (temp.getNext()!=null)//En sona ekleme yapılacağı için sona gidilmiştir
            {
                temp=temp.getNext();
            }
            temp.setNext(customer);
            customer.setPrev(temp);
            tail=customer;//En sona eklenen müşteri aynı zamanda kuyruk olarak ayarlanmıştır

            System.out.println(customer.getId()+" Numaralı müşteri kaydedilmiştir");
        }
    }



    /**Müşteri güncellenir**/
    public void deleteCustomer()
    {
        System.out.println("Silmek istediğiniz müşteri id sini yazınız: ");
        int deleteId=input.nextInt();

        if (head==null)
        {
            System.out.println("Zaten müşteri yok");
        }

        else if (head.getNext()==null && head.getId()==deleteId)//Tek eleman var ve o da head ise
        {
            System.out.println(head.getId()+" Numaralı müşteri silinimiştir");
            head=null;
            tail=null;
        }


        else if (head.getNext()!=null && head.getId()==deleteId)//head'den sonra eleman varsa
        {
            System.out.println(head.getId()+" Numaralı müşteri silinimiştir");
            head=head.getNext();
            head.setPrev(null);
        }

        else if (tail.getId()==deleteId)//Son eleman silinecekse
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
                if (temp==null)//Bir önceki ifte son eleman ise şartı sağlanmadığı halde temp null olursa demekki öyle bir eleman yok
                {
                    System.out.println("Böyle bir müşteri bulunmamaktadır..");
                    break;
                }
            }

            if (temp!=null)
            {
                System.out.println(temp.getId()+" Numaralı öğrenci silimmiştir..");
                temp.getPrev().setNext(temp.getNext());//Aradaki elemanın öncekini aradaki elemanın sonrasına bağla
                temp.getNext().setPrev(temp.getPrev());//aradaki elemanın sonrasın aradaki elemanın öncekine bağla
            }
        }

    }

    /**Müşteri siparişi güncellenir**/
    public void update()
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

    /**Müşteri id bilgisine göre aranır ve bilgileri ekrana yazdırılır**/
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


    /**Müşteriler ekrana ilk müşteriden başlayarak yazdırılır**/
    public void printFromFirst()
    {
        if (head==null)
        {
            System.out.println("Zaten müşteri yok");
        }
        else
        {

            CustomerNode temp=head;//Kafadan başlarsa baştan listelenir
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
    /**Müşteriler ekrana son müşteriden başlayarak yazdırılır**/
    public void printFromLast()
    {
        if (head==null)
        {
            System.out.println("Zaten müşteri yok");
        }
        else
        {
            CustomerNode temp=tail;//Kuyruktan başlanırsa sondan listelenir
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
