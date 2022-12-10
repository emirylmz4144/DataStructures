public class List
{
    Node head=null;
    Node tail=null;
    public void addToFirst(int data)
    {
        Node eleman=new Node(data);
        if (head==null)
        {
            head=eleman;
            tail=eleman;

            head.next=tail;
            tail.prev=head;
        }
        else
        {
            eleman.next=head;
            head.prev=eleman;
            head=eleman;

            head.prev=tail;
            tail.next=head;
        }
    }
    public void deleteToFirst()
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

            head=head.next;
            head.prev=tail;
            tail.next=head;
        }
    }


    public void addToLast(int data)
    {
        Node eleman=new Node(data);
        if (head==null)
        {
            head=eleman;
            tail=eleman;

            head.next=tail;
            tail.prev=head;
        }
        else
        {
            tail.next=eleman;
            eleman.prev=tail;
            tail=eleman;

            head.prev=tail;
            tail.next=eleman;
        }
    }
    public void deleteToLast()
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
            tail=tail.prev;
            tail.next=head;
            head.prev=tail;
        }

    }

    public void addToBetween(int index, int data)
    {
        Node eleman=new Node(data);
        if (head==null)
        {
            head=eleman;
            tail=eleman;

            head.next=tail;
            tail.prev=head;
        }
        else if (index==0)
        {
            eleman.next=head;
            head.prev=eleman;
            head=eleman;

            head.prev=tail;
            tail.next=head;
        }
        else
        {
            Node temp=head;
            int i=0;
            while (temp.next!=tail)
            {
                i++;
                temp=temp.next;
            }
            if (index>=i)
            {
                tail.next=eleman;
                eleman.prev=tail;
                tail=eleman;

                head.prev=tail;
                tail.next=eleman;
            }
            else
            {
                temp=head;
                Node temp2=head;
                i=0;

                while (index!=i)
                {
                    temp=temp2;
                    temp2=temp2.next;
                    i++;
                }
                temp.next=eleman;
                eleman.next=temp2;
                eleman.prev=temp;
                temp2.prev=eleman;


            }
        }

    }
    public void deleteToBetween(int value)
    {
        if (head==null && tail==null)
        {
            System.out.println("Liste zaten boş");
        }
        else if (head==tail && value==head.data)
        {
            head=null;
            tail=null;
        }
        else if (value==head.data)
        {
            head=head.next;
            head.prev=tail;
            tail.next=head;


        }
        else
        {
            if (value==tail.data)
            {
                tail=tail.prev;
                tail.next=head;
                head.prev=tail;
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

        while (temp!=tail)
        {
            System.out.println(temp.prev.data+"<--"+temp.data+"-->"+temp.next.data);
            temp=temp.next;
        }
        if (tail!=null)
        {
            System.out.println(tail.data);
        }
        else
        {
            System.out.println("Liste tamamen boşaltıldı");
        }
    }
}
