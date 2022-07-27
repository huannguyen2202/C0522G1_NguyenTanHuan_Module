package case_study.model;

public class Booking {
    private int bookingId;
    private String startDay;
    private String endDay;
    private int customerID;
    private String serviceName;
    private String serviceType;

    public Booking() {
    }

    public Booking(int bookingId, String startDay,
                   String endDay, int customerID,
                   String serviceName, String serviceType) {
        this.bookingId = bookingId;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerID = customerID;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Đặt chỗ {" +
                "mã đặt chỗ: " + bookingId +
                ", Ngày bắt đầu: " + startDay +
                ", Ngầy kết thúc: " + endDay +
                ", Mã khách hàng: " + customerID +
                ", Tên dịch vụ: " + serviceName +
                ", Loại dịch vụ: " + serviceType +
                '}';
    }
}
