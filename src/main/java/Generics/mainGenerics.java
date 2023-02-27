package Generics;

public class mainGenerics {

  /*
     static void main(String[] args) {
        // 1. Non-generic classes with different data types
        intClass newInt1 = new intClass(8);
        charClass newChar1 = new charClass('X');

        System.out.println(newInt1.getVal());
        System.out.println(newChar1.getVal());
    }


    public static void main(String[] args) {
        GenClass1<Integer> newInt2=new GenClass1<>(8);
        GenClass1<Character> newChar2=new GenClass1<>('X');
        System.out.println(newInt2.getVal());
        System.out.println(newChar2.getVal());
    }


    public static void main(String[] args) {
        //GenClass2<Integer,Integer> newInt3=new GenClass2<>(8,12);
        GenClass2<Integer,Character> newInt3=new GenClass2<>(8,'X');
        System.out.println(newInt3.getVal1());
        System.out.println(newInt3.getVal2());
    }
      */
  public static void main(String[] args) {
      Numerics<Integer> calc= new Numerics<>(4);
      System.out.println(calc.square());
  }

}
