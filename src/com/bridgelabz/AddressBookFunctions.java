package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookFunctions implements Interface{
    AddressBookFunctions(){

    }
    public static ArrayList<Person> database = new ArrayList<Person>();

    @Override
    public void createContact() {

        Person P = new Person();

        System.out.println("enter first name");
        Scanner scn = new Scanner(System.in);
         P.first_name= scn.next();
        System.out.println("enter last name");
        P.last_name = scn.next();
        System.out.println("enter address");
        P.address = scn.next();
        System.out.println("enter city");
        P.city = scn.next();
        System.out.println("enter state");
        P.state = scn.next();
        System.out.println("enter contact number");
        P.contact_number = scn.next();
        System.out.println("enter zip");
        P.zip = scn.next();
        database.add(P);
    }




}
