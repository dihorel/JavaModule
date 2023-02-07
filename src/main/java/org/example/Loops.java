package org.example;

public class Loops {
    public static void main(String[] args){


        /*
        For loop
        While loops
        Do while loops
        For Each loops
         */

        //For
        for (int i=0; i<3; i++){
            System.out.println("for "+i);
        }

        //While
        int wl=0;
        while(wl<2){
            System.out.println("while "+wl);
            wl++;
        }

        //For each
        String[] progLang={"C++","JAVA","Python"};

        for(String prog : progLang){
            System.out.println(prog);
        }


        //Do while
        int wz = 0;
        do {
            System.out.println("ana are mere");
            wz++;
        }
        while (wz<5);

    }


}
