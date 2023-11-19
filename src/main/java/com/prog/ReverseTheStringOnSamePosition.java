package com.prog;

public class ReverseTheStringOnSamePosition {
    /**
     * 1. Count the number of words
     * 2. create a String[] of word count
     * 3. add the words to the array
     * 4. str[] = [hello, how, are, you] - > str[0],str[1],str[2],str[3]
     * 5. take a temp string temp = ""
     * 6. iterate through the length of each index and do it in reverser and append to the empty string
     * 7.print that temp string
     *
     * @param str
     */
    public static void revStringSamePos(String str) {

        String temp = "";

        String[] arr = new String[wordCount(str)];
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                temp = temp + str.charAt(i);
            } else {
                arr[j] = temp;
                j++;
                temp = "";
            }
            arr[wordCount(str) - 1] = temp;


        }
        for (String string : arr) {

           revWordOnSamePos(string);
        }


    }

    public static void revWordOnSamePos(String str) {
        String temp = "";
        for (int i = str.length()-1;i>=0;i--) {

            temp = temp+str.charAt(i);

        }
        System.out.print(temp + " ");
        temp = "";
    }

    public static int wordCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != ' ' && str.charAt(i + 1) == ' ') {
                count++;
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        String str = "Hello How are you!!! Himanshu";
        int count = wordCount(str);
        System.out.println(count);
        revStringSamePos(str);
    }
}
