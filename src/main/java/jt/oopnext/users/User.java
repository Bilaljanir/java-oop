package jt.oopnext.users;

import java.util.Objects;

public class User {

    private String email;

    private String birthDate;

    private String firstName;
    private String lastname;
    private Address address;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        Objects.requireNonNull(firstName);
        if (firstName.length()> 5){
            throw new RuntimeException("Le firstname est trop long");
        }
        this.lastname = lastname;
    }

    public User(String email, String birthDate, String firstName,
                String lastname,
                Address address,
                ){
        this.email=email;
        this.birthDate=birthDate;
        this.setFirstName(firstName);
        this.lastname=lastname;
        this.address=address;


    }

    @Override
    public String toString() {
        return "User{" +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
