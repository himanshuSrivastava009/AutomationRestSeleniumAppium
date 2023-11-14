package com.prog;

public class CustomExceptionUse {
    CustomExceptionTest exceptionTest = new CustomExceptionTest();
    ErrorTest errorTest = new ErrorTest();
    public void testAge(int age) throws CustomExceptionTest {

        if(age<18){

           exceptionTest.getMessage();
           throw exceptionTest;

        }
    }

    public void testCount(){
        int count = 0;
        for(;;){
            System.out.println("Testing Error");
            count ++;
            if(count>11){
                throw errorTest;
            }
        }
    }

    public static void main(String[] args) throws CustomExceptionTest {

        CustomExceptionUse exceptionUse = new CustomExceptionUse();
      //  exceptionUse.testAge(16);
        exceptionUse.testCount();

    }
}
