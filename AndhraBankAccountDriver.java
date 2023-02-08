package block2;

import java.util.Date;
import java.util.Scanner;

public class AndhraBankAccountDriver {
    static{
        System.out.println("Welcome to ANDHRA Bank");
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);


        AndhraBankAccount.setAnnualInterestRate(4.5);
        System.out.println("Today's Interest Rate is = "+AndhraBankAccount.getAnnualInterestRate()+"%");

        System.out.println("Enter first name: ");
        String first_name = scan.nextLine();

        System.out.println("Enter last name: ");
        String last_name = scan.nextLine();

        AndhraBankAccount obj1 = new AndhraBankAccount(300, first_name, last_name, 100);

        System.out.println("Your account details are:");
        System.out.println("my name is " + obj1.getF_name() + " " + obj1.getL_name());
        System.out.println("Account number:"+obj1.getAccountNb());


        System.out.println("Current balance is  " + obj1.getBalance());
        System.out.println("Interest Rate is = "+AndhraBankAccount.getAnnualInterestRate()+"%");
        System.out.println("Monthly interest for this balance is  $" + obj1.getMonthlyInterestRate());
        System.out.println("This account was created on " + obj1.getDateCreated());
        int choice;
        do {

            System.out.println("Enter your choice (0: deposit, 1: withdraw, 2: quit): ");
            choice = scan.nextInt();
            switch (choice) {
                case 0:
                    System.out.print("enter the amount in $");
                    obj1.deposit(scan.nextDouble());
                    break;
                case 1:
                    System.out.print("enter the amount in $");
                    obj1.withdraw(scan.nextDouble());
                    break;
                case 2:
                    break;
                default:
                  System.out.println("please select one of the given options 0, 1, 2");
                    break;
            }

        } while (choice != 2);
        System.out.println("New balance is $"+obj1.getBalance());
        System.out.println("Good-Bye !");
    }


}