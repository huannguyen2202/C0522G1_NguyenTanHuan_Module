package case_study.controller;

import case_study.service.ICustomerService;
import case_study.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerManagement {
    Scanner scanner = new Scanner(System.in);
    ICustomerService iCustomerService =new CustomerService();

    public void menuCustomer() {
        do {
            System.out.println("QUẢN LÝ KHÁCH HÀNG!\n"+
                    "1. Hiển thị danh sách khách hàng \n" +
                    "2. Thêm mới khách hàng \n" +
                    "3. Chỉnh sửa khách hàng \n" +
                    "4. Quay về menu chính\n");
            int choose = 0;
            try {
                System.out.println("Mời bạn nhập lựa chọn!");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số!");
            }

            switch (choose) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    return;
                default:
                    System.out.println("Vui lòng chọn lại!");

            }

        } while (true);
    }

}
