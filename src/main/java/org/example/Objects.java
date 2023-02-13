package org.example;

public class Objects {
    public static void main(String[] args) {

        Classes Java1 = new Classes();                    //Constructor
        Java1.subject = "Java";
        Java1.level = "Basics";
        Java1.duration = 24;

        Classes Python1 = new Classes();
        Python1.subject = "Python";


        System.out.println("We are learning " + Java1.subject + " " + Java1.level + " after learning " + Python1.subject);
    }

}
