package org.example;

public class CreditCard {

    public static void main(String[] args) {
        BankAccount Credit =new BankAccount();
        Credit.amount=10000;
        Credit.fee=5.0;

        BankAccount Savings=new BankAccount();
        Savings.amount=2500;
        Savings.fee=3.75;


        System.out.println("Account details:");
        System.out.println("Credit card amount $:"+Credit.amount);
        System.out.println("Credit card monthly fee $"+Credit.fee);
        System.out.println("Savings account amount $:"+Savings.amount);
        System.out.println("Savings account amount %:"+Savings.fee);

    }




}
