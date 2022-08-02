package bai_lam_them.bank.controller;

import bai_lam_them.bank.service.IPaymentBankAccountService;
import bai_lam_them.bank.service.impl.PaymentBankAccountService;

import java.util.Scanner;

public class PaymentBankAccountController {
    Scanner scanner = new Scanner(System.in);
    IPaymentBankAccountService iPaymentBankAccountService = new PaymentBankAccountService();
    public void menuPayment() {
        do {
            System.out.println("QUẢN LÝ TÀI KHOẢN THANH TOÁN\n" +
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
                    iPaymentBankAccountService.add();
                    break;
                case 2:
                    iPaymentBankAccountService.remove();
                    break;
                case 3:
                    iPaymentBankAccountService.display();
                    break;
                case 4:
                    iPaymentBankAccountService.find();
                    break;
                case 5:
                    return;
                default:
                    System.out.print("Lựa chọn của bạn không có, vui lòng chọn lại: ");
            }

        } while (true);
    }

}
