package Strings;

import java.util.Arrays;

public class DifferentStringFunctions {

    // Check the String is Palindrome or not
    boolean checkPalindrome(String s1){
        StringBuilder s2 = new StringBuilder(s1);
        s2.reverse();
        return s1.equals(s2.toString());
    }

    //check whether strings are anagram (checking whether they are permutation of each other) of each other or not
    boolean areAnagram(String s1, String s2){

        if(s1.length() != s2.length())
            return false;

        //sort first String
        char[] a1 = s1.toCharArray();
        Arrays.sort(a1);
        s1 = new String(a1);

        //sort second String
        char[] a2 = s2.toCharArray();
        Arrays.sort(a2);
        s2 = new String(a2);

        return s1.equals(s2);
    }

    //check whether strings are anagram (checking whether they are permutation of each other) of each other or not
    //Using the nicest way without using sorting
    boolean areAnagram2(String s1, String s2){

        final int CHAR = 256;
        if(s1.length() != s2.length())
            return false;

        int count[] = new int[CHAR];

        for(int i=0; i<s1.length(); i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for(int i=0; i<CHAR; i++){
            if(count[i]!=0)
                return false;
        }
        return true;
    }

    //reverse words in String
    void reverseString(String s1){

        String s2 = s1.trim();
    }


    public static void main(String[] args) {

        String str = "geeks";
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,5));

        System.out.println("------------------------------");
        //very important example ith String immutability
        String s1 = "geeks";
        String s2 = s1;

        // here it has created a new reference & s is now pointing to that
        // since Strings are immutable so it doesn't change the existing one.
        s1 = s1 + "forgeeks";
        System.out.println(s1);
        System.out.println(s1==s2);
    }
}
