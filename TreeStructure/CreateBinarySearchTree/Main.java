public class Main {
    public static void main(String[] args)
    {
        BinarySerchTree binarySerchTree=new BinarySerchTree();


        binarySerchTree.insert(binarySerchTree.root,60);
        binarySerchTree.insert(binarySerchTree.root,40);
        binarySerchTree.insert(binarySerchTree.root,80);
        binarySerchTree.insert(binarySerchTree.root,70);
        binarySerchTree.insert(binarySerchTree.root,50);
        binarySerchTree.insert(binarySerchTree.root,90);

        System.out.println(binarySerchTree.root.data);
        System.out.println(binarySerchTree.root.left.data);
        System.out.println(binarySerchTree.root.right.data);
        System.out.println(binarySerchTree.root.left.right.data);
        System.out.println(binarySerchTree.root.right.left.data);
        System.out.println(binarySerchTree.root.right.right.data);

    }
}