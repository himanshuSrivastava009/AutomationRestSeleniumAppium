package com.prog;

public class StringPailndrome {

    //mississippi
    public static boolean checkPlainDrome(String str){

        int i=0; int j=str.length()-1;
        while (i<j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static void getSubString(String str, int size) {
        String temp = "";
        for(int i=0;i<=str.length()-size;i++){
            for(int j=i;j<size+i;j++){

                temp = temp+str.charAt(j);
            }
                if(checkPlainDrome(temp)) {
                    System.out.println(temp);
                }
                 temp = "";

        }

    }

    public static void main(String[] args) {

       getSubString("mississippi", 4);

    }
}
