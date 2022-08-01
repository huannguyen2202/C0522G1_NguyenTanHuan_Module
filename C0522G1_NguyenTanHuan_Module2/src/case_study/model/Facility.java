package case_study.model;

public abstract class Facility {
    private String id;
    private String serviceName;
    private double usableArea;
    private double rentalCosts;
    private int maximumNumberOfPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String id, String serviceName, double usableArea, double rentalCosts, int maximumNumberOfPeople, String rentalType) {
        this.id = id;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return  "Mã dịch vụ: "+getId()+
                ", Tên dịch vụ: "+ getServiceName()+
                ", Diện tích sử dụng(m2): "+getUsableArea()+
                ", Chi phí thuê: "+getRentalCosts()+
                ", Số người tối đa: "+getMaximumNumberOfPeople()+
                ", Kiểu thuê: "+getRentalType();
    }

    public abstract String getInfo();
}
