package com.prog;

public class StudentTest implements Comparable<StudentTest>{

    int age;
    int marks;
    String name;

    StudentTest(int age, int marks, String name){

        this.age=age;
        this.marks=marks;
        this.name=name;
    }

    public String toString(){

        return this.name +" " +this.age + " " + this.marks;
    }

    @Override
    public int compareTo(StudentTest s1) {
        StudentTest st2 = this;
        if(s1.age>st2.age){

            return 1;
        } else  {
            return -1;
        }
    }
}
