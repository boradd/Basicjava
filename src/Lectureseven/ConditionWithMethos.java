package Lectureseven;

public class ConditionWithMethos {

    public static int balance = 10000;

    public static void main(String[] args) {
        deposit(200);
        deposit(100);
        deposit(705);
        Withdraw(45);
        Withdraw(156);
        deposit(800);


    }
    public static void deposit (int amount){
         balance = balance + amount;
        System.out.println("your balance is"+balance);

    }
    public static void Withdraw ( int amount) {
        if (balance >= amount) {
            System.out.println(" yes you can withdraw money");
            balance = balance - amount;
        }else {
            System.out.println( " sorry you don't have enough balance");
        }



        }
    }

