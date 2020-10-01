import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


SimDataBase db=new SimDataBase();
db.getBankClient().addBankAccount(db.getBankAccount());
        db.getBankClient().addBankLoan(db.getBankLoan());
       db.getBankLoan().changeInterestRate(12,db.getBankStaff2());

        System.out.println(db.getBankClient().printable());

    }

}
