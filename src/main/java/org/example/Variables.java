package org.example;

public class Variables {

    static final int MAX_NO=101;

    public static void main(String[] args){

   /* Data Types

           1. Primitive

             - byte
             - short
             - int
             - long
             - float
             - double
             - char
             - boolean

           2. Non-Primitive

             - String
             - Arrays
             - Classes
             - Interfaces
             etc.

           3. Type Casting
    */
        //Primitive
        byte b1=0;
        short s1=10;
        int i3=9999, i4=-500;

        System.out.println(i3+b1);

        long l1=8938934839L;
        float f1=34.5f;
        double d1=4556d;

        System.out.println(l1);
        System.out.println(f1);
        System.out.println(d1);

        char c1='A';
        System.out.println(c1);
        boolean B1=true;
        boolean B2=(s1==10);




        //Non primitives
        String str1="This is a string";


        //Constants
        //final int MAX_NO=100;
        System.out.println(MAX_NO);


        //Type casting

        //Widening
        int myInt1=5;
        double myDouble1=myInt1;
        System.out.println(myInt1);
        System.out.println(myDouble1);

        //Narrowing
        double myDouble2=5.25d;
        int myInt2=(int) myDouble2;
        System.out.println(myInt2);
        System.out.println(myDouble2);
    }
}
