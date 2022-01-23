package Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StackUsingArrayDeque {

    static BiPredicate<Character, Character> predicate =
            (a, b) -> ((a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']'));

    static boolean balancedParenthesis(String str){
        Deque<Character> s = new ArrayDeque<>();

        for(int i=0; i<str.length(); i++){
            char x = str.charAt(i);
            if(x=='(' || x=='{' || x=='[')
                s.push(x);
            else{
                if(s.isEmpty() == false)
                    return false;
                else if(predicate.test(s.peek(), x) == false)
                    return false;
                else
                    s.pop();
            }
        }
        return (s.isEmpty() == true);
    }

    //stock span problem


    public static void main(String[] args) {

        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());

        /*
            30
            30
            20
        */


    }
}
