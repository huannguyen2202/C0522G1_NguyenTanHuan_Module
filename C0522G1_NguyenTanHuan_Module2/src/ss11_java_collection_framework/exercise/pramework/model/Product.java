package ss11_java_collection_framework.exercise.pramework.model;

public class Product {
    private int productCode;
    private String productName;
    private String productInformation;
    private int price;

    public Product(int productCode, String productName, String productInformation, int price) {
        this.productCode = productCode;
        this.productName = productName;
        this.productInformation = productInformation;
        this.price = price;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductInformation() {
        return productInformation;
    }

    public void setProductInformation(String productInformation) {
        this.productInformation = productInformation;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sản phẩm= { "+" productCode: "+productCode+" ,productName: "+productName+" ,productInformation"+productInformation+" ,price"+price+"}";
//                "Product{" +
//                "productCode=" + productCode +
//                ", productName='" + productName + '\'' +
//                ", productInformation='" + productInformation + '\'' +
//                ", price=" + price +
//                '}';
    }
}
