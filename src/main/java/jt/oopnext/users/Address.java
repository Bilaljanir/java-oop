package jt.oopnext.users;

import java.net.spi.InetAddressResolver;

public class Address {

    private int npa;

    private String street;

    private int Number;


    private String city;

    public Address(int npa, String street, int number, String city) {
        this.npa = npa;
        this.street = street;
        this.Number = number;
        this.city = city;
    }
    public Address(String longAddress){
        setAddressFromString(longAddress);
    }


    // rue de jura 11-1100-Lausanne
    public void setAddressFromString(String address){

       var splitted = address.split("-");
       npa= Integer.parseInt (splitted[2]);
       street =splitted[0];
       Number =Integer.parseInt(splitted[1]);
       city =splitted[3];



    }
    @Override
    public String toString() {
        return "Address{" +
                "npa=" + npa +
                ", street=" + street +
                ", Number=" + Number +
                ", city=" + city +
                '}';
    }
}
