package jt.oopnext.users;

public class User {

    private String email;

    private String birthDate;

    private String firstName;
    private String lastname;
    private Address address;


    public User(String email,String birthDate,String firstName,
                String lastname,
                Address address,
                ){
        this.email=email;
        this.birthDate=birthDate;
        this.firstName=firstName;
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
