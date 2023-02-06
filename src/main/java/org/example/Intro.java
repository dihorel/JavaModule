package org.example;

import java.util.Scanner;

public class Intro {

    public static void main(String[] args){
        /*
        System.out.println("Hello");
         */

        Scanner input =new Scanner(System.in);
        System.out.println("What is your name?");

        String name=input.nextLine();
        System.out.println("Welcome to the java course " + name +"!");

        //Output text

        System.out.println("Text with a \"quote\"");
        System.out.println("The project is in C:\\users");
        System.out.println("Text with blank space    .Yes");
        System.out.println("Text with new line   \nYes");
    }
}

