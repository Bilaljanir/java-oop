package jt.oopnext.users;

public class Address {

    private int npa;

    private int street;

    private int Number;

    private int city;

    public Address(int npa, int street, int number, int city) {
        this.npa = npa;
        this.street = street;
        this.Number = number;
        this.city = city;
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
