package bai_lam_them.bank.service.impl;

import bai_lam_them.bank.exception.NotFoundBankAccountException;
import bai_lam_them.bank.exception.NumberInvalidException;
import bai_lam_them.bank.model.PaymentBankAccount;
import bai_lam_them.bank.service.IPaymentBankAccountService;
import bai_lam_them.bank.utils.ReadWritePaymentFileUtil;

import java.util.List;
import java.util.Scanner;

public class PaymentBankAccountService implements IPaymentBankAccountService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH_PAYMENT = "src/bai_lam_them/bank/data/payment_account.csv";

    @Override
    public void add() {
        List<PaymentBankAccount> paymentBankAccounts = ReadWritePaymentFileUtil.readPaymentBankAccountFile(PATH_PAYMENT);
//        int id = paymentBankAccounts.get(paymentBankAccounts.size() - 1).getId() + 1;
//        int id = paymentBankAccounts.get(paymentBankAccounts.size() - 1).getId() + 1;
        System.out.print("Nhập vào id: ");
        int id= Integer.parseInt(SCANNER.nextLine());
        System.out.print("Nhập mã tài khoản: ");
        String code = SCANNER.nextLine();

        System.out.print("Nhập tên chủ tài khoản: ");
        String name = SCANNER.nextLine();

        System.out.print("Nhập ngày tạo tài khoản: ");
        String date = SCANNER.nextLine();

        System.out.print("Nhập số tài khoản: ");
        int cardNumber;
        do {
            try {
                cardNumber = Integer.parseInt(SCANNER.nextLine());
                if (cardNumber <= 0) {
                    throw new NumberInvalidException("Vui lòng nhập số dương!");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (NumberInvalidException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        System.out.println("Nhập số tiền trong tài khoản (VNĐ): ");
        int money;
        do {
            try {
                money = Integer.parseInt(SCANNER.nextLine());
                if (money <= 0) {
                    throw new NumberInvalidException("Vui lòng nhập số dương!");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (NumberInvalidException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        paymentBankAccounts.add(new PaymentBankAccount(id, code, name, date, cardNumber, money));
        ReadWritePaymentFileUtil.writerPaymentBankAccountFile(PATH_PAYMENT, paymentBankAccounts);
        System.out.println("Thêm mới thành công!");

    }

    @Override
    public void remove() {
        List<PaymentBankAccount> paymentBankAccounts = ReadWritePaymentFileUtil.readPaymentBankAccountFile(PATH_PAYMENT);
        boolean isExist = false;
        String codeRemove;

        do {
            System.out.println("Mời bạn nhập mã tài khoản cần xóa: ");
            codeRemove = SCANNER.nextLine();
            for (PaymentBankAccount paymentBankAccount : paymentBankAccounts) {
                if (codeRemove.equals(paymentBankAccount.getCode())) {
                    System.out.println("Tài khoản cần xóa: ");
                    System.out.println(paymentBankAccount);
                    System.out.println("Bạn có chắc muốn xóa hay không? \n" +
                            "1. Nhấn phím '1' nếu chọn CÓ. \n" +
                            "2. Nhấn phím khác nếu chọn KHÔNG.");
                    String chooseYesNo = SCANNER.nextLine();

                    if (chooseYesNo.equals("1")) {
                        paymentBankAccounts.remove(paymentBankAccount);
                        ReadWritePaymentFileUtil.writerPaymentBankAccountFile(PATH_PAYMENT, paymentBankAccounts);
                        System.out.println("Xóa thành công!");
                    }
                    isExist = true;
                    break;
                }
            }

            try {
                if (!isExist) {
                    throw new NotFoundBankAccountException("Tài khoản không tồn tại!");
                }
            } catch (NotFoundBankAccountException e) {
                System.out.println(e.getMessage());
            }
        } while (!isExist);
    }

    @Override
    public void display() {
        List<PaymentBankAccount> paymentBankAccounts = ReadWritePaymentFileUtil.readPaymentBankAccountFile(PATH_PAYMENT);
        for (PaymentBankAccount paymentBankAccount : paymentBankAccounts) {
            System.out.println(paymentBankAccount);
        }
    }
    @Override
    public void find() {
        List<PaymentBankAccount> paymentBankAccounts = ReadWritePaymentFileUtil.readPaymentBankAccountFile(PATH_PAYMENT);
        System.out.println("Mời bạn nhập mã tài khoản hoặc tên chủ tài khoản cần tìm kiếm: ");
        String find = SCANNER.nextLine();
        boolean isExist = false;

        for (PaymentBankAccount paymentBankAccount : paymentBankAccounts) {
            if (paymentBankAccount.getCode().contains(find) || paymentBankAccount.getName().toLowerCase().contains(find.toLowerCase())) {
                System.out.println(paymentBankAccount);
                isExist = true;
            }
        }

        if (!isExist) {
            System.out.println("Không tìm thấy!");
        }
    }

}
