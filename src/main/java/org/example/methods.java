package org.example;

import java.util.Scanner;

public class methods {

    public static void main(String[] args) {
        //The println method
        String title = "Text";
        System.out.println(title.toUpperCase());

        /*Scanner scan=new Scanner(System.in);
        System.out.println("Enter an argument");
        String argument=scan.nextLine();
        System.out.println(argument);*/


        //Ex1 -print a string
        print("Hello again");

        //EX2-sum


        //Ex3- Calculate sum of the elements of an
        int[] grades = new int[3];
        grades[0] = 1;
        grades[1] = 2;
        grades[2] = 3;

        int sum = sum_array(grades);
        print("The sum is" + sum);




        //Ex5-A string method
        String nextText=add_text2("St");
        print(nextText);
    }

    public static void print(String word) {
        System.out.println(word);
    }

    public static void sum(int nr1, int nr2) {
        System.out.println(nr1 + nr2);
    }


    public static int sum_array(int[] grades) {
        int addition = 0;
        for (int i = 0; i < grades.length; i++) {
            addition += grades[i];
        }
        return addition;

    }

    public static String add_text2(String st){
        return st+"ring 2";
    }









}

