package org.example;

import java.util.Scanner;

public class ExMethods {

    // Write a program that requests the full name of the user, and prints it after the message "Hello, ", with the use of a method
    public static void main(String[] args) {
        System.out.println("Write down your name");
        Scanner scan=new Scanner(System.in);
        name(scan.nextLine());
    }

public static void name(String txt){
        System.out.println("Hello "+txt);
}

}
