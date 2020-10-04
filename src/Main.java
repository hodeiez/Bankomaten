import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Testing the tools
        SimDataBase.addBankClientToDb(new BankClient("hodei","naiz","1348","143"));
        SimDataBase.getBankClientList().get(0).addBankAccount(new BankAccount(1.23,2342));
        SimDataBase.getBankClientList().get(0).addBankAccount(new BankAccount(3.21,90000));
        SimDataBase.saveBankClientsDataToFile();
      SimDataBase.getBankClientListFromFile();


        StartMenu st=new StartMenu();


        System.out.println("Date of creation of the first account" +
                Tools.printDate(SimDataBase.getBankClientList().get(0).getBankAccountList().get(0).getCreationDate()));
        System.out.println(Tools.findClient(SimDataBase.getBankClientList(), "hodei").printable());

        System.out.println(Tools.clientsListToPrint());

    }


}
