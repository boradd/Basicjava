package Lecture5;

public class  praticaloperatal1 {
    public static void main(String[] args) {




        int withdraw = 5000;
        int balance = 15000;


        System.out.println("will be able to withdraw:");
        boolean willbeabletowithdraw = withdraw <=  balance && balance>=15000;

        System.out.println(willbeabletowithdraw);
        balance-= withdraw;
        System.out.println(balance);

    }
}
