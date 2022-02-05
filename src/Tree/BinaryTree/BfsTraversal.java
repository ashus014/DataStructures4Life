package Tree.BinaryTree;

public class BfsTraversal {


    //Level Order traversal
    //First Approach would be to first know the depth of the tree
    //Then traverse each height accordingly : Follow following two Steps.

    //Step-1
    static int calculateHeight(Node root){
        if(root == null)
            return 0;
        else
            return Math.max(calculateHeight(root.left), calculateHeight(root.right))+1;
    }

    //Step-2
    static void PrintKDistance(Node root, int k){
        if(root==null) return;

        if(k==0){
            System.out.print(root.key + " ");
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
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);
        root.right.right = new Node(6);

        int height = calculateHeight(root);
        for(int i=0; i<=height; i++){
            PrintKDistance(root, i);
        }
    }
}
