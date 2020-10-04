import javax.swing.*;

/**
 * Created by Hodei Eceiza
 * Date: 10/4/2020
 * Time: 13:19
 * Project: Bankomaten
 * Copyright: MIT
 */
public class StartMenu {
    //Select client or staff->write pin number->start menu.
    public StartMenu() {
        System.out.println("select");
        int i = 1;
        switch (i) {
            case 1:
                clientMenu();
                break;
            //  case 2 -> staffMenu();
        }
    }
    public void clientMenu (){
       String name=JOptionPane.showInputDialog("setName");
      BankClient bankClient= Tools.findClient(SimDataBase.getBankClientList(),name);
      MenuClient.menuStart(bankClient);
    }
    public void staffMenu(){

    }
}
