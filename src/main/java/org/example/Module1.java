package org.example;

public class Module1 extends BaseModule{//this a child/subclass
    int duration=16;
    String subject="Methodology/Project management";
    String Test="a test based on main concepts presented in the module";

    String location="online only";

    public void display(){
        System.out.println("Presented"+ super.location);
    }

}
