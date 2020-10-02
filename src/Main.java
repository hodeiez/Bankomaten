import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


SimDataBase db=new SimDataBase();

db.getBankClient().addBankAccount(db.getBankAccount());
        db.getBankClient().addBankLoan(db.getBankLoan());
       db.getBankLoan().changeInterestRate(12,db.getBankStaff2());

        System.out.println(db.getBankClient().printable());

        //testing withdrawal
        Tools.withdrawal(5000, db.bankClient, 0);


        System.out.println(db.getBankClient().printable());
        db.addBankClientToDb(db.getBankClient());
        db.saveDataToFile(db.getBankClientList(),"bankClients.ser");
        ArrayList printdb=db.getBankClientListFromDb();


        System.out.println("printing from the list!!!");

        for(Object obj:printdb){
            System.out.println(((BankClient) obj).printable());

        }

    }

}
