package com.prog;

import groovy.json.JsonOutput;

import java.util.*;
import java.util.stream.Collectors;

public class StringExamples {

    public static void countChar(String str){

        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] charArray = str.toCharArray();
        for(char c : charArray){

            if(charCountMap.containsKey(c)){

                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else {
                charCountMap.put(c,1);
            }
        }

        for (Map.Entry entry :charCountMap.entrySet()) {

            System.out.println(entry.getKey() + "  ==  " + entry.getValue());

        }


    }

    public static void printNonRepeatingChar(String str){
        str = str.toLowerCase();
       char[] ch = str.toCharArray();
       HashMap<Character, Integer> nonRepeatingChar = new HashMap<>();
       for(char c: ch){
           if(nonRepeatingChar.containsKey(c)){
               nonRepeatingChar.put(c,nonRepeatingChar.get(c)+1);
           }
           else {
               nonRepeatingChar.put(c,1);
           }
       }
        for (char c: str.toCharArray()) {

            if(nonRepeatingChar.get(c)==1){
                System.out.println(c);
            }
        }

    }
    public static void replaceOccChar(String str){
        int count = 0;
        int i;
        int index=0;
        for(i=0;i<str.length()-1;i++){
            for(int j=0;j<str.length()-1;j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if(count==1) {
               // System.out.println(str.charAt(i) + "==" + count);
            }
            else {
                System.out.println(str.charAt(i));
            }
            count = 0;
        }
        count ++;

            System.out.println(str.charAt(str.length() - 1) + "==" + count);

    }

    //1,2,3,4,5
    public static void getSecondMaximumNumber(ArrayList<Integer> number){


    }


    public static void main(String[] args) {

        //replaceOccChar("tomorrow");
        String s = "tomorrow";
       // System.out.println(s.charAt(s.length()-1));

      // countChar(s);

//        HashMap<Character,Integer> map = new HashMap<>();
//        map.put('t',1);
//        map.put('o',1);
//        char[] ch1 =  s.toCharArray();
//        for (char c :ch1) {
//            System.out.println("-----" +c);
//            System.out.println(map.get(c));
 //       }

//        StringBuilder charactersToAppend = new StringBuilder("#");
//        String input = "tomorrow";
//        while (input.contains("o"))
//        {
//            input = input.replaceFirst("o", charactersToAppend.toString());
//            charactersToAppend.append("#");
//        }
//        System.out.println(input);
//

     //   String st = "tomorrow";
      //  StringBuilder builder = new StringBuilder("#");


       // builder.append("#");
       // System.out.println(builder);

//        while(st.contains("o")){
//         st =  st.replaceFirst("o",builder.toString());
//         builder.append("#");
//        }
//        System.out.println(st);
//
//        StringBuilder sb = new StringBuilder("*");
//        String h = "himanshuh";
//
//         h =  h.replaceFirst("h" ,sb.toString());
//        System.out.println(h);
//        sb.append("*");
//        h =  h.replaceFirst("h" ,sb.toString());
//        System.out.println(h);
//        sb.append("*");
//        h =  h.replaceFirst("h" ,sb.toString());
//        System.out.println(h);

     //   printNonRepeatingChar("Automation");

       Integer[] in = new Integer[]{1,2,5,6};
       List<Integer> i = Arrays.asList(in);
      // i.stream().sorted().forEach(System.out::println);
      // i.stream().filter(x->x%2==0).collect(Collectors.toList()).forEach(System.out::println);
      //  i.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
       // i.stream().sorted(Collections.reverseOrder()).distinct().limit(2).forEach(System.out::println);

      //  System.out.println(i.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get());

       // i.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).forEach(System.out::println);

        System.out.println(i.stream().mapToInt(e->e).average().getAsDouble());
   }

}
