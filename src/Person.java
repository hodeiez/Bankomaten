import java.io.Serializable;

/**
 * Created by Hodei Eceiza
 * Date: 9/29/2020
 * Time: 21:23
 * Project: Bankomaten
 * Copyright: MIT
 */
public class Person implements Serializable {
    private String name,surname,id,phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Person(){}
    public Person(String name, String surname, String id, String phoneNumber){
        this.name=name;
        this.surname=surname;
        this.id=id;
        this.phoneNumber=phoneNumber;
    }
}
