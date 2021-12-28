package Advance;
    import java.util.*;
class Node
{
    int data;
    Node left, right;
  
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
  
class BinaryTree
{
    Node root;
    void printPaths(Node node)
    {
        int path[] = new int[1000];
        printPathsRecur(node, path, 0);
    }
    void printPathsRecur(Node node, int path[], int pathLen)
    {
        if (node == null)
            return;
        path[pathLen] = node.data;
        pathLen++;
        if (node.left == null && node.right == null)
            printArray(path, pathLen);
        else
        {
            printPathsRecur(node.left, path, pathLen);
            printPathsRecur(node.right, path, pathLen);
        }
    }
    void printArray(int ints[], int len)
    {
        int i;
        for (i = 0; i < len; i++)
        {
            System.out.print(ints[i] + " ");
        }
        System.out.println("");
    }
    public static void create(Node t,int n){
        int temp = t.data;
        if(temp+1<=n){
            t.left = new Node(temp+1);
            create(t.left,n);
        }
        if(temp+2<=n){
            t.right = new Node(temp+2);
            create(t.right,n);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        int n = sc.nextInt();
        tree.root = new Node(0);
        create(tree.root, n);
        /*
        tree.root=new Node(4);
        tree.root.left=new Node(3);
        tree.root.right=new Node(2);
        tree.root.left.left=new Node(2);
        tree.root.left.right=new Node(1);
        tree.root.right.left=new Node(1);
        tree.root.right.right=new Node(0);
        tree.root.left.left.left=new Node(1);
        tree.root.left.left.right=new Node(0);
        tree.root.left.right.left=new Node(0);
        tree.root.right.left.left=new Node(0);
        tree.root.left.left.left.left=new Node(0);
        */

        /* Let us test the built tree by printing Inorder traversal */
        tree.printPaths(tree.root);
        sc.close();
    }
}
