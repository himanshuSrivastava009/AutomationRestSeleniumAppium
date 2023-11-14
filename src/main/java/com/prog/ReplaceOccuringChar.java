package com.prog;

public class ReplaceOccuringChar {

    public static void main(String[] args) {

        String str = "tomorrow";//replace the o with # and next o with ## and next 0 with ###
        //op = t#m##rr###w
        StringBuilder builder = new StringBuilder("#");

      for(int i=0;i<str.length();i++){

          if(str.charAt(i)=='o'){

              str = str.replaceFirst("o",builder.toString());
              builder.append("#");

          }
      }
        System.out.println(str);

    }
}
