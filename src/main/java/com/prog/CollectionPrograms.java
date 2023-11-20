package com.prog;



import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionPrograms {

    public static void mainTest() {
        String str = "";
        int[] arr = new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 7};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        System.out.println(map);
        int temp = 0;
        for (Map.Entry<Integer, Integer> val : map.entrySet()) {
            // System.out.println(val.getValue());
            int i = val.getValue() / 2;
            temp = i + temp;

        }
        System.out.println(temp);
    }

    public static void countPairs(int[] arr) {

        int len = arr.length;
        arr = new int[]{3, 7, 2, 3, 7, 5, 7, 7, 2, 7};
        Stream<Object> collect = Stream.of(3, 7, 2, 3, 7, 5, 7, 7, 2, 7)
                .collect(Collectors.groupingBy(e -> e))
                .entrySet().stream().filter(e -> e.getValue().size() == e.getValue().size() % 2)
                .map(Map.Entry::getKey);

        System.out.println(collect.collect(Collectors.toList()));

        Predicate<Integer> p = i -> i % 2 == 0;

        Arrays.asList(1, 2, 3, 4, 5).stream().filter(p).forEach(System.out::println);


    }


    public static void main(String[] args) {

      //  mainTest();
        String str = "have a nice day have a worst day have a happy night";
        String[] st = str.split(" ");
        TreeMap<String,Integer> map = new TreeMap<>();

        for (String string: st) {
            if(map.containsKey(string)){

                map.put(string,map.get(string)+1);
            }
            else {
                map.put(string,1);
            }
        }

        for (Map.Entry<String,Integer> val :map.entrySet()) {

            if(val.getValue()>2){
                System.out.println(val.getKey() + " =" + val.getValue());
            }

        }
        System.out.println(map);

        for (String string: st) {
            System.out.println(string);
        }
    }
}
