package org.example;

public class Array {

    public static void main(String[] args){

    int [] grades={1,2,3,4};
    System.out.println("The first element is " + grades[0]);


    String [] progLang={"C", "C++", "Java", "Python", "JavaScript", "PHP"};
    progLang[1]="SQL";
    System.out.println(progLang[1]);


    String[] webServices=new String[3];
    webServices[0]="XAMPP";
    webServices[1]="Tomcat";

    System.out.println(webServices[1]);


    }
}
