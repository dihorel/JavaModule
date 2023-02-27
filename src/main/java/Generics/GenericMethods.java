package Generics;

public class GenericMethods {

    public static void main(String[] args) {
        Integer[] intArr = {0,1,2,3,4};
        Double[] doubleArr = {1.5, 2.5, 3.5, 4.5, 5.5};
        Character[] charArr = {'a', 'b', 'c', 'd', 'e'};
        String[] stringArr = {"this", "is", "a", "string", "array"};
        displayElements(intArr);
        displayElements(doubleArr);
        displayElements(charArr);
        displayElements(stringArr);
    }

    public static <T> void displayElements(T[] array){
        for(T e:array){
            System.out.println(e+ " ");
        }
    }
}

