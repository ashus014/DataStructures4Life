package Tree.BinarySearchTree;

import java.util.Set;
import java.util.TreeSet;

class Node{
    int key;
    Node left;
    Node right;
    Node(int key){
        this.key = key;
    }
}

public class BinarySearchTree {

    //search in BST
    static boolean search(Node root, int x){
        if(root == null)
            return false;
        else if(root.key == x)
            return true;
        else if(root.key < x)
            return search(root.right, x);
        else
            return search(root.left, x);
    }

    //Inserting in BST (recursive)
    static Node insert(Node root, int x){
        if(root == null)
            return new Node(x);
        if(root.key > x)
            root.left = insert(root.left, x);
        else if(root.key < x)
            root.right = insert(root.right, x);
        return root;
    }

    public static void main(String[] args) {

        Node head = new Node(15);
        head.left = new Node(5);
        head.left.left = new Node(3);
        head.right = new Node(20);
        head.right.left = new Node(18);
        head.right.left.left = new Node(16);
        head.right.right = new Node(80);

        System.out.println(search(head, 33));
    }
}