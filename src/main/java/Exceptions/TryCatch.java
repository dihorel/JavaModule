package Exceptions;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class TryCatch {
    public static void main(String[] args) {
/*
        try {
            int[] ar1 = {1, 2, 3};
            System.out.println(ar1[3]);
        }catch (Exception e){
            System.out.println("Index not valid: ");
        }

//Ex.2
        Scanner scan1 =new Scanner(System.in);
        System.out.println("Please enter first number:");
        int nr1= scan1.nextInt();
        System.out.println("Please enter first number:");
        int nr2= scan1.nextInt();

        try{
            float div=nr1/nr2;
            System.out.println(div);
        }catch ( ArithmeticException e){
            System.out.println("Division by 0");
        }finally {
            System.out.println("End of execution");
        }


        int[] ar2=null;
        try {
            System.out.println(ar2[0]);
        }catch(NullPointerException e){
            System.out.println(e);
            System.out.println("The array is null");
        }
        */
//Ex.4
        Scanner scan1=new Scanner(System.in);
        System.out.println("Password");
        String pw=scan1.nextLine();

        try{
            checkPassword(pw);
        } catch(Exception e){
            System.out.println(e);

        }


    }
    static void checkPassword(String pw) throws CustomException{
        if(pw.equals("0000")){
            throw new CustomException("Access granted");
        }else{
            System.out.println("Invalid password");
        }

    }
}