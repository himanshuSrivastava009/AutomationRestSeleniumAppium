package com.prog;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondMaximumNumberUsingMap {

    public static void main(String[] args) {



        String str = "Automation";
        HashMap<Character,Long> uniMap = new HashMap<>();

        Map<Character, Long> charCountMap  =  str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        charCountMap.forEach(((character, aLong) -> System.out.println(character +" " +aLong)));



//        char[] ch = str.toCharArray();
//        for (char c: ch) {
//
//            if(uniMap.containsKey(c)){
//                uniMap.put(c, uniMap.get(c)+1);
//            }
//            else {
//                uniMap.put(c,1);
//            }
//        }
//
//        for (Map.Entry entry:uniMap.entrySet()) {
//
//            if(entry.getValue()==Integer.valueOf(1))
//            System.out.println(entry);
//
//        }
    }

//        ArrayList<Integer> al = new ArrayList<>();
//        al.add(10);
//        al.add(40);
//        al.add(1);
//        al.add(0);
//        al.add(90);
//
//       al.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).mapToInt(i->i).forEach(System.out::println);
//        String temp ="";
//       String s = "Cricket is a game, i love cricket, i play cricket daily";
//     String[] ch =  s.split(",");
//
//       Arrays.asList(s.split(","))
//               .stream()
//               .filter(i->i.contains("cricket"))
//             .collect(Collectors.toList())
//               .forEach(System.out::println);
//
//      long count =   Arrays.asList(s.split(","))
//                .stream()
//                .filter(i->i.contains("cricket"))
//                .distinct()
//                .count();
//
//        System.out.println(count);
//
//
//
//        HashMap<String,Integer> countMap = new HashMap<>();
//        for(String str: ch){
//
//            if(countMap.containsKey(str)){
//
//                countMap.put(str,countMap.get(str)+1);
//            }
//            else {
//                countMap.put(str,1);
//            }
//        }
//
//        for (Map.Entry en :countMap.entrySet()) {
//            System.out.println(en);
//
//        }
//
//        for(int i=0;i<ch.length;i++){
//
//            ch[i].split(" ");
//        }





    }

