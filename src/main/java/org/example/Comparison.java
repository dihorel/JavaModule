package org.example;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args){
        // Operators are used to perform operations on variables and values

        // 1. Arithmetic operators
        // 2. Assignment operators
        // 3. Comparison operators
        // 4. Conditional operators - Logical & Ternary

        // 1. Arithmetic Operators

        /*
            +	Addition
            -	Subtraction
            *	Multiplication
            /	Division
            %	Modulus	Returns the division remainder
            ++	Increment	Increases the value of a variable by 1
            --	Decrement	Decreases the value of a variable by 1
         */
        int result=1+2;
        System.out.println("The result is " + result);
        System.out.println("The result is " + 1 + 2);//Concatenare

        int no=4;
        ++no;
        System.out.println(no);

        //Assignment
        int a=1;
        int b=2;
        //a=a+b;
        a+=b;
        System.out.println(a);

        //Comparison operators
        /*
        a==8
        b!=4

         */

        int var1=8;
        int var2=9;
        boolean b1=(var1==var2);
        System.out.println(b1);

        //Comparison operators with if statements
        int val3=12;
        if(val3!=12){
            System.out.println("Comparison is true");
        }
        else{
            System.out.println("Comparison is false");
        }


        //Logical OR AND NOT
        // ||
        if(val3==9 || val3==12){
            System.out.println("One of the condition is met");
        }


        //&&
        if(val3>=9 && val3<=12){
            System.out.println("The value is between 9 and 13");
        }

        //!
        Scanner scan1=new Scanner(System.in);
        System.out.println("To log out press Y  or y \n");
        String input1=scan1.next();
        if(!input1.equals("Y") && !input1.equals("y")){
            System.out.println("You are still logged in");
        }
        else{
            System.out.println("You have logged out");
        }

        //Ternary
        int x=(15>2)?5:2;//afiseaza ce e dupa ? daca true daca nu ce e dupa :
        System.out.println(x);
        String y=(5>3)?"True":"False";
        System.out.println(y);




    }
}
