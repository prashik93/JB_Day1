package org.example;
import java.util.Scanner;
public class Main {
    String stringValue;
    int intValue;
    float floatValue;
    boolean booleanValue;
    double doubleValue;
    long longValue;

    Scanner scnr;
    public Main () {
        scnr = new Scanner(System.in);
    }

    public void leapYear() {
        System.out.println("Enter Year : ");
        int year = scnr.nextInt();
        int yearUpto = 1582;
        if(year > yearUpto){
            if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                    System.out.println("It is a Leap year");
            } else {
                System.out.println("It is not a Leap year");
            }
        } else {
            System.out.println("Year should  be greater than 1582");
        }
    }
    public void sumOfCommandLineArguments() {
        int temp;
        int sum = 0;
        System.out.print("\n Enter how many times do you want to iterate the loop : ");
        int num = scnr.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter number for performing addition operation : ");
            temp = scnr.nextInt();
            sum = sum + temp;
        }
        System.out.println("Sum of Valid Integers : " + sum);
    }

    public void getNameFromCommandLine() {
        System.out.println("Enter name : ");
        String name = String.valueOf(scnr.next());
        System.out.println("Entered name is : " + name);
    }

    public void stringsEqualOrNot() {
        String str1 = "Prashik";
        String str2 = "Prashik";
        if (str1.equals(str2)) {
            System.out.println("Both the strings are equals");
        } else {
            System.out.println("Strings are different");
        }
    }

    public void defaultValues() {
        System.out.println("All default values");
        System.out.println("String : " + stringValue);
        System.out.println("Integer : " + intValue);
        System.out.println("Float : " + floatValue);
        System.out.println("Boolean : " + booleanValue);
        System.out.println("Double : " + doubleValue);
        System.out.println("Long : " + longValue);
    }

    public void displayMessage() {
        System.out.println("Welcome!");
    }

    public static void main(String[] args) {
        Main mainObj = new Main();
        mainObj.displayMessage();
        mainObj.defaultValues();
        mainObj.stringsEqualOrNot();
        mainObj.getNameFromCommandLine();
        mainObj.sumOfCommandLineArguments();
        mainObj.leapYear();
    }
}
