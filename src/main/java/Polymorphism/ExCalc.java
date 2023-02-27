package Polymorphism;

public class ExCalc {

// Using Polymorphism, provide the option to calculate the sum of 2 numbers, first integers and then doubles
    // Use that option in a different class. Provide values for each case, and print the results


    public void sum(int a,int b){
        System.out.println(a+b);
    }

    public void sum(double a,double b){
        System.out.println(a+b);
    }
}

class RunRoutine{
    public static void main(String[] args) {
        ExCalc sumInt=new ExCalc();

        sumInt.sum(3,7);
        sumInt.sum(3.14,34.6);
    }

}