package Menus;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Hodei Eceiza
 * Date: 10/5/2020
 * Time: 10:09
 * Project: Bankomaten
 * Copyright: MIT
 */
public class UserAnswer {
//TODO:HANDLE EXCEPTIONS

    public static int userIntInput() {
        try {
            Scanner input = new Scanner(System.in);
            return input.nextInt();
        }
        catch (InputMismatchException e){
            return -1;
        }
    }

    public static double userDoubleInput(){
       try{
        Scanner input=new Scanner(System.in);
        return input.nextDouble();}
        catch (InputMismatchException e){
            return -1;
        }
    }
    public static String userStringInput(){
       try{
           Scanner input=new Scanner(System.in);
        return input.next();}
        catch (InputMismatchException e){
            return null;
        }
    }
}
