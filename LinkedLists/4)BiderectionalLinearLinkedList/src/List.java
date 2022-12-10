public class List
{
    Node head=null;
    Node tail=null;

    public void addToFirst(int data)
    {
        Node value=new Node(data);
        if (head==null)
        {
            head=value;
            tail=value;
            head.next=tail;
            head.prev=null;
            tail.prev=head;
            tail.next=null;
        }
        else
        {
            value.next=head;
            head.prev=value;
            head=value;
        }
    }

    public void addToLast(int data)
    {
        Node value=new Node(data);
        if (head==null)
        {
            head=value;
            tail=value;
            head.next=tail;
            head.prev=null;
            tail.prev=head;
            tail.next=null;
        }
        else
        {
            tail.next=value;
            value.prev=tail;
            tail=value;
        }

    }

    public void addToBetween(int index,int data)
    {
        Node value=new Node(data);
        if (head==null)
        {
            head=value;
            tail=value;
            head.next=tail;
            head.prev=null;
            tail.prev=head;
            tail.next=null;
        }
        else if (index==0)
        {
            value.next=head;
            head.prev=value;
            head=value;
        }
        else
        {
            Node temp1=head;

            int i=0;
            while (temp1.next!=null)
            {
                temp1=temp1.next;
                i++;
            }
            if (index>=i)
            {
                temp1.next=value;
                value.prev=temp1;
                tail=value;
            }
            else
            {
                temp1=head;
                Node temp2=head;
                int n=0;
                while (index!=n)
                {
                   temp1=temp2;
                   temp2=temp2.next;
                   n++;
                }
                temp1.next=value;
                value.prev=temp1;
                value.next=temp2;
                temp2.prev=value;


            }
        }
    }
    public void deleteFirst()
    {
        if (head==null && tail==null)
        {
            System.out.println("Liste zaten boş");
        }
        else if (head==tail)
        {
            head=null;
            tail=null;
        }
        else
        {

            head.next.prev=null;//Aradaki bağ koparılırılarak ilk head boşa çıkarılır
            head=head.next;
        }
    }
    public void deleteLast()
    {
        if (head==null && tail==null)
        {
            System.out.println("Liste zaten boş");
        }
        else if (head==tail)
        {
            head=null;
            tail=null;
        }
        else
        {
            tail.prev.next=null; //Aradaki bağ koparılırılarak ilk head boşa çıkarılır
            tail=tail.prev;
        }
    }

    public void deleteToBetween(int value)
    {
        if (head==null)
        {
            System.out.println("Liste zaten boş");
        }
        else if (value==head.data && head.next==null)
        {
            head=null;
            tail=null;
        }
        else if (value==head.data)
        {
            head.next.prev=null; //Aradaki bağ koparılırılarak ilk head boşa çıkarılır
            head=head.next;// yeni head değeri atanır ve boşa çıkan head çöp toplayıcı tarafından oto silinir
        }
        else
        {
            if (value==tail.data)
            {
                tail.prev.next=null;//Aradaki bağ koparılırılarak ilk head boşa çıkarılır
                tail=tail.next;
            }
            else
            {
                Node temp1=head;
                Node temp2=head;

                while (temp2.data!=value)
                {
                    temp1=temp2;
                    temp2=temp2.next;
                }
                temp1.next=temp2.next;
                temp2.next.prev=temp2.prev;
            }
        }
    }

    public void print()
    {
        Node temp=head;
        while (temp!=null)
        {
            if (temp==head)
            {
                System.out.println(temp.data);
            }
            else if (temp==tail)
            {
                System.out.println(temp.prev.data+"<--"+temp.data);
            }
            else
            {
                System.out.println(temp.prev.data+"<--"+temp.data+"-->"+temp.next.data);
            }
            temp=temp.next;
        }
    }
}
