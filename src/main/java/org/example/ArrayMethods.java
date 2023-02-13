package org.example;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int [] grades={1,2,3,4};
        int [] grades2={2,1,3,4};

        String [] progLang={"C", "C++", "Java", "Python", "JavaScript", "PHP"};

        String[] webServices=new String[3];
        webServices[0]="XAMPP";
        webServices[1]="Tomcat";


        //1.Fill
        int [] arr=new int[4];
        Arrays.fill(arr,55);
        for(int i:arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        //2.Copy
        int[] newGrades=Arrays.copyOf(grades,grades.length);
        for(int i:newGrades) {
            System.out.print(i + " ");
        }


        //3.Compare 2 arrays-Equals
        System.out.println(Arrays.equals(progLang,webServices));
        System.out.println(Arrays.equals(grades,grades2));



        //4.Sort
        Arrays.sort(grades2);
        for(int i:grades2) {
            System.out.print(i + " ");
        }

        System.out.println();


        //5.Binary search->returns the index of an element; array must be sorted frist
        System.out.println(Arrays.binarySearch(grades,4));



        //6.Print all
        for(int i=0;i<webServices.length;i++){
            System.out.println(webServices[i]);
        }





    }
}
