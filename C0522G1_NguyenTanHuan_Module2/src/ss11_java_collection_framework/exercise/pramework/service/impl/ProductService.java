package ss11_java_collection_framework.exercise.pramework.service.impl;

import ss11_java_collection_framework.exercise.pramework.model.Product;
import ss11_java_collection_framework.exercise.pramework.service.IProductService;

import java.util.*;

public class ProductService implements IProductService {
    private static List<Product> productList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);
    static {
        Product product1 = new Product(1, "Bột giặt", "Nặng 0.5kg, Hãng OMO", 20000);
        Product product2 = new Product(2, "Kem đánh răng", "Hình trụ dài, Hãng Ps", 12000);
        Product product3 = new Product(3, "Nước rửa chén", "Màu vàng, Hãng sunlight", 30000);
        Product product4 = new Product(4, "Dầu gội", "Màu xanh, Hãng Clear", 2000);
        Product product5 = new Product(5, "Dầu ăn", "Hãng ông già", 50000);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
    }

    @Override
    public void addProduct() {
        Product product = infoProduct();
        productList.add(product);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void displayAllProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void removeProduct() {
        System.out.println("Mời bạn nhập vào id cần xoá: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Product product : productList) {
            if (product.getProductCode() == idRemove) {
                System.out.println("Bạn có muốn xoá hay không? \n" +
                        "1. Có!\n" +
                        "2. không!\n");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    productList.remove(product);
                    System.out.println("Xoá thành công! ");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void searchProduct() {
        System.out.println("Mời bạn nhập tên sản phẩm cần tìm: ");
        String searchName = scanner.nextLine();
        for (Product product : productList) {
            if (searchName.equals(product.getProductName())) {
                System.out.println(product);
            }
        }

    }

    @Override
    public void recoverProduct() {
        System.out.println("Mời bạn nhập mã sản phẩm cần sửa");
        String idRecover = scanner.nextLine();
        boolean isFlag = false;
        for (int i = 0; i < productList.size(); i++) {
            if (idRecover.equals(productList.get(i).getProductCode())) {
                System.out.println("Bạn có chắc muốn sửa thông tin sản phẩm này \n" +
                        " 1. Có \n" +
                        " 2. Không ");
                int yesNo = Integer.parseInt(scanner.nextLine());
                if (yesNo == 1) {
                    productList.set(i, infoProduct());
                    System.out.println("Đã cập nhật sản phẩm");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy mã sản phẩm bạn nhập");
        }

    }

    @Override
    public void sortProduct() {
        System.out.println("Bạn muốn sắp xếp theo thứ tự! \n" +
                "1. Tăng dần. \n" +
                "2. Giảm dần . \n");
        int choose = Integer.parseInt(scanner.nextLine());
        if (choose == 1) {
            ComperatorAscending comperatorAscending = new ComperatorAscending();
            productList.sort(comperatorAscending);
        } else {
            ComperatorDecrease comperatorDecrease = new ComperatorDecrease();
            productList.sort(comperatorDecrease);
        }
    }

    public static Product infoProduct() {
        System.out.print("Nhập mã sản phẩm: ");
        int productCode = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập name: ");
        String productName = scanner.nextLine();
        System.out.print("Nhập thông tin sản phẩm: ");
        String productInformation = scanner.nextLine();
        System.out.print("Nhập giá của sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(productCode, productName, productInformation, price);
        return product;
    }
}
