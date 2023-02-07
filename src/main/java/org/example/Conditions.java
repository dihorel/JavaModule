package org.example;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        if (true) {
            System.out.println("The statement is true");
        }


        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scan1.nextInt();
        if (age >= 18) {
            System.out.println("Access granted");
        }
        else {
            System.out.println("Access denied");
        }



        //else if statement
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String user=scan2.next();

        int nr=user.length();
        if (nr >= 0 & nr <= 5) {
            System.out.println("Your username must be longer then 5 chars ");
        }
        else if(nr>10){
            System.out.println("Your username must be shorter then 11 chars ");
        }
        else{
            System.out.println("Welcome "+user);
        }


        //Switch Case
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Enter the module number: ");

        int Module =scan3.nextInt();

        switch (Module) {
            case 1:
                System.out.println("Module nr." + Module + " is Agile");
                break;
            case 2:
                System.out.println("Module nr." + Module + " is Data Visualisation");
                break;
            case 3:
                System.out.println("Module nr." + Module + " is Version Control");
                break;
            case 4:
                System.out.println("Module nr." + Module + " is Python");
                break;
            case 5:
                System.out.println("Module nr." + Module + " is Testing");
                break;
            case 6:
                System.out.println("Module nr." + Module + " is API");
                break;
            case 7:
                System.out.println("Module nr." + Module + " is Java");
                break;
        }


    }
}
