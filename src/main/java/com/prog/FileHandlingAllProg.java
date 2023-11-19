package com.prog;

import java.io.*;

public class FileHandlingAllProg {

    public File createFileHandle(String path) {

        File file = new File(path);
        return file;
    }

    public void validateFileOperations(File file) {

        System.out.println("validating File with different Assertions");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getParentFile());
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.getFreeSpace());
        System.out.println(file.getName());

    }

    public void createNewFile(File file) {

        if (!file.exists()) {

            try {
                file.createNewFile();
            } catch (Exception e) {

            }
        }
    }

    public void writeDataInsideTheFile(File file) {

        FileWriter fw;
        try {
            fw = new FileWriter(file,true);
            fw.write("Hello , Good Morning!!!");
            fw.flush();
            fw.close();
        } catch (IOException e) {

        }
    }

    public void readDataFromFile(File file){

        FileReader fr;
        BufferedReader br;


        try{


                fr = new FileReader(file);
                br = new BufferedReader(fr);
                String line = br.readLine();
                while (line!=null) {
                    System.out.println(line);
                    line = br.readLine();
                }

        }
        catch (Exception e){

        }
    }

    public static void main(String[] args) {

        FileHandlingAllProg fh = new FileHandlingAllProg();
        File file = fh.createFileHandle("/Users/swati/Documents/HimashuRestAssured/AutomationRestSelenium/fileCreate.txt");
      //  fh.validateFileOperations(file);
        //fh.createNewFile(file);
        fh.writeDataInsideTheFile(file);
        fh.readDataFromFile(file);
    }
}
