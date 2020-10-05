package Menus;

import MainClasses.BankClient;
import Tools.SimDataBase;
import Tools.*;

/**
 * Created by Hodei Eceiza
 * Date: 10/4/2020
 * Time: 13:19
 * Project: Bankomaten
 * Copyright: MIT
 */
public class StartMenu implements IPrint{
    //Select client or staff->write pin number->start menu.
    int input=0;

    public StartMenu() {
        toPrint(Messages.WELCOME.text);

        input=UserAnswer.userIntInput();
        switch (input) {

            case 1:
                clientMenu();
                break;
            //  case 2 -> staffMenu();
        }
    }
    public void clientMenu (){
        toPrint(Messages.CREDENTIAL.text);
        String name=UserAnswer.userStringInput();

      BankClient bankClient= Tools.findClient(SimDataBase.getBankClientList(),name);
      MenuClient mc=new MenuClient();
      mc.menuStart(bankClient);
    }
    public void staffMenu(){

    }

    @Override
    public void toPrint(String string) {
        System.out.println(string);
    }
}
