package bai_lam_them.bank.controller;

import bai_lam_them.bank.service.ISavingBankAccountService;
import bai_lam_them.bank.service.impl.SavingBankAccountService;

import java.util.Scanner;

public class SavingBankAccountController {
    Scanner scanner=new Scanner(System.in);
    ISavingBankAccountService iSavingBankAccountService =new SavingBankAccountService();
    public void menuSaving() {
        do {
            System.out.println("QUẢN LÝ TÀI KHOẢN TIẾT KIỆM\n" +
                    "1. Thêm mới \n" +
                    "2. Xoá \n" +
                    "3. Xem danh sách các tài khoản ngân hàng\n" +
                    "4. Tìm kiếm  \n" +
                    "5. Thoát \n");
            int choose=0;
            try {
                System.out.print("Mời bạn nhập vào lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.print("Vui lòng nhập số: ");
            }

            switch (choose) {
                case 1:
                    iSavingBankAccountService.add();
                    break;
                case 2:
                    iSavingBankAccountService.remove();
                    break;
                case 3:
                    iSavingBankAccountService.display();
                    break;
                case 4:
                    iSavingBankAccountService.find();
                    break;
                case 5:
                    return;
                default:
                    System.out.print("Lựa chọn của bạn không có, vui lòng chọn lại: ");
            }

        } while (true);
    }
}
