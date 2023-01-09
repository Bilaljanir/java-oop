package jt.oopnext;

import jt.oopnext.users.Address;
import jt.oopnext.users.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // User creation

        User myFirstUser= new User("test@toto.com","12.01.20022","Toto","tutu",new Address()

        );

        System.out.println(myFirstUser);
    }
}

