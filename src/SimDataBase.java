import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Hodei Eceiza
 * Date: 10/1/2020
 * Time: 11:26
 * Project: Bankomaten
 * Copyright: MIT
 */
public class SimDataBase {
    //here the objects will be made.
    ArrayList<BankClient> bankClientList;
    List<BankStaff> bankStaffList;
    BankClient bankClient;
    BankStaff bankStaff;
    BankStaff bankStaff2;
    BankAccount bankAccount;
    BankLoan bankLoan;
//TODO: ORGANIZE, CLEAR ALL THE MESS, and focus this class to save a list of bank clients and staff, and retrieve them, later will fix methods
// in Tools class....
    public BankClient getBankClient() {
        return bankClient;
    }

    public void setBankClient(BankClient bankClient) {
        this.bankClient = bankClient;
    }

    public void setBankStaff(BankStaff bankStaff) {
        this.bankStaff = bankStaff;
    }

    public BankStaff getBankStaff2() {
        return bankStaff2;
    }

    public void setBankStaff2(BankStaff bankStaff2) {
        this.bankStaff2 = bankStaff2;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public BankLoan getBankLoan() {
        return bankLoan;
    }

    public void setBankLoan(BankLoan bankLoan) {
        this.bankLoan = bankLoan;
    }

    public BankStaff getBankStaff() {
        return bankStaff;
    }

    public ArrayList<BankClient> getBankClientList(){
        return bankClientList;
    }
    public void addBankClientToDb(BankClient bankClient){
        bankClientList.add(bankClient);
    }
    public void addBankStaffToDb(BankStaff bankStaff){
        bankStaffList.add(bankStaff);
    }
    public void saveDataToFile(ArrayList<BankClient> list, String dbName){
        try{
            FileOutputStream writeData = new FileOutputStream(dbName);
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(list);
            writeStream.flush();
            writeStream.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<BankClient> getBankClientListFromDb (){
        try{
            FileInputStream readData = new FileInputStream("bankClients.ser");
            ObjectInputStream readStream = new ObjectInputStream(readData);

            ArrayList<BankClient> list = (ArrayList<BankClient>) readStream.readObject();
            readStream.close();
            return list;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public SimDataBase() {
        bankClientList=new ArrayList<BankClient>();
        setBankClient(new BankClient("hodei", "ez", "199283213-134", "796535432"));
        setBankStaff(new BankStaff("hur", "ez", "9762314", "998832141"));
        setBankStaff2(new BankStaff("practicant", "ezdsa", "fds62314", "fda8832141"));
        setBankLoan(new BankLoan(0.35, 199990, getBankStaff()));
       setBankAccount(new BankAccount(0.23, 100000));
    }



}
