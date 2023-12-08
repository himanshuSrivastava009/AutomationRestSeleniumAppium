package com.prog;

public class StringMemoryComparision {

    public static void main(String[] args) {

        String str1 = "Himanshu";
        String str2 = "Himanshu";
        String str3 = new String("Himanshu");
        System.out.println(str1==str2);//true
        System.out.println(str2==str3);//false
    }
}
