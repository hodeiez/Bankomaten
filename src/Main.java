import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        SimDataBase db = new SimDataBase();
        db.getBankClientListFromFile();

        System.out.println(Tools.findClient(db.getBankClientList(), "hodei").printable());

        System.out.println(Tools.clientsListToPrint());
    }

}
