public class Main {
    public static void main(String[] args)
    {
        BinarySerchTree binarySerchTree=new BinarySerchTree();
        binarySerchTree.insert(binarySerchTree.root,10);
        binarySerchTree.insert(binarySerchTree.root,8);
        binarySerchTree.insert(binarySerchTree.root,15);
        binarySerchTree.insert(binarySerchTree.root,5);
        binarySerchTree.insert(binarySerchTree.root,9);
        binarySerchTree.insert(binarySerchTree.root,12);
        binarySerchTree.insert(binarySerchTree.root,20);


        binarySerchTree.preOrder(binarySerchTree.root);
        System.out.println();
        binarySerchTree.inOrder(binarySerchTree.root);
        System.out.println();
        binarySerchTree.postOrder(binarySerchTree.root);


    }
}