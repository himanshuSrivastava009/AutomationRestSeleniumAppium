package com.prog;

import java.util.HashMap;
import java.util.Map;

public class B extends A{

//    public final void display(){
//        System.out.println("Display of A method");
//    }

    public static void testAplhaOcc(String str){

        char[] ch = str.toCharArray();
        HashMap<Character,Integer> set = new HashMap<>();
        for(char c: ch){
            if(set.containsKey(c)){
                set.put(c, set.get(c)+1);
            }
            else{
                set.put(c,1);
            }
        }

        for (Map.Entry e:set.entrySet()){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        testAplhaOcc("aabbbbcccccddddd");
    }
}

