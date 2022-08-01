package case_study.service.impl;

import case_study.exception.DuplicateIDException;
import case_study.model.Customer;
import case_study.service.ICustomerService;
import case_study.utils.ReadCustomerFileUtil;

import case_study.utils.WriterCustomerFileUtil;
import home_work.util.Regex;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Customer> customerList = new ArrayList<>();
    private static final String PATH = "src/case_study/data/customer.csv";

    @Override
    public void edit() {
        System.out.println("Mời bạn nhập id cần chỉnh sửa: ");
        int editId = 0;
        customerList = ReadCustomerFileUtil.readCustomerFile(PATH);
        while (true) {
            try {
                editId = Integer.parseInt(scanner.nextLine());
                for (Customer customer : customerList) {
                    if (editId == customer.getiD()) {
                        do {
                            System.out.println("SỬA THÔNG TIN: \n" +
                                    "1. Sửa lại tên.\n" +
                                    "2. Sửa lại ngày sinh.\n" +
                                    "3. Sửa lại giới tính.\n" +
                                    "4. Sửa lại số CMND.\n" +
                                    "5. Sửa lại số điện thoại.\n" +
                                    "6. Sửa lại email.\n" +
                                    "7. Sửa lại loại khách.\n" +
                                    "8. Sửa lại địa chỉ.\n" +
                                    "9. Quay về menu.\n");
                            int choose = 0;
                            try {
                                System.out.print("Nhập vào lựa chọn của bạn: ");
                                choose = Integer.parseInt(scanner.nextLine());
                            } catch (NumberFormatException e) {
                                System.out.print("Vui lòng nhập lại số: ");
                            }
                            switch (choose) {
                                case 1:
                                    System.out.print("Nhập vào tên: ");
                                    String name = scanner.nextLine();
                                    customer.setName(name);
                                    WriterCustomerFileUtil.writerCustomerFile(PATH, customerList);
                                    break;
                                case 2:
                                    System.out.print("Nhập vào ngày sinh: ");
                                    String dateOfBirth = scanner.nextLine();
                                    customer.setDateOfBirth(dateOfBirth);
                                    WriterCustomerFileUtil.writerCustomerFile(PATH, customerList);
                                    break;
                                case 3:
                                    System.out.print("Nhập vào giới tính: ");
                                    String gender = scanner.nextLine();
                                    customer.setGender(gender);
                                    WriterCustomerFileUtil.writerCustomerFile(PATH, customerList);
                                    break;
                                case 4:
                                    System.out.print("Nhập lại số CMND: ");
                                    int idNumber = Integer.parseInt(scanner.nextLine());
                                    customer.setiDNumber(idNumber);
                                    WriterCustomerFileUtil.writerCustomerFile(PATH, customerList);
                                    break;
                                case 5:
                                    System.out.print("Nhập lại số điẹn thoại: ");
                                    int phoneNumber = Integer.parseInt(scanner.nextLine());
                                    customer.setPhoneNumber(phoneNumber);
                                    WriterCustomerFileUtil.writerCustomerFile(PATH, customerList);
                                    break;
                                case 6:
                                    System.out.print("Nhập lại email: ");
                                    String email = scanner.nextLine();
                                    customer.setEmail(email);
                                    WriterCustomerFileUtil.writerCustomerFile(PATH, customerList);
                                    break;
                                case 7:
                                    System.out.print("Nhập lại loại khách: ");
                                    String typeOfGuest = scanner.nextLine();
                                    customer.setTypeOfGuest(typeOfGuest);
                                    WriterCustomerFileUtil.writerCustomerFile(PATH, customerList);
                                    break;
                                case 8:
                                    System.out.print("Nhập lại địa chỉ: ");
                                    String address = scanner.nextLine();
                                    customer.setAddress(address);
                                    WriterCustomerFileUtil.writerCustomerFile(PATH, customerList);
                                    break;
                                case 9:
                                    return;
                            }

                        } while (true);
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập lại số!");
            }

        }

    }

    @Override
    public void add()  {
        List<Customer> addCustomer = new ArrayList<>();
        addCustomer = ReadCustomerFileUtil.readCustomerFile(PATH);
        Customer customer = null;
        customer = infoCustomer();
        addCustomer.add(customer);
        System.out.println("Thêm mới thành công! ");
        WriterCustomerFileUtil.writerCustomerFile(PATH, addCustomer);
        customerList.add(customer);
        addCustomer.remove(0);
    }

    @Override
    public void display() {
        customerList = ReadCustomerFileUtil.readCustomerFile(PATH);
        for (Customer customer : customerList) {
            System.out.println(customer);
        }

    }

    public static Customer infoCustomer() {
        int id = 0;
        while (true) {
            try {
                System.out.print("Nhập id: ");
                id = Integer.parseInt(scanner.nextLine());
                for (Customer customer : customerList) {
                    if (customer.getiD() == id) {
                        throw new DuplicateIDException("ID đã có, vui lòng nhập lại");
                    }
                }
                break;
            } catch (NumberFormatException | DuplicateIDException e) {
                System.out.print("Bạn có chắc mình nhập đúng,hãy nhập lại");
            }
        }
        System.out.print("Nhập tên: ");
        String name = getName();
        String dayOfBirth;
        do {
            System.out.print("Nhập ngày sinh: ");
            dayOfBirth = scanner.nextLine();
            if (dayOfBirth.matches(Regex.REGEX)) {
                break;
            } else {
                System.out.print("Nhập sai nhập lại: ");
            }
        } while (true);
        System.out.print("Nhập vào giới tính: ");
        String gender = scanner.nextLine();
        int idNumber = 0;
        while (true) {
            try {
                System.out.print("Nhập idNumber: ");
                idNumber = Integer.parseInt(scanner.nextLine());
                for (Customer customer : customerList) {
                    if (customer.getiDNumber() == idNumber) {
                        throw new DuplicateIDException("id number đã có vui lòng nhập lại: ");
                    }
                }
                break;
            } catch (NumberFormatException | DuplicateIDException e) {
                System.out.print("Bạn có chắc mình nhập đúng,hãy nhập lại: ");
            }

        }
        int phoneNumber = 0;
        while (true) {
            try {
                System.out.print("Nhập số điện thoại: ");
                phoneNumber = Integer.parseInt(scanner.nextLine());
                for (Customer customer : customerList) {
                    if (customer.getPhoneNumber() == phoneNumber) {
                        throw new DuplicateIDException("Số điẹn thoại đã có,vui lòng nhập lại: ");
                    }
                }
                break;
            } catch (NumberFormatException | DuplicateIDException e) {
                System.out.print("Bạn có chắc mình nhập đúng,hãy nhập lại: ");
            }
        }
        System.out.print("Nhập vào email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập vào loại khách: ");
        String typeOfGuest = scanner.nextLine();
        System.out.print("Nhập vào địa chỉ: ");
        String address = scanner.nextLine();
        return new Customer(id, name, dayOfBirth, gender, idNumber, phoneNumber, email, typeOfGuest, address);
    }

    public static String getName() {
        String name = scanner.nextLine();
        String[] arr = name.toLowerCase().trim().split("");
        StringBuilder str = new StringBuilder().append(arr[0].toUpperCase());
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals(" ")) {
                if (arr[i - 1].equals(" ")) {
                    str.append(arr[i].toUpperCase());
                } else {
                    str.append(arr[i]);
                }
            } else if (!arr[i + 1].equals(" ")) {
                str.append(arr[i]);
            }
        }
        return str.toString();
    }
}
