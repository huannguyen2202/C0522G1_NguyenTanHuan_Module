package bai_lam_them.bank.controller;

import java.util.Scanner;

public class MainController {
    public static void menuController() {
        PaymentBankAccountController paymentBankAccountController = new PaymentBankAccountController();
        SavingBankAccountController savingBankAccountController = new SavingBankAccountController();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG. \n" +
                    "1. Quản lý tài khoản thanh toán.\n" +
                    "2. Quản lý tài khoản tiết kiệm \n " +
                    "3. Thoát chương trình");
            int choose = 0;
            try {
                System.out.print("Nhập vào lựa chọn của bạn: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Vui lòng nhập vào số: ");
            }
            switch (choose) {
                case 1:
                    paymentBankAccountController.menuPayment();
                    break;
                case 2:
                    savingBankAccountController.menuSaving();
                    break;
                case 3:
                    System.exit(1);
                default:
                    System.out.print("Lựa chọn của bạn không có, vui lòng chọn lại: ");
            }

        } while (true);

    }
}
