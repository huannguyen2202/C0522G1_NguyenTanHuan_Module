package ss11_java_collection_framework.exercise.pramework.controller;

import ss11_java_collection_framework.exercise.pramework.service.IProductService;
import ss11_java_collection_framework.exercise.pramework.service.impl.ProductService;

import java.util.Scanner;

public class ProducController {
    Scanner scanner = new Scanner(System.in);
    private IProductService iProductService = new ProductService();

    public void menuProduct() {
        do {
            System.out.println("Quản lý sản phẩm \n" +
                    "1. Thêm sản phẩm \n" +
                    "2. Sửa thông tin sản phẩm \n" +
                    "3. Xoá sản phẩm.\n" +
                    "4. Hiển thị danh sách sản phẩm. \n" +
                    "5. Tìm kiếm sản phẩm theo tên. \n" +
                    "6. Sắp xếp tăng dần, giảm dần. \n" +
                    "7. Thoát chương trình");
            System.out.print("Nhập vào lựa chọn của ban: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iProductService.addProduct();
                    break;
                case 2:
                    iProductService.recoverProduct();
                    break;
                case 3:
                    iProductService.removeProduct();
                    break;
                case 4:
                    iProductService.displayAllProduct();
                    break;
                case 5:
                    iProductService.searchProduct();
                    break;
                case 6:
                    iProductService.sortProduct();
                    break;
                case 7:
                    System.exit(1);

            }

        } while (true);
    }


}
