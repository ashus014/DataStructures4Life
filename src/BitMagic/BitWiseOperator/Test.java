package BitMagic.BitWiseOperator;

//Theory
/*
* Author - primeSuspect
*
* If two inputs are 1 : OutPut -> 1
* If they are different : OutPut -> 0
*
* If you are giving a number let say 8 : It will convert the number ib binary representation
* and would perform bit-by-bit comparison
*
* Java represent numbers in 32-Bit binary representation
* So if you are giving 3 as input instead of converting it into 0011
* Java would convert it into 000000000000000000000000000000011 (32 bit form)
*
* (x&y) ->BitWise And
*
* if x=3 -> 0...0011
* if y=6 -> 0...0110
* ---------------------
*               0010 -> 2
*
* ---------------------------------------------------
* (x|y) -> BitWise Or
*
* we have one if any of the inputs is one
*
*  if x=3 -> 0...0011
*  if y=6 -> 0...0110
* ---------------------
*                0111 -> 7
*
* ----------------------------------------------------
* (x^y) -> BitWise XOR
*
* Produces output 1 if two inputs are different
* Produces output 0 if two inputs are same
*
* ----------------------------------------------------
* (~x) -> BitWise Not
* Takes a number and converts to ita Binary form and inverts its representation
*
* if x=3 -> 00000000000000000000000000000011
*     ~3 -> 11111111111111111111111111111100
*
* ----------------------------------------------------
* (<<) -> Left Shift Operator
* Takes a number whose binary representation needs to be shifted and takes
* another number which tells how many times shift needs to be done.
* After the shift the number which you gets represents the corresponding integer value.
*
* x=3 -> (x<<1) -> 6
*
* 3 - 0011
* After (1) shift :
* 3 - 0110 -> which becomes 6
*
* ----------------------------------------------------
* (>>) -> Right Shift Operator
* Opposite of Left Shift Operator
*
* Special case is when we have to deal with -ve numbers
* we represent -ve numbers in the form of 2's complement
* So (-2)  can be represented as 2^(32) - 2
* also can be represented as 2^(32) - 1 - 1 -> {111...111} -1 -> {111...110}
* So after (-2>>1) it would be {011...111} but in case of -ve numbers 1 comes into picture instead of 0.
* So right answer would be {111...111}
*
* ----------------------------------------------------
* (>>>) -> Unsigned Right Shift Operator
* Previous right shift operator was filling the -ve numbers with 1 so that the sign is preserved.
* But in this case we fill it with 0.
*
*
* */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

    //01-function to count the set bits
    /*
    *  n=13 : Output -> 3
    *  13 can be represented as {...1101}, so we have three 1's here
    *  So, output as 3
    * */
    static int countSet(int n){
        int res=0;
        while (n>0){
            if(n%2!=0) //checking if binary from right is set or not -> if((n&1)==1)
                res++;
            n=n/2; //shifting 1 towards right -> (n=n>>1)
        }
        return res;
    }

    //02(i)-function to check if n (non-negative) integer is a power of 2 or not
    /*
    * One idea would be to repeatedly divide it by 2, and if in the end i it becomes 1 then power of two
    * If it not becomes 1 and become something else it is not the power of two
    * */
    static boolean isPowerOf2(int n){

        if(n == 0) return false;
        while (n!=1){
            if(n%2!=0)
                return false;
            n = n/2;
        }
        return true;
    }

    //02(ii)-function to check if n (non-negative) integer is a power of 2 or not
    /*
    * We are here just subtracting the digit by 1 and using and on both numbers
    * eg- (4 & 3)
    *             4 - 0100
    * (4-1) i.e., 3 - 0011
    *           -------------
    *                 0000 -> resultant we are getting as zero so this is a power of 2
    * */
    static boolean isPowerOf2Part2(int n){

        if(n == 0) return false;
        return ((n&(n-1))==0);
    }

    //03(i)-function to find the odd occurring number (lengthy Solution)
    /*
    * taking help of Map Collection to store the number and count of the number
    * */
    static int findOddCount(int [] array){
        int res=0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< array.length;i++){

            map.put(array[i], map.getOrDefault(array[i],0)+1);
        }

        Set keys = map.keySet();
        for(Object tempKey : keys){
            if(map.get(tempKey)%2!=0){
                res+=1;
            }
        }
        return res;
    }

    //03(ii)-function to find the only odd occurring number
    /*
    * Here we are using XOR (^) operator. XOR has few properties -
    * x^0 = x
    * x^y = y^x
    * x^(y^z) = (x^y)^z
    * x^x=0
    *
    * Above four properties to be keep in mind.
    * */
    static int findOdd(int arr[], int n){
        int res=0;
        for(int i=0;i<n;i++){
            res = res^arr[i];
        }
        return res;
    }

    //v.v.v.IMP
    //04-function to print the power set using Bitwise
    static void printPowerSet(String str){
        int n = str.length();
        int powerSize =(int) Math.pow(2,n);

        for(int counter=0;counter<powerSize;counter++){
            for (int j=0;j<n;j++){
                if((counter & (1<<j))!=0){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {

        //int[] array = {11,22,11,22,33,44,33};
        System.out.println("------");
        printPowerSet("ashu");
    }
}
