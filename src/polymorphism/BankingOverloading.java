package polymorphism;

public class BankingOverloading {

    static int balance = 1000;

    public static void main(String[] args) {
      //deposit - 1000
      //chritmas- deposit-1000 - 5- cashback

        BankingOverloading bankingOverloading = new BankingOverloading();
        String season= "Normal";
        if (season == "Normal") {
            bankingOverloading.deposit(100);
        } else if (season==" Christmas "){
            bankingOverloading.deposit(100,5);
        }

    }
    public void deposit (int depositMoney){
        balance = balance + depositMoney;

    }

    public void  deposit (int depositMoney , int cashback){
        depositMoney = (depositMoney* cashback)/100;
        System.out.println(" you got this much cashback");
        balance= balance + (depositMoney + cashback);

    }
}

