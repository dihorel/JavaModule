package Exceptions;

import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        int nr1;
        int nr2;

        Scanner scan1 =new Scanner(System.in);
        System.out.println("Enter first number: ");
        nr1= scan1.nextInt();

        System.out.println("Enter second number: ");
        nr2= scan1.nextInt();

        int sum= nr1+nr2;
        System.out.println("The sum is: "+ sum);
    }
}
