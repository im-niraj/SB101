package question2;

import java.io.Serializable;

public class Address implements Serializable {
    private String state;
    private String city;
    private String pincode;

    public Address(String state, String city, String pincode) {
        this.state = state;
        this.city = city;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
