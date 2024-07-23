package codsoft.tasks.task3;

import java.util.Scanner;

public class UserBankAccount {
    float balance;

    public UserBankAccount(float balance) {
        this.balance = balance;
    }


    public float getBalance() {
        return balance;
    }

    public void withdraw(int amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn Successfully");
        }else{
            System.out.println("Insufficient balance! withdrawl failed");
        }

    }

    public void deposit(double amount){
       if(amount > 0){
           balance += amount;
           System.out.println("successful deposit");
       }else{
           System.out.println("deposit failed");
       }



    }

    public void checkBalance(){
        System.out.println("Balance = "+balance);
    }
}
