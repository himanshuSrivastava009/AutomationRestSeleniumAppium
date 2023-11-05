package com.prog;

public class FindTheMatchingString {


    public static String matchString(String str1, String str2){
        int k=0,j=0;
        String temp = "";
        for(int i=0;i<str1.length();i++){

            if(str1.charAt(i)!=' '){
                temp = temp+str1.charAt(i);
            }
            else {

                temp="";
            }

            if(str2.length()==temp.length()) {
                for (k = 0; k < str2.length(); k++)
                    if (temp.charAt(k) == str2.charAt(k)) {
                        if(k== str2.length()){
                            break;
                        }
                    }
            }
        }

        return k==str2.length()?"yes":"no";
    }
    public static String containsElement(String str, String macther){

       int i=0,j=0;
       while (i<str.length() && j<macther.length()) {
           if (str.charAt(i)==macther.charAt(j)) {
               i++;
               j++;
           }
           else {
               i++;
           }
       }
       return j==macther.length()?"yes":"no";



    }

    public static void main(String[] args) {

      // String result =  containsElement("good morning swati", "it");

        //System.out.println(result);

        String result1 = matchString("good morning chipundi test himanshu swati kumari", "heman");
        System.out.println(result1);
    }
}
