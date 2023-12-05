package com.prog;

import java.util.*;

public class LongestPrefixInString {


    public String longestCommonPrefix(String[] strs) {

        StringBuilder builder = new StringBuilder();
        Arrays.sort(strs);

        char[] ch1 = strs[0].toCharArray();
        char[] ch2 = strs[strs.length - 1].toCharArray();

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] == ch2[i]) {
                builder.append(ch1[i]);
            } else {
                break;
            }
        }

        return builder.toString();

    }

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> mylist = new ArrayList<>();
        Set<List<Integer>> myset = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = i + 2; k < nums.length; k++) {
                    if(i!=j && i!=k && k!=j) {
                        if (nums[i] + nums[j] + nums[k] == 0) {

                            result.add(Arrays.asList(nums[i], nums[j], nums[k]));


                        }
                    }
                }
            }
        }

       for(List<Integer> i: result){

          // System.out.println(i);
          Collections.sort(i);
          myset.add(i);
       }
       // System.out.println(myset);
        return new ArrayList(myset);
    }


    public static void letterCombination(String digits){

        List<String> al = new ArrayList<>();
        HashMap<String,String> keyboard = new HashMap<>();
        keyboard.put("2","abc");
        keyboard.put("3","def");
        keyboard.put("4","ghi");
        keyboard.put("5","jkl");
        keyboard.put("6","mno");
        keyboard.put("7","pqrs");
        keyboard.put("8","tuv");
        keyboard.put("9","wxyz");

        System.out.println(keyboard);


        System.out.println(keyboard.get("2"));
        String str = "";
       for(int i=0;i<digits.length();i++){
           str=str+digits.charAt(i);
         al.add(keyboard.get(str));
         str="";
       }

        System.out.println(al);

    }

    public static void countChar(String str){
        char[] ch = str.toCharArray();
        HashMap<Character,Integer> countMap = new HashMap<>();
        for (char c : ch) {
            if(countMap.containsKey(c)){
                countMap.put(c, countMap.get(c)+1);
            }
            else {
                countMap.put(c,1);
            }
        }
        System.out.println(countMap);
    }

    public static void main(String[] args) {

        LongestPrefixInString al = new LongestPrefixInString();
        // String value  =  al.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        String value = al.longestCommonPrefix(new String[]{"clap", "clad", "class"});
        System.out.println(value);

        String str = "Helo";
        str.indexOf("t");
        System.out.println(al.threeSum(new int[]{3,0,-2,-1,1,2}));
        letterCombination("23");
        countChar("mississippi");
    }
}
