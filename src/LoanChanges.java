import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by Hodei Eceiza
 * Date: 9/30/2020
 * Time: 14:09
 * Project: Bankomaten
 * Copyright: MIT
 */
public class LoanChanges implements IPrintable, Serializable {
    LocalDateTime changeDate;
    BankStaff bankStaff;
    double interestRate;

    public LoanChanges(LocalDateTime changeDate, BankStaff bankStaff, double interestRate){
        this.bankStaff=bankStaff;
        this.changeDate=changeDate;
        this.interestRate=interestRate;
    }
    public String printable(){
        return "Date: " + changeDate +"\n made by: " + bankStaff.printable() + "\n new InterestRate:" + interestRate;
    }

}
