package mutil;

/**
 * Created by Synycs Solutions on 3/2/2017.
 */
public class Address {
    private String pinCode;
    private String addressLine1;



    public Address(String pinCode, String addressLine1) {
        this.pinCode = pinCode;
        this.addressLine1 = addressLine1;

    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }


    @Override
    public String toString() {
        return "Address{" +
                "pinCode='" + pinCode + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                '}';
    }
}
