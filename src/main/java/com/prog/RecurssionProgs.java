package com.prog;

public class RecurssionProgs {

    public static int fact(int n){
//5 = 5*4*3*2*1
        int i=1;
        if(n>0){
             i = n*fact(n-1);
        }

        return i;
    }


    public static void printNumber(int n){

        if(n>0){
            System.out.println(n);
            printNumber(n-1);
        }
        else {
            return;
        }
    }

    public static void fib(int n){
        //0,1,1,2,3
        int fib =0;
        int next = 1;
        int temp =0;
        System.out.println(temp);
        System.out.println(next);
        for(int i=0;i<n;i++){

            temp = fib +next;
          //  System.out.println(temp);
            fib = next;
            next = temp;

        }
        System.out.println(temp);
    }

    public static int sumOfArray(int[] arr, int i){
        if(i==arr.length){
            return 0;
        }
        return sumOfArray(arr,i+1)+arr[i];
    }

    public static void main(String[] args) {
       // printNumber(5);
       // System.out.println(fact(3));
      //  fib(7);

       int val =  sumOfArray(new int[]{1,2,3,4},0);
        System.out.println(val);
    }
}
