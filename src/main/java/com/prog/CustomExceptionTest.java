package com.prog;

public class CustomExceptionTest extends Exception{

    @Override
    public String getMessage(){

        return "Invalid Age exception";
    }
}
