import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hodei Eceiza
 * Date: 10/1/2020
 * Time: 11:33
 * Project: Bankomaten
 * Copyright: MIT
 */
public class Tools {

    //Currency movements tools
    public static double withdrawal(double amountOut, BankClient bankClient, int accountIndex){
        List<BankAccount> list=bankClient.getBankAccountList();
        double balance=list.get(accountIndex).getBalance();
        if(balance-amountOut>=0) {
            list.get(accountIndex).setBalance(balance - amountOut);
            return balance - amountOut;
        }
        else
            return -1;
    }
    public static void deposit(double amountIn,BankClient bankClient,int accountIndex){
        List<BankAccount> list=bankClient.getBankAccountList();
        double balance=list.get(accountIndex).getBalance();
        list.get(accountIndex).setBalance(balance + amountIn);

    }
    public static void printAccounts(BankClient bankClient){
        bankClient.printable();
    }
    public static void printHistory(BankClient bankClient){

    }
    //Database tools
    public static BankClient findClient(ArrayList<BankClient>bankClients,String name){
       for(BankClient bk:bankClients) {
           if (bk.getName().equalsIgnoreCase(name))
               return bk;
       }
        System.out.println("NOTHNG FOUND!");
       return null;
    }
    public static BankClient SelectClient(ArrayList<BankClient>bankClients,String name){
        for(BankClient bk:bankClients) {
            if (bk.getName().equalsIgnoreCase(name))
                return bk;
        }
        System.out.println("NOTHNG FOUND!");
        return null;
    }
    public static BankClient SelectClient(ArrayList<BankClient>bankClients,BankClient bankClient){
        for(BankClient bk:bankClients) {
            if (bk.getName().equalsIgnoreCase(bankClient.getName()))
                return bk;
        }
        System.out.println("NOTHNG FOUND!");
        return null;
    }
    //Printing tools

    public static String clientsListToPrint(){
        for(BankClient bk:SimDataBase.getBankClientList())
            return bk.printable();
        return null;
    }
    public static String printDate(LocalDateTime localDateTime){
        return localDateTime.format(DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss"));
    }
}
