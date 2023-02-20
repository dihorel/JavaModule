package org.example;

public class PythonI implements SubjectsI{


    @Override
    public void courseContent() {
        System.out.println("Python");
    }

    @Override
    public void codeCompiler() {
        System.out.println("Python compiler");
    }

    @Override
    public void courseDuration(int hours) {
        System.out.println();
    }
}
