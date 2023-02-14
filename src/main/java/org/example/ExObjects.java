package org.example;

public class ExObjects {
    /*
    Create a "Student" class that has the following attributes:
    - First name
    - Last name
    - Year of birth
    - Phone number

    in the "ExObjects" class, create a student object
    Provide values for those attributes and print out: "Full name: first name & last name"
    Calculate his age with a method and print the result in the following format: "Age: (result of the calculation)"
    Print out the full phone number: "Phone number: 0xxxxxxxxx"
    */

    public static void main(String[] args) {

        Student stud =new Student();

        stud.firstName="Viorel";
        stud.lastName="Valeanu";
        stud.yearOfBirth=1984;
        stud.phoneNumber="0744437773";

        System.out.println("First name: " + stud.firstName+" "+ stud.lastName);
        System.out.println("Age: "+ stud.age(stud.yearOfBirth));
        System.out.println("Phone number: " + stud.phoneNumber);

    }
}
