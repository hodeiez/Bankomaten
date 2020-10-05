/**
 * Created by Hodei Eceiza
 * Date: 10/3/2020
 * Time: 20:32
 * Project: Bankomaten
 * Copyright: MIT
 */
public class MenuClient implements IPrint{
    public void menuStart(BankClient bankClient) {
        toPrint(Messages.CLIENT_MENU.text);
        int select = UserAnswer.userIntInput();
        int accountIndex = 0;
        double moneyAmount = 0;
        boolean goOn = true;
        while (goOn) {
            switch (select) {
                case 1://do deposit
                    toPrint(Messages.DEPOSIT.text + "\n" + bankClient.getAccountListToString());
                    accountIndex = UserAnswer.userIntInput();
                    toPrint(Messages.AMOUNT.text);
                    moneyAmount = UserAnswer.userDoubleInput();
                    Tools.deposit(moneyAmount, bankClient, accountIndex);
                    toPrint(Tools.SelectClient(SimDataBase.getBankClientList(), bankClient).printable());
                    break;
                case 2:
                    toPrint(Messages.WITHDRAWAL.text + "\n" + bankClient.getAccountListToString());
                    UserAnswer.userIntInput();
                    toPrint(Messages.AMOUNT.text);
                    moneyAmount = UserAnswer.userDoubleInput();
                    Tools.withdrawal(moneyAmount, bankClient, accountIndex);
                    toPrint(Tools.SelectClient(SimDataBase.getBankClientList(), bankClient).printable());
                    break;
                case 3: //view accounts and loans
                    bankClient.printable();
                    break;
                //ADD history option.
            }
            SimDataBase.saveBankClientsDataToFile();
            toPrint(Messages.ASK_FOR.text);
        }
    }

    public MenuClient(){
        //deposit, withdrawal, view accounts and loans, view history.
    }



    @Override
    public void toPrint(String string){
        System.out.println(string);
    }


}
