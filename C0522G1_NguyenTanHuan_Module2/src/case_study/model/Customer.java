package case_study.model;

public class Customer extends Person {
    private String typeOfGuest;
    private String address;
    public Customer() {
    }

    public Customer(int iD, String name, String dateOfBirth,
                    String gender, int iDNumber, int phoneNumber,
                    String email, String typeOfGuest, String address) {
        super(iD, name, dateOfBirth, gender, iDNumber, phoneNumber, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
