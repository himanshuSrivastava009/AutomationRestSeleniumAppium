package com.prog;

import net.bytebuddy.asm.Advice;

public class ThisExample {

     int x;
     int y;

     ThisExample(int x){
         this.x = x;
     }

     ThisExample(int x , int y){

         this(x);
         this.y = y;


     }
     public void show(){
         System.out.println(x);
         System.out.println(y);

     }

    public ThisExample getInstance() {

       // ThisExample example = this;

        return new ThisExample(10);
    }

    public static void main(String[] args) {

        ThisExample ex = new ThisExample(100,300);
        ex.getInstance().show();
       // System.out.println(y1);
    }
}
