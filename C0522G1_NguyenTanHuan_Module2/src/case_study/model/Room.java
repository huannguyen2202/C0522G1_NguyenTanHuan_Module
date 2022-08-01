package case_study.model;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String id, String serviceName,
                double usableArea, double rentalCosts,
                int maximumNumberOfPeople, String rentalType,
                String freeServiceIncluded) {
        super(id, serviceName, usableArea, rentalCosts,
                maximumNumberOfPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }
    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                this.getId(),
                this.getServiceName(),
                this.getUsableArea(),
                this.getRentalCosts(),
                this.getMaximumNumberOfPeople(),
                this.getRentalType(),
                this.getFreeServiceIncluded());
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Dịch vụ miễn phí đi kem: "+getFreeServiceIncluded();

    }
}
