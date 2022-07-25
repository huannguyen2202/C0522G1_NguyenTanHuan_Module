package ss16_binary_file_serialization.exercise.product_management.service.impl;

import ss16_binary_file_serialization.exercise.product_management.exception.DuplicateIDException;
import ss16_binary_file_serialization.exercise.product_management.model.Product;
import ss16_binary_file_serialization.exercise.product_management.service.IProducService;
import ss16_binary_file_serialization.exercise.product_management.until.ReadWriteProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProducService {
    private static List<Product> productList=new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "src/ss16_binary_file_serialization/exercise/product_management/data/data.csv";


    @Override
    public void add() {
        List<Product> products = ReadWriteProduct.readProductFile(PATH);
        Product product = infoProduct();
        products.add(product);
        ReadWriteProduct.writeProductFile(PATH, products);

    }




    @Override
    public void displayAll() {
        List<Product> list = ReadWriteProduct.readProductFile(PATH);
        for (Product product : list) {
            System.out.println(product);
        }


    }

    @Override
    public void searchProduct() {
        System.out.println("Nhập vào tên sản phẩm bạn muốn tìm");
        String nameSearch = scanner.nextLine();
        List<Product> list = ReadWriteProduct.readProductFile(PATH);
        for (Product product : list) {
            if (nameSearch.equals(product.getNameProduct())) {
                System.out.println(product);
            }
        }

    }
    public static Product infoProduct() {
        System.out.print("Nhập id: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String nameProduct = scanner.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();
        int price;
        while (true) {
            try {
                System.out.print("Nhập gía sản phẩm: ");
                price = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }
        }
        return new Product(id,nameProduct,manufacturer,price);
    }
}
