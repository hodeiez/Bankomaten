import java.io.Serializable;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Hodei Eceiza
 * Date: 9/29/2020
 * Time: 21:28
 * Project: Bankomaten
 * Copyright: MIT
 */
public class BankLoan implements IChangeInterestRate,IPrintable, Serializable {
    private double interestRate;
    private double amount;
    private BankStaff bankStaff;

    private List<LoanChanges> loanChanges=new ArrayList<>();
    private LocalDateTime creationDate;

    public BankLoan(double interestRate,double amount,BankStaff bankStaff){
        creationDate= LocalDateTime.now();
        this.interestRate=interestRate;
        this.amount=amount;
        this.bankStaff=bankStaff;
        loanChanges.add(new LoanChanges(creationDate,bankStaff,interestRate));
    }

    @Override
    public void changeInterestRate(double interestRate,BankStaff bankStaff) {
        this.interestRate=interestRate;
        loanChanges.add(new LoanChanges(LocalDateTime.now(),bankStaff,interestRate));
    }
    public String loanChangesListToString(){

            StringBuilder sb=new StringBuilder();
            for(LoanChanges loanChanges:loanChanges){
                sb.append(loanChanges.printable());
                sb.append("\n");
            }
            return sb.toString();
    }
    public String printable(){
        return "Loan created by: " + bankStaff.getName()+"\n" + amount +"kr. " +
                "interestRate: " +interestRate + "\n Loans history\n" + loanChangesListToString();
    }

}
