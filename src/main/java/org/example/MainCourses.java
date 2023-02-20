package org.example;

public class MainCourses {
    public static void main(String[] args) {

        /*
        SubjectsC sub1= new PythonC();
        SubjectsC sub2= new JavaC();
*/

        SubjectsI sub1=new PythonI();
        SubjectsI sub2=new JavaI();

        JavaC x=new JavaC();

        sub1.courseContent();
        sub1.codeCompiler();


        sub2.courseContent();
        sub2.codeCompiler();



    }
}
