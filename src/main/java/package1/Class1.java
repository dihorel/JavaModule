package package1;
import package2.*;


public class Class1 {
protected String protVar="Protected variable";// Accessible in a different package, to a different class only if it is a subclass of this one

    public static void main(String[] args) {

        Class3 C3 =new Class3();
        //System.out.println(C3.defVar);//System.out.println(C3.publicVar);
        System.out.println(C3.publicVar);// "pubVariable" is visible even if it is in package2, since it is public

        Class2 C2=new Class2();
        //System.out.println(C2.priVar);


    }
}
