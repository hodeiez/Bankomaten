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
    ArrayList<Person> bankClientList;
    List<BankStaff> bankStaffList;



    public ArrayList<Person> getBankClientList(){
        return bankClientList;
    }
    public void addBankClientToDb(BankClient bankClient){
        bankClientList.add(bankClient);
    }
    public void addBankStaffToDb(BankStaff bankStaff){
        bankStaffList.add(bankStaff);
    }
    public void saveDataToFile(ArrayList<Person> list, String dbName){
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
    public ArrayList<Person> getBankClientListFromDb (){
        try{
            FileInputStream readData = new FileInputStream("bankClients.ser");
            ObjectInputStream readStream = new ObjectInputStream(readData);
           ArrayList<Person> list = (ArrayList<Person>) readStream.readObject();
            readStream.close();
            return list;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public SimDataBase() {
        bankClientList=new ArrayList<Person>();
        bankStaffList=new ArrayList<BankStaff>();
        addBankClientToDb(new BankClient("hodei", "ez", "199283213-134", "796535432"));
        addBankStaffToDb(new BankStaff("hur", "ez", "9762314", "998832141"));
        addBankStaffToDb(new BankStaff("practicant", "ezdsa", "fds62314", "fda8832141"));
    }



}
