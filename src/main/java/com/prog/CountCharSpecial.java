package com.prog;

import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;

public class CountCharSpecial {

    public static void main(String[] args) {
        String str = "H!m@n5Hu";
        ArrayList<Character> number = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();
        ArrayList<Character> letter = new ArrayList<>();

        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++) {
            if (Character.isDigit(ch[i])) {

               number.add(ch[i]);
            }
            else if (Character.isLetter(ch[i])) {


                letter.add(ch[i]);
            }
            else {
               special.add(ch[i]);
            }
        }

        System.out.println(number);
        System.out.println(letter);
        System.out.println(special);
    }
}
