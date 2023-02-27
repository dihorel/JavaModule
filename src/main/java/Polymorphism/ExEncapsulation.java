package Polymorphism;
class ExEmployee{
    private String EmployeeId;
    private int Salary;

    public void setEmployeeId(String id){
        EmployeeId=id;
    }

    public void setSalary(int salary){
        Salary=salary;
    }

    public String getEmployeeId(){
        return EmployeeId;
    }

    public int getSalary(){
        return Salary;
    }


}
public class ExEncapsulation {
    // Create Employee ID and Salary in the ExEmployee class
    // Using Encapsulation, give values to Employee ID and Salary in a different class, then print those new values


    public static void main(String[] args) {
        ExEmployee empl1=new ExEmployee();
        empl1.setEmployeeId("abcdefg");
        empl1.setSalary(10000);

        System.out.println(empl1.getEmployeeId());
        System.out.println( empl1.getSalary());
    }
}

