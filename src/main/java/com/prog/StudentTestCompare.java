package com.prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class StudentTestCompare {

    public static void main(String[] args) {

       // StudentTest st = new StudentTest(26,900,"Yimanshu");
        //StudentTest st1 = new StudentTest(26,100, "Swati");
        ArrayList<StudentTest> studentTestArrayList = new ArrayList<>();
        studentTestArrayList.add(new StudentTest(26,900,"Yimanshu"));
        studentTestArrayList.add(new StudentTest(26,100, "Swati"));

        Collections.sort(studentTestArrayList);
        for (StudentTest s: studentTestArrayList) {

            System.out.println(s);
        }

       Collections.sort(studentTestArrayList, ( o1,  o2) -> o1.marks>o2.marks?1:-1);


    }
}
