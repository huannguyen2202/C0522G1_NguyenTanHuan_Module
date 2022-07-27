package case_study.controller;

import case_study.service.IFacilityService;
import case_study.service.impl.FacilityService;

import java.util.Scanner;

public class FacilityManagement {
    Scanner scanner = new Scanner(System.in);
    IFacilityService iFacilityService=new FacilityService();

    public void menuFacility() {
        do {
            System.out.println("QUẢN LÝ CƠ SỞ: "+
                    "1. Hiển thị cơ sở \n" +
                    "2. Thêm mới cơ sở \n" +
                    "3. Hiển thị danh sách bảo trì cơ sở \n" +
                    "4. Quay về menu chính");

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
                    System.out.println("Nhập lại lựa chọn!");

            }

        } while (true);
    }
}
