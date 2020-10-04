/**
 * Created by Hodei Eceiza
 * Date: 10/3/2020
 * Time: 20:32
 * Project: Bankomaten
 * Copyright: MIT
 */
public class MenuClient {
    public static void menuStart(BankClient bankClient){
        int select=1;
        switch (select){
            case 1:
                Tools.deposit(12341,bankClient,0);
                bankClient.printable();
        }
    }
    public MenuClient(){
        //deposit, withdrawal, view accounts and loans, view history.

    }
}
