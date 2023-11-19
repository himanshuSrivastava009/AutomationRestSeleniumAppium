package com.prog;

public class ProgramsOnString {

    public int countWord(String s){
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i+1)==' ' && s.charAt(i)!=' '){
                count++;
            }
        }
        return count+1;
    }

    public boolean checkPalindrome(String s){

        int i=0;
        int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public void printAllSubString(String s, int size){
        String temp ="";
        for(int i=0;i<=s.length()-size;i++){
            for(int j=i;j<size+i;j++){
                temp = temp+s.charAt(j);
            }
            System.out.println(temp);
            temp = "";
        }

    }

    public String[] convertStringToArray(String s, int length){
        String str = "";
        int j=0;
        String[] st = new String[length];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
               str = str+s.charAt(i);
            }
            else {

                st[j] = str;
                j++;
                str="";
            }
        }
        st[j] = str;
        return st;
    }

    public void reverseString(String s){
        String temp ="";
        for(int i=s.length()-1;i>=0;i--){
            temp = temp+s.charAt(i);

        }
        System.out.print(temp +" ");
        temp="";
    }

    public static void main(String[] args) {
        ProgramsOnString pstr = new ProgramsOnString();
        String str = "India is my country";
        String plainTest = "ississi";
        String subString = "mississippi";

       // System.out.println(str.length());
        int wordLength =  pstr.countWord(str);
        //System.out.println(wordLength);
        //System.out.println(pstr.checkPalindrome(plainTest));
      //  pstr.printAllSubString(subString,4);
      String[] arr  = pstr.convertStringToArray(str,wordLength);
        System.out.println("Length of Array is " + arr.length);


        // pstr.reverseString("Swati");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
          //  System.out.print(arr[i] + " ");

            pstr.reverseString(arr[i]);
        }


    }
}
