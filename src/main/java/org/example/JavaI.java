package org.example;

public class JavaI implements SubjectsI,TestInterface
{
    @Override
    public void courseContent() {
        System.out.println("Java Fundamentals");
    }

    @Override
    public void codeCompiler() {
        System.out.println("with Intelij");
    }


    @Override
    public void courseDuration(int hours) {
        System.out.println("The course lasts "  +2*hours);
    }
}
