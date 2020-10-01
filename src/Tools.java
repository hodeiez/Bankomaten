import java.util.List;

/**
 * Created by Hodei Eceiza
 * Date: 10/1/2020
 * Time: 11:33
 * Project: Bankomaten
 * Copyright: MIT
 */
public class Tools {
    public void takeOutMoney(double amountOut, BankClient bankClient,int index){
        List<BankAccount> list=bankClient.getBankAccountList();
        list.get(index);

    }
}
