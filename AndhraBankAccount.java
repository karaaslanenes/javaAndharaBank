package block2;

import java.util.Date;

public class AndhraBankAccount {
    private static double annualInterestRate;
    private static int nextAccountNb=300;
    private int accountNb;
    private String f_name;
    private String l_name;
    private double balance;
    private Date dateCreated;

    public AndhraBankAccount(){

        nextAccountNb++;
    }

    public AndhraBankAccount(int accountNb, String f_name, String l_name, double balance) {
        this.accountNb = accountNb;
        this.f_name = f_name;
        this.l_name = l_name;
        this.balance = balance;
        this.dateCreated = new Date();
        nextAccountNb++;
    }

    public static double getAnnualInterestRate() {

        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        AndhraBankAccount.annualInterestRate = annualInterestRate;
    }

    public int getAccountNb() {

        return accountNb;
    }

    public void setAccountNb(int accountNb) {

        this.accountNb = accountNb;
    }

    public String getF_name() {

        return f_name;
    }

    public void setF_name(String f_name) {

        this.f_name = f_name;
    }

    public String getL_name() {

        return l_name;
    }

    public void setL_name(String l_name) {

        this.l_name = l_name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public Date getDateCreated() {

        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {

        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate() {

        return getAnnualInterestRate()/12;
    }

    public void withdraw(double withdrawAmount) {
        if (this.balance == 0 || this.balance-withdrawAmount<0) {
            System.out.println("NOT  enough funds ");
        } else {
            this.balance-=withdrawAmount;
            System.out.println("IT S  DONE ");
        }
        System.out.println("Balance: "+this.getBalance());
    }

    public void deposit(double cash) {
        //	System.out.println("To deposit "+cash);
        this.balance+=cash;

    }

}