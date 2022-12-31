public class BinarySerchTree
{
    Node root=null;

    //without recursive
   /*
    public void insert (int data)

   {

        Node newNode=new Node(data);
        if(root==null)
        {
            root=newNode;
        }

        else
        {
            Node temp=root;
            while (true)
            {

                if (data<temp.data)
                {
                    if (temp.left==null)
                    {
                        temp.left=newNode;
                        break;
                    }
                    temp=temp.left;
                }


                else
                {
                    if (temp.right==null)
                    {
                        temp.right=newNode;
                        break;
                    }
                    temp=temp.right;
                }
            }

        }

    }
    */


    public void insert(Node node, int data)
    {
        Node newNode=new Node(data);

        if (root==null)
        {
            root=newNode;
        }
        else
        {
            if (data< node.data)
            {
                if (node.left==null)
                {
                    node.left=newNode;
                }
                else
                 insert(node.left,data);
            }
            else
            {
                if (node.right==null)
                {
                    node.right=newNode;
                }
                else
                 insert(node.right,data);
            }
        }
    }
}
