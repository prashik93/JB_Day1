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
    }
}
