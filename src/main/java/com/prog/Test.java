package com.prog;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test {

    public static void main(String[] args) {


        String value = "goodmorning";
        HashSet<Character> characters = new LinkedHashSet<>();
        StringBuilder builder = new StringBuilder();

        char[] ar = value.toCharArray();

        for (int i = 0; i < ar.length; i++) {

            if (characters.add(ar[i])) {
                characters.add(ar[i]);
                builder.append(ar[i]);
            }



        }
        System.out.println(builder.toString());

            System.out.println(characters);


    }
}
