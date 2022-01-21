package Strings;

public class WorkingWithChars {

    // Print frequencies of Character (in sorted Order) in a string of lower case alphabets.
    static void printInSortedOrder(){

        String str = "geeksforgeeks";
        int[] count = new int[26];

        for(int i=0; i<str.length(); i++){
            count[str.charAt(i) - 'a']++;
        }

        for(int i=0; i<26; i++){
            if(count[i] > 0)
                System.out.println((char)(i + 'a') + " " + count[i]);
        }

        /*

        e 4
        f 1
        g 2
        k 2
        o 1
        r 1
        s 2

        */
    }

    public static void main(String[] args) {

        char x = 'a';
        System.out.println((int)x);
        // OUTPUT - 97
        printInSortedOrder();
    }
}
