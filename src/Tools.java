import java.util.List;

/**
 * Created by Hodei Eceiza
 * Date: 10/1/2020
 * Time: 11:33
 * Project: Bankomaten
 * Copyright: MIT
 */
public class Tools {
    public static double withdrawal(double amountOut, BankClient bankClient, int accountIndex){
        List<BankAccount> list=bankClient.getBankAccountList();
        double balance=list.get(accountIndex).getBalance();
        if(balance-amountOut>=0) {
            list.get(accountIndex).setBalance(balance - amountOut);
            return balance - amountOut;
        }
        else
            return -1;
    }
}
