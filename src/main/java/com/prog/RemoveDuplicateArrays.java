package com.prog;

public class RemoveDuplicateArrays {

    public static void main(String[] args) {
//if arrays are not sorted then sort the array and use the same logic
        int[] arr = {1,2,2,3,3,3,4,4,4,4};
        int count =1;
        for(int i=0;i<arr.length-1;i++) {

                if (arr[i]==arr[i+1]){
                     count ++;
                }
                else {
                    System.out.println(arr[i] + " " +count);
                    count =1;
                }

        }

        System.out.println(arr[arr.length-1] + " " +count);
    }
}
