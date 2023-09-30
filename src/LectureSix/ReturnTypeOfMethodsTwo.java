package LectureSix;

public class ReturnTypeOfMethodsTwo {
    // Balance
    // Withdraw
    // RemaningBalance

    static int balance = 45000;


    public static void main(String[] args) {
        moneyWithdraw(15000);
        System.out.println(balance);
        moneyDeposit(10000);
        System.out.println(balance);
        moneyDeposit(1450);
        System.out.println(balance);
        moneyDeposit(1400);
        System.out.println(balance);
        moneyWithdraw(1500);
        System.out.println(balance);


        int totalInterestGain = bankscheme(balance);
        System.out.println(totalInterestGain);


    }


    public static void moneyWithdraw(int withdrawfees){
        balance= balance-withdrawfees;
    }
    public static void moneyDeposit(int Deposit){
        balance=balance+ Deposit;
    }
    public static int bankscheme (int balance){
        int totalInterestGain = (balance*5)/100;
        return totalInterestGain;
    }
}

