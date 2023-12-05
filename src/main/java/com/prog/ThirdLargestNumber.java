package com.prog;

public class ThirdLargestNumber {

    public static void thirdLargest(int[] a) {



        int first = a[0];
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>first){
                first=a[i];
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>second && a[i]<first){
                second = a[i];
            }
        }

        for(int i=0;i<a.length;i++){
            if(a[i]>third && a[i]<first && a[i]<second){
                third = a[i];
            }
        }

        System.out.println(third);
        System.out.println(second);
        System.out.println(first);


    }

    public static void largestNumber(int[] a){

        int first = a[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>first){
               third = second;
               second = first;
               first = a[i];
            } else if (a[i]>second) {
                second = a[i];
            } else if (a[i]>third) {
                third = a[i];
            }
        }
        System.out.println("first = " +first);
        System.out.println("Second = " +second);
        System.out.println("Third = " +third);
    }


    public static void main(String[] args) {

        thirdLargest(new int[]{1,2,3,4,5});
        largestNumber(new int[]{1,2,3,4,5});

    }
}
