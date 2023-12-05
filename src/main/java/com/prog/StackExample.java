package com.prog;

import java.util.Stack;

public class StackExample {

    public static boolean bracketCount(){
        String s = "(){";
        Stack<Character> myStack = new Stack<>();
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if(c=='{'||c=='['||c=='('){
                myStack.push(c);
                System.out.println(myStack);
            }
            else {
                if(myStack.empty()){
                    return false;
                }
                char top = myStack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return myStack.empty();
    }
    public static void main(String[] args) {


        System.out.println(bracketCount());
    }
}
