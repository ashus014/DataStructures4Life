package Matrix;

public class TwoDArrays {




    public static void main(String[] args) {
        int arr[][] = {
                        {1,2,3},
                        {4,5,6}
                        };

        //another way of declaring
        int ar[][] = new int[3][3];

        //Traversing 2D array in JAVA
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println(arr[i][j] + " ");
            }
        }

        System.out.println("-----------------------------------");

        //Jagged Arrays
        int m=3;
        int arr2[][] = new int[m][];
        for(int i=0; i< arr2.length; i++){
            arr2[i] = new int[i+1];
            for(int j=0; j<arr2[i].length; j++){
                arr2[i][j] = i;
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

       /*
       ---OUTPUT---
       0
       1 1
       2 2 2
       */
    }
}
