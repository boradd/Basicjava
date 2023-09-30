package Lecture5;

public class PraticalOperators {
    public static void main(String[] args) {
        //1. Arithmetic
        //2. Assigment
        //3. Comparision -a>10, a>b
        //4. Logical


        int a=10;
        int b=30;
        boolean answer =a>10 && a>b;
        //              true&&true----true
        //              false&&false---false
        System.out.println(answer);
        boolean Answer= a==10|| a<b;
        System.out.println(Answer);
        boolean AANSWER= !(a<20&&b<10);
        System.out.println(AANSWER);





    }
}
