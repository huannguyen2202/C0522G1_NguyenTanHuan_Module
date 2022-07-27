package case_study.model;

public abstract class Person {
    private int iD;
    private String name;
    private String dateOfBirth;
    private String gender;
    private int iDNumber;
    private int phoneNumber;
    private String email;

    public Person() {
    }

    public Person(int iD, String name, String dateOfBirth,
                  String gender, int iDNumber,
                  int phoneNumber, String email) {
        this.iD = iD;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.iDNumber = iDNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "id=" + iD +
                ", name= " + name +
                ", dateOfBirth= " + dateOfBirth +
                ", gender= " + gender +
                ", iDNumber= " + iDNumber +
                ", phoneNumber= " + phoneNumber +
                ", email= " + email ;
    }
}
