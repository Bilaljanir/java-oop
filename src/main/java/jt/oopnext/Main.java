package jt.oopnext;

import jt.oopnext.users.Address;
import jt.oopnext.users.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // User creation

        User myFirstUser= new User("test@toto.com","12.01.20022","Toto","tutu",new Address(1000,"Rue de jura",11,
                "Lausanne")

        );

        myFirstUser.setFirstName("billla");

        System.out.println(myFirstUser);

    }
}

