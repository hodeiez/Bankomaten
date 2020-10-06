package Tools;

import MainClasses.BankAccount;
import MainClasses.BankClient;
import MainClasses.BankStaff;
import Menus.IPrint;
import Menus.Messages;

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
public class Tools{

//TODO:EXCEPTIONS HANDLING
    //Currency movements tools
    public static void withdrawal(double amountOut, BankClient bankClient, int accountIndex){
        List<BankAccount> list=bankClient.getBankAccountList();
        double balance=list.get(accountIndex).getBalance();
        if(balance-amountOut>=0) {
            list.get(accountIndex).setBalance(balance - amountOut);
        }
        else
            stringPrinter(Messages.NOT_ENOUGH.text);
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
    public static BankStaff findStaff(ArrayList<BankStaff>bankClients,String name){
        for(BankStaff bk:bankClients) {
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
    public static void stringPrinter(String string){
        System.out.println(string);
    }


}
