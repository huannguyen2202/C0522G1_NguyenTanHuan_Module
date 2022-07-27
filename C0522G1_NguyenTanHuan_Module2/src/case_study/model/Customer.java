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
    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s\n",
        this.getiD(),
        this.getName(),
        this.getDateOfBirth(),
        this.getGender(),
        this.getiDNumber(),
        this.getPhoneNumber(),
        this.getEmail(),
        this.getTypeOfGuest(),
        this.getAddress());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
