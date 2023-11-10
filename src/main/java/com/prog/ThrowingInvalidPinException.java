package com.prog;

public class ThrowingInvalidPinException extends Exception{

    @Override
    public String getMessage(){

        return "Please enter a valid pin";
    }

}

