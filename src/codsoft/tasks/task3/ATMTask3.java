package codsoft.tasks.task3;

import com.sun.source.tree.UsesTree;

import java.util.Scanner;


public class ATMTask3{
    public void userInterface(){
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.println("Welcome to the ATM Machine");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Check balance");
            System.out.println("4.Exit");
            System.out.println("Choose an option");

            number = sc.nextInt();



            switch (number) {
                case 1:
                    System.out.println("Enter amount:");
                    Scanner in = new Scanner(System.in);
                    int amount = in.nextInt();
                    account.withdraw(amount);
                    break;
                case 2:
                    System.out.println("Enter the amount you want to deposit");
                    Scanner input = new Scanner(System.in);
                    int amountRs = input.nextInt();
                    account.deposit(amountRs);

                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the service");
                    break;

                default:
                    System.out.println("Invalid");
            }
        }while(number!=4);
    }
    private UserBankAccount account;
    public ATMTask3(UserBankAccount account){
        this.account = account;

    }
    public static void main(String[] args) {
        UserBankAccount usb = new UserBankAccount(1000);
        ATMTask3 atm = new ATMTask3(usb);
        atm.userInterface();





    }
}
