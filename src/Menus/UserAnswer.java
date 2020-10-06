package Menus;

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
    public static int userIntInput(){
        Scanner input=new Scanner(System.in);
        return input.nextInt();
    }

    public static double userDoubleInput(){
        Scanner input=new Scanner(System.in);
        return input.nextDouble();
    }
    public static String userStringInput(){
        Scanner input=new Scanner(System.in);
        return input.next();
    }
}
