import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        SimDataBase db = new SimDataBase();

        db.addBankClientToDb(new BankClient("newone", "newSurname", "id23425", "phone"));
        db.saveDataToFile(db.getBankClientList(), "bankClients.ser");

        ArrayList<Person> bk = db.getBankClientListFromDb();

        for (Object obj : bk)
            System.out.println(((BankClient) obj).printable());
    }

}
