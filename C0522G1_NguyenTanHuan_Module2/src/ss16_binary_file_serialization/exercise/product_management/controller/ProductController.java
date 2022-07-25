package ss16_binary_file_serialization.exercise.product_management.controller;

import home_work.controller.StudentController;
import home_work.controller.TeacherController;
import ss16_binary_file_serialization.exercise.product_management.service.IProducService;
import ss16_binary_file_serialization.exercise.product_management.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void menuController() {
        ProductService productService=new ProductService();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Chương trình quản lí sản phẩm. \n" +
                    "1. Thêm sản phẩm.\n" +
                    "2. Hiển thị sản phẩm \n " +
                    "3. Tìm kiếm thông tin sản phẩm\n"+
                    "4. Thoát chương trình");
            int choose=0;
            try {
                System.out.println("Nhập vào lựa chọn của ban! ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Vui lòng nhập vào số!");

            }
            switch (choose) {
                case 1:
                    productService.add();
                    break;

                case 2:
                    productService.displayAll();
                    break;
                case 3:
                    productService.searchProduct();

                    break;
                case 4:

                    System.exit(1);


            }

        } while (true);

    }

}
