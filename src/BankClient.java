import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hodei Eceiza
 * Date: 9/29/2020
 * Time: 21:23
 * Project: Bankomaten
 * Copyright: MIT
 */
public class BankClient extends Person implements IPrintable, Serializable {

    private List<BankLoan> bankLoanList;
    private List<BankAccount> bankAccountList;

    public BankClient(String name,String surname,String id,String phoneNumber){
        setId(id);setName(name);setPhoneNumber(phoneNumber);setSurname(surname);
        this.bankLoanList=new ArrayList<>();
        this.bankAccountList=new ArrayList<>();
    }
    public void addBankLoan(BankLoan bankLoan){
        bankLoanList.add(bankLoan);
    }
    public void addBankAccount(BankAccount bankAccount){
        bankAccountList.add(bankAccount);
    }
    public List<BankAccount> getBankAccountList(){
        return bankAccountList;
    }
    ///STUFF TO PRINT
    public String getLoanListToString(){
        StringBuilder sb=new StringBuilder();
        int i=1;
        for(BankLoan bankLoan:bankLoanList){
            sb.append("["+i++ +"]"+bankLoan.printable());
            sb.append("\n");
        }
        return sb.toString();
    }
    public String getAccountListToString(){
        StringBuilder sb=new StringBuilder();
        int i=1;
        for(BankAccount bankAccount:bankAccountList){
            sb.append("["+i++ +"]" + bankAccount.printable());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String printable(){
        return "Client name:" + getName() + "\n" + getLoanListToString() +
                getAccountListToString();
    }

}
