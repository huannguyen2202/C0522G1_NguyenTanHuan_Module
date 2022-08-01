package case_study.model;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String id, String serviceName, double usableArea,
                 double rentalCosts, int maximumNumberOfPeople,
                 String rentalType, String roomStandard,
                 int numberOfFloors) {
        super(id, serviceName, usableArea, rentalCosts,
                maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                this.getId(),
                this.getServiceName(),
                this.getUsableArea(),
                this.getRentalCosts(),
                this.getMaximumNumberOfPeople(),
                this.getRentalType(),
                this.getRoomStandard(),
                this.getNumberOfFloors());
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Tiêu chuẩn phòng: "+getRoomStandard()+
                ", Số tầng: "+ getNumberOfFloors();
    }
}
