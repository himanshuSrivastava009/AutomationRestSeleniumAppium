package com.prog;

public class TestRefOfAString {

    public static void main(String[] args) {

        String s1 = new String("himanshu");
        String s2 = "himanshu";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
