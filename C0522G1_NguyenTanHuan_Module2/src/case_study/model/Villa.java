package case_study.model;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String id, String serviceName, double usableArea,
                 double rentalCosts, int maximumNumberOfPeople,
                 String rentalType, String roomStandard,
                 double poolArea, int numberOfFloors) {
        super(id, serviceName, usableArea, rentalCosts,
                maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",
                this.getId(),
                this.getServiceName(),
                this.getUsableArea(),
                this.getRentalCosts(),
                this.getMaximumNumberOfPeople(),
                this.getRentalType(),
                this.getRoomStandard(),
                this.getPoolArea(),
                this.getNumberOfFloors());
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Tiêu chuẩn phòng: " + getRoomStandard() +
                ", Diện tích hồ bơi (m2): " + getPoolArea() +
                ", Số tầng: " + getNumberOfFloors();
    }


}
