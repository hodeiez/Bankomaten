import MainClasses.BankAccount;
import MainClasses.BankLoan;
import MainClasses.BankStaff;
import MainClasses.IChangeInterestRate;
import Menus.StartMenu;
import Tools.SimDataBase;

public class Main {

    public static void main(String[] args) {

        //Testing the tools
       Tools.SimDataBase.addBankClientToDb(new MainClasses.BankClient("hodei","naiz","1348","143"));
       Tools.SimDataBase.getBankClientList().get(0).addBankAccount(new MainClasses.BankAccount(1.23,2342));
       Tools.SimDataBase.getBankClientList().get(0).addBankAccount(new MainClasses.BankAccount(3.21,90000));
       Tools.SimDataBase.getBankClientList().get(0).addBankLoan(new BankLoan(2.3,100000,new BankStaff("Jerry","lee","12231","9871234")));
       Tools.SimDataBase.saveBankClientsDataToFile();
      SimDataBase.getBankClientListFromFile();


        StartMenu st=new StartMenu();
/*

        System.out.println("Date of creation of the first account " +
                Tools.Tools.printDate(Tools.SimDataBase.getBankClientList().get(0).getBankAccountList().get(0).getCreationDate()));
        System.out.println(Tools.Tools.findClient(Tools.SimDataBase.getBankClientList(), "hodei").printable());

        System.out.println(Tools.Tools.clientsListToPrint());
*/
    }


}
