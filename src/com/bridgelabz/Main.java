package com.bridgelabz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to address book system");
        Scanner scn = new Scanner(System.in);
        String choice ="Y" ;
        do
        {
        System.out.println("Enter 1 to create contact in address book \nEnter 2 to edit details \nEnter 3 to delete your account from address book");
        int input = scn.nextInt();
        Interface ob = new AddressBookFunctions();
        switch (input){
            case 1:
                ob.createContact();
                break;
            case 2:
                System.out.println("enter first name of person whose details are to be edited");
                ob.edit(scn.next());
                break;
            case 3:
                System.out.println("enter first name of person whose details are to be deleted");
                ob.delete(scn.next());
                break;
            default:
                System.out.println("enter correct option");
        }
            System.out.println("Enter Y to stay on address book and N to exit");
            choice = scn.next();
        }
        while(choice.equals("Y"));

}
}
