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

    private static ArrayList<BankClient> bankClientList=new ArrayList<>();
    private static ArrayList<BankStaff> bankStaffList=new ArrayList<>();

    public static ArrayList<BankClient> getBankClientList() {
        return bankClientList;
    }

    public static void addBankClientToDb(BankClient bankClient) {
        bankClientList.add(bankClient);
    }

    public static void saveBankClientsDataToFile() {
        ArrayList<BankClient> list =getBankClientList();
        try {
            FileOutputStream writeData = new FileOutputStream("bankClients.ser");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
            writeStream.writeObject(list);
            writeStream.flush();
            writeStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getBankClientListFromFile() {
        try {
            FileInputStream readData = new FileInputStream("bankClients.ser");
            ObjectInputStream readStream = new ObjectInputStream(readData);
            ArrayList<BankClient> list = (ArrayList<BankClient>) readStream.readObject();
            readStream.close();
            bankClientList=list;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void addBankStaffToDb(BankStaff bankStaff) {
        bankStaffList.add(bankStaff);
    }
    public ArrayList<BankStaff> getBankStaffList() {
        return bankStaffList;
    }
    public void saveBankStaffDataToFile() {
        ArrayList<BankStaff> list =this.getBankStaffList();
        try {
            FileOutputStream writeData = new FileOutputStream("bankClients.ser");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
            writeStream.writeObject(list);
            writeStream.flush();
            writeStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getBankStaffListFromFile() {
        try {
            FileInputStream readData = new FileInputStream("bankClients.ser");
            ObjectInputStream readStream = new ObjectInputStream(readData);
            ArrayList<BankClient> list = (ArrayList<BankClient>) readStream.readObject();
            readStream.close();
            this.bankClientList=list;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public SimDataBase() {
        bankClientList = new ArrayList<BankClient>();
        bankStaffList = new ArrayList<BankStaff>();
    }


}
