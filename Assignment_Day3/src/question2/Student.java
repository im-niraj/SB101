package question2;

import java.io.Serializable;

public class Student implements Serializable {
    private int roll;
    private Address address;
    private String email;
    private transient String password;

    public Student(int roll, Address address, String email, String password) {
        this.roll = roll;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
