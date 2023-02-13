package org.example;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class ExLoops {
/*
       Write a program that requests the user to input a password and compare it to an existing value: P@ssword0
       If they are different, print "Incorrect password. Please try again"
       If they are not different, print "Login successful"
    */


    public static void main(String[] args) {

        String existing_password="P@ssword0";
        Scanner scan=new Scanner(System.in);
        String input_string;

        while(true){
            System.out.println("Password:");
            input_string= scan.nextLine();

            if(input_string.equals(existing_password)){
                System.out.println("Login successful");
                break;
            }
        }
        }



}
