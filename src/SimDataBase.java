import java.util.List;

/**
 * Created by Hodei Eceiza
 * Date: 10/1/2020
 * Time: 11:26
 * Project: Bankomaten
 * Copyright: MIT
 */
public class SimDataBase {
    //here the objects will be made.
    List<BankClient> bankClientList;
    List<BankStaff> bankStaffList;
    BankClient bankClient;
    BankStaff bankStaff;
    BankStaff bankStaff2;
    BankAccount bankAccount;
    BankLoan bankLoan;
//TODO: put in lists. make possible to add new clients and staff to list.
    public BankClient getBankClient() {
        return bankClient;
    }

    public void setBankClient(BankClient bankClient) {
        this.bankClient = bankClient;
    }

    public void setBankStaff(BankStaff bankStaff) {
        this.bankStaff = bankStaff;
    }

    public BankStaff getBankStaff2() {
        return bankStaff2;
    }

    public void setBankStaff2(BankStaff bankStaff2) {
        this.bankStaff2 = bankStaff2;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public BankLoan getBankLoan() {
        return bankLoan;
    }

    public void setBankLoan(BankLoan bankLoan) {
        this.bankLoan = bankLoan;
    }

    public BankStaff getBankStaff() {
        return bankStaff;
    }

    public SimDataBase() {
        setBankClient(new BankClient("hodei", "ez", "199283213-134", "796535432"));
        setBankStaff(new BankStaff("hur", "ez", "9762314", "998832141"));
        setBankStaff2(new BankStaff("practicant", "ezdsa", "fds62314", "fda8832141"));
        setBankLoan(new BankLoan(0.35, 199990, getBankStaff()));
       setBankAccount(new BankAccount(0.23, 432432432));
    }


}
