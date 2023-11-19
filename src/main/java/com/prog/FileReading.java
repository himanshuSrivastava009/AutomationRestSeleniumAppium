package com.prog;

import java.io.*;

public class FileReading {

    public static void readFile(BufferedReader br) throws IOException, EmptyFile {

        EmptyFile file = new EmptyFile();
        PrintWriter printWriter = new PrintWriter("/Users/swati/Documents/HimashuRestAssured/AutomationRestSelenium/testCreate.txt");

       // file.getMessage();
       while(br.readLine()!=null){

           String line = br.readLine();
           System.out.println(line);
          writeToAFile(printWriter, line);

       }
      // throw file;
    }

    public static void writeToAFile(PrintWriter writer, String line){

        writer.println(line);
        writer.flush();

    }

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("/Users/swati/Documents/HimashuRestAssured/AutomationRestSelenium/testng.xml"));
            readFile(br);
        }
        catch (IOException e){
            System.out.println(e.getStackTrace());
        } catch (EmptyFile e) {
            throw new RuntimeException(e);
        }

    }
}
