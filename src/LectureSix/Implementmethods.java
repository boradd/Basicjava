package LectureSix;

public class Implementmethods {

    // Is a blockof statement used to achieve a task
    //2 Types of Methods-1 Pre Define - Methods Which are Already Create By Java and has Meaning
    //                   2. User Define - Methods which are create by developer / user
    //                      2.1 Simple Methods - if
    //                      2.2 Parameterized Methods
    //                      3.3 Return Type Methods
    public static void main(String[] args) {
        divisionofTwoNumber();
        sumoftwonumber();


        Implementmethods implementmethods = new Implementmethods();
        implementmethods.sumofthreeNumber();


    }
    public static void divisionofTwoNumber(){
        int x=30;
        int y=20;
        int z=x/y;
        System.out.println(z);
    }public  static  void sumoftwonumber(){
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
    }public  static void sumofthreeNumber(){
        int a=30;
        int b=40;
        int c=50;
        int e=a+b+c;
        System.out.println(e);
    }



}
