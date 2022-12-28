package Tree.BinarySearchTree;


//          10
//        /    \
//      20       30
//    /    \
//   5      15
// So vertical distance sum would be {5, 20, 25, 30}

import java.util.TreeMap;

public class FindHorizontalDistanceSum {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(15);
        vSum(root);
    }

    static void vSumR(Node root, int hd, TreeMap<Integer, Integer> mp) {
        if(root == null) return;
        vSumR(root.left, hd - 1, mp);
        int pSum = (mp.get(hd) == null) ? 0 : mp.get(hd);
        mp.put(hd, pSum + root.key);
        vSumR(root.right, hd + 1, mp);
    }

    static void vSum(Node root) {
        TreeMap<Integer, Integer> mp =new TreeMap<>();
        vSumR(root, 0, mp);
        mp.forEach((key, value) -> {
            System.out.print(value + " ");
        });
    }
}
