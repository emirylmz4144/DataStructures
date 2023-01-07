public class Circular
{
    Node head=null;
    Node tail=null;
    public void add(int data)
    {
        Node newPerson=new Node(data);

        if (head==null)
        {
            head=newPerson;
            tail=newPerson;
            head.next=tail;
            tail.next=head;
        }
        else
        {
            tail.next=newPerson;
            tail=newPerson;
            newPerson.next=head;
        }
    }

    /*
    *Her seferinde sadece gönderilen düğümün düzeltmesini yani
    * next gibi değerlerini güncelleyerek biz bir geri dönüş yapacaktır
    * Yani listeyi komple düzeltmeyecek her seferinde biz buna bir düğüm göndereceğiz ve bize
    * o düğümün düzenlenmiş halini geri dönderecek
     */
    public void delete(Node node)
    {
        if (head!=null)
        {
           node=head;
            if (node.next==head)
            {
                head=node.next.next;
            }

            node.next=node.next.next;
        }

    }

    public int quality()
    {
        if (head==null)
        {
            return 0;
        }
        Node temp=head;
        int sayi=1;

        do
        {
            sayi++;
            temp=temp.next;
        }while (temp!=head);

        return sayi;

    }

    public void print()
    {
        if (head==null)
        {
            System.out.println("Listede eleman yok");
        }

        System.out.println("\n----KALAN NUMARALAR--------");
        Node temp=head;

       do
       {
           System.out.println(temp.data);
           temp=temp.next;
       }while (temp!=head);
    }
}
