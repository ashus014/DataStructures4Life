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

    //calculating height of Tree
    static int calculateHeight(Node root){
        if(root == null)
            return 0;
        else
            return Math.max(calculateHeight(root.left), calculateHeight(root.right))+1;
    }

    //Print nodes at K-distance
    static void PrintKDistance(Node root, int k){
        if(root==null) return;

        if(k==0){
            System.out.println(root.key + " ");
        }
        else {
            PrintKDistance(root.left, k-1);
            PrintKDistance(root.right, k-1);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left= new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        //preOrder(root);
        //inOrder(root);
        //postOrder(root);
        //System.out.println(calculateHeight(root));
        PrintKDistance(root,2);
    }
}
