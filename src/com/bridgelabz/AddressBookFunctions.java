package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookFunctions implements Interface{
    AddressBookFunctions(){

    }
    Scanner scn = new Scanner(System.in);
    public static ArrayList<Person> database = new ArrayList<Person>();

    @Override
    public void createContact() {

        Person P = new Person();

        System.out.println("enter first name");
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


    @Override
    public void edit(String name) {
        for(int i=0; i< database.size();i++)
        {
            if(database.get(i).first_name == name)
            {
                System.out.println("Current details are:");
                System.out.println("first name=" +database.get(i).first_name);
                System.out.println("last name =" +database.get(i).last_name);
                System.out.println("address=" +database.get(i).address);
                System.out.println("city =" +database.get(i).city);
                System.out.println("state=" +database.get(i).state);
                System.out.println("contact number=" +database.get(i).contact_number);
                System.out.println("zip=" +database.get(i).zip);

                System.out.println("enter first name");
                database.get(i).first_name = scn.next();
                System.out.println("enter last name");
                database.get(i).last_name = scn.next();
                System.out.println("enter address");
                database.get(i).address= scn.next();
                System.out.println("enter city");
                database.get(i).city = scn.next();
                System.out.println("enter state");
                database.get(i).state = scn.next();
                System.out.println("enter contact number");
                database.get(i).contact_number = scn.next();
                System.out.println("enter zip");
                database.get(i).zip = scn.next();

                System.out.println("updated details are:");
                System.out.println("first name=" +database.get(i).first_name);
                System.out.println("last name =" +database.get(i).last_name);
                System.out.println("address=" +database.get(i).address);
                System.out.println("city =" +database.get(i).city);
                System.out.println("state=" +database.get(i).state);
                System.out.println("contact number=" +database.get(i).contact_number);
                System.out.println("zip=" +database.get(i).zip);



            }
        }

    }
}
