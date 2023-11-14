package com.prog;

import java.util.PriorityQueue;

public class RopeCombiningProblem {

    public static void main(String[] args) {

        PriorityQueue<Integer> ropes = new PriorityQueue<>();

        ropes.add(1);
        ropes.add(1);
        ropes.add(3);
        ropes.add(5);
        ropes.add(7);
        //ropes.add(3);
       // ropes.add(7);
        ropes.add(9);
        int sum =0, totalCost=0;

        while(ropes.size()>1){

            int r1= ropes.poll();
            int r2 = ropes.poll();

            sum = r1+r2;
            totalCost = sum + totalCost;
            ropes.add(sum);
        }

        System.out.println(totalCost);


//        for(int i: ropes){
//
//            System.out.println(i);
//        }

    }
}
