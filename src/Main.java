import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BankClient p1=new BankClient("hodei","ez","199283213-134","796535432");
        BankStaff p2=new BankStaff("hur","ez","9762314","998832141");
        BankStaff p3=new BankStaff("practicant","ezdsa","fds62314","fda8832141");
        BankLoan l1=new BankLoan(0.35,199990,p2);
        BankAccount a1=new BankAccount(0.23,432432432);

        p1.addBankAccount(a1);
        p1.addBankLoan(l1);

        l1.changeInterestRate(12,p3);
        System.out.println(p1.printable());

        // write your code here
        /*
        Systemet behöver hålla reda på följande
 •Vilka kunder banken har
 •Bankens personal, med personuppgifter och lön
 •Vilka konton och lån varje kund har
 (en kund kan ha flera konton och lån)
 •Räntesats och saldo på varje konto
 •Räntesats och belopp på varje lån
 •Det ska gå att se vilken anställd som har beviljat varje lån
 •Det ska finnas historik över ränteändringar
 och vilken anställd som beviljade ändringen
    */
    }

}
