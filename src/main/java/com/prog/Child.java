package com.prog;

public class Child extends Parent{

    Child(int x, int y){
        super(x,y);
        System.out.println("In Child Constructor");
    }
    public  void show(){
        System.out.println("In child show");
       // System.out.println(x +"&&&" +y);
    }

    public static void main(String[] args) {
       Parent p = new Child(10,20);
//       p.show();
    }

    public static void testFinal(){
        final int x = 10;

    }
}
