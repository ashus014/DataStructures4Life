package Tree.BinaryTree;


//Implementation of Binary Tree in Java


class Node{
    int key;
    Node left;
    Node right;

    Node(int key){
        this.key = key;
    }
}

public class Test {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left= new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
    }
}
