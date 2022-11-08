package org.example;

public class Main {
    String stringValue;
    int intValue;
    float floatValue;
    boolean booleanValue;
    double doubleValue;
    long longValue;

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
    }
}
