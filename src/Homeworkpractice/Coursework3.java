package Homeworkpractice;

public class Coursework3 {

    static int Balance = 6500;

    public static void main(String[] args) {
        MoneyWithdraw(400);
        System.out.println(Balance);//6100

        MoneyDeposit(600);
        System.out.println(Balance);//6700
    }

    public static void  MoneyWithdraw (int Withdraw) {Balance = Balance-Withdraw;}

    public static void  MoneyDeposit (int Deposit) {Balance = Balance+Deposit;}








    }

