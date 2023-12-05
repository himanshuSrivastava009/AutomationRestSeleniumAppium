package com.prog;

public class Parent {

    int x,y;

//    Parent(){
//        System.out.println("In Parent without arg Constructor");
//    }
static {

    int e =70;
    int f =80;
    System.out.println("value of static block variable a = "+e +"value of b =" +f);
}
    static {

        int a =10;
        int b =20;
    System.out.println("value of static block variable a = "+a +"value of b =" +b);
}


    {

        int c =100;
        int d =200;
        System.out.println("value of Instance block variable c = "+c +"value of d =" +d);
    }




    Parent(int x , int y){
        System.out.println("In Parent parametrized Constructor");
        this.x = x;
        this.y=y;
        System.out.println("Parent parametrized constructor inside value of x = " +x +"value of y = " +y);
    }
    public  void show(){
        System.out.println("In Parent Show");
        System.out.println("Aftre parentSum the value of " +x +"and the value of " +y);
    }

    public int Sum(int x,int y){
        System.out.println("In Parent sum");
        return this.x+this.y;
    }
}
