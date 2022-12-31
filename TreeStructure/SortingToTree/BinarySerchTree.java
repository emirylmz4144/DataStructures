public class BinarySerchTree
{
    Node root=null;

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

    public  void preOrder(Node root)
    {
        if (root!=null)
        {
            System.out.print(root.data+" "); // yazar ve geçer
            preOrder(root.left);
            /* Burada sürekli olarak döner aşağı geçmez
            ve null olduğunda aşşağı geçer çünki kodun tamamını okumamamştır
             */
            preOrder(root.right); // Yukarıdaki recursive tamamlandıktan sonra bunu tamamlar

        }

    }
    public  void inOrder(Node root)
    {
        if (root!=null)
        {
            inOrder(root.left); // sıralar
            System.out.print(root.data+" ");//yazar
            inOrder(root.right);// bir sonraki dalı yapar

        }

    }
    public  void postOrder(Node root)
    {
        if (root!=null)
        {

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");

        }

    }
}