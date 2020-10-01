/**
 * Created by Hodei Eceiza
 * Date: 9/29/2020
 * Time: 21:28
 * Project: Bankomaten
 * Copyright: MIT
 */
public class BankAccount implements IPrintable{
    private double interestRate;
    private double balance;

    public BankAccount(double interestRate,double balance){
        this.balance=balance;
        this.interestRate=interestRate;
    }

    public String printable(){
        return "Account balance: " + balance + " Interest Rate: " + interestRate;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double newBalance){
        this.balance=newBalance;
    }
}
