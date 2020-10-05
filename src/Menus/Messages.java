package Menus;

/**
 * Created by Hodei Eceiza
 * Date: 10/5/2020
 * Time: 11:23
 * Project: Bankomaten
 * Copyright: MIT
 */
public enum Messages {
    WELCOME("Welcome! Select your status-> [1]Client or [2]Employee"),
    CLIENT_MENU("Select between:\n1.-Make a deposit\n2.-Do a withdrawal\n3.-Show accounts and loans\n4.-Show history"),
    DEPOSIT("Select the account to deposit"),
    WITHDRAWAL("Select the account for withdrawal"),
    CREDENTIAL("Write your credential (your name)"),
    AMOUNT("Type in the amount"),
    ASK_FOR("Do you want to do an operation?[y/n]");
    protected String text;
     Messages(String string){
        this.text=string;
    }
}
