import java.io.Serializable;

/**
 * Created by Hodei Eceiza
 * Date: 9/29/2020
 * Time: 21:24
 * Project: Bankomaten
 * Copyright: MIT
 */
public class BankStaff extends Person implements IPrintable, Serializable {
    private double salary;

    public BankStaff(String name, String surname, String id, String phoneNumber) {
        setId(id);
        setName(name);
        setPhoneNumber(phoneNumber);
        setSurname(surname);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

  public String printable(){
        return getName();
  }
}
