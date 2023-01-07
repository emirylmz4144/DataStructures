public class BinarySerchTree
{
    Node root=null;
    int height=0;

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

    public int  height(Node root)
    {
        if (root==null)
        {
            return 0;
        }
        else
        {
            int left=0,right=0;
           left= height(root.left);
           right=  height(root.right);

            if (left>right)
            {
                return left+1;
            }
            else
            {
                return right+1;
            }
        }
    }

    public int valueOfQuality(Node root)
    {
        if (root==null)
        {
            return 0;
        }
        else
        {
           int quality=0;
           quality= valueOfQuality(root.left)+ valueOfQuality(root.right)+1;

            return quality;
        }
    }
}