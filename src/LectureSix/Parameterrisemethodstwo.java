package LectureSix;

public class Parameterrisemethodstwo {
    public static void main(String[] args) {


        employeeId(201);
        employessName("Deep Borad");
        employessSalary( 205204454);
        employessSharecode(254135);



    }
    public static void employeeId(int a){
        System.out.println("This Employee id is "+a);
    }

    public static void employessName(String name){
        System.out.println("This Employee Name is"+name);
    }

    public static void employessSalary(int salary){
        System.out.println("salary is "+ salary);
    }

    public static void employessSharecode(int Sharecode) {
        System.out.println("Sharecode is"+ Sharecode );
    }
}
