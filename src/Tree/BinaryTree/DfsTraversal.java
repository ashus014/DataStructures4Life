package Tree.BinaryTree;

//Implementation of Binary Tree in Java

class Node{
    int key;
    Node left;
    Node right;
    Node(int key){this.key = key;}
}

public class DfsTraversal {

    //function to inOrder traverse the Binary tree with a given root
    static void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);
        }
    }

    //function to preOrder traverse the Binary tree with a given root
    static void preOrder(Node root){
        if(root != null){
            System.out.print(root.key + " ");
            preOrder(root.left);
            preOrder(root.right);

        }
    }

    //function to postOrder traverse the Binary tree with a given root
    static void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left= new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        preOrder(root);
        //inOrder(root);
        //postOrder(root);
    }
}
