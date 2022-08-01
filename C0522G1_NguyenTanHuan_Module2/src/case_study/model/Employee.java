package case_study.model;

public class Employee extends Person {
    private String level;
    private String location;
    private double salary;

    public Employee() {
    }

    public Employee(int iD, String name, String dateOfBirth,
                    String gender, int iDNumber, int phoneNumber,
                    String email, String level, String location,
                    double salary) {
        super(iD, name, dateOfBirth, gender, iDNumber, phoneNumber, email);
        this.level = level;
        this.location = location;
        this.salary = salary;
    }


    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s\n",
                this.getiD(),
                this.getName(),
                this.getDateOfBirth(),
                this.getGender(),
                this.getiDNumber(),
                this.getPhoneNumber(),
                this.getEmail(),
                this.getLevel(),
                this.getLocation(),
                this.getSalary());
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Level= "+level+
                ", Location= "+location+
                ", Salary= "+salary;
    }
}