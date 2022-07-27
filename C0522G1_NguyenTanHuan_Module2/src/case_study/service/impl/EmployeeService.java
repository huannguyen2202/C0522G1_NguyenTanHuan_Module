package case_study.service.impl;

import case_study.exception.DuplicateIDException;
import case_study.model.EmployeeInformation;
import case_study.service.IEmployeeService;
import case_study.utils.ReadWriteEmployeeFile;
import home_work.model.Student;
import home_work.util.ReadFileUtil;
import home_work.util.Regex;
import home_work.util.WriteFileUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<EmployeeInformation> employeeInformationList = new ArrayList<>();
    private static final String PATH = "src/case_study/data/emloyee.csv";

    @Override
    public void edit() {

    }

    @Override
    public void add() {
        List<EmployeeInformation> addEmployeeInformation = new ArrayList<>();
        EmployeeInformation employeeInformation = null;
        employeeInformation = infoEmployeeInformation();
        addEmployeeInformation.add(employeeInformation);
        System.out.println("Thêm mới thành công!. ");
        ReadWriteEmployeeFile.writeEmployeeInformationFile(PATH, addEmployeeInformation);
        employeeInformationList.add(employeeInformation);
        addEmployeeInformation.remove(0);
    }

    @Override
    public void display() {
        employeeInformationList = ReadWriteEmployeeFile.readEmployeeInformationFile(PATH);
        for (EmployeeInformation employeeInformation : employeeInformationList) {
            System.out.println(employeeInformation);
        }

    }

    public static EmployeeInformation infoEmployeeInformation() {
        int id = 0;
        while (true) {
            try {
                System.out.print("Nhập id: ");
                id = Integer.parseInt(scanner.nextLine());
                for (EmployeeInformation employeeInformation : employeeInformationList) {
                    if (employeeInformation.getiD() == id) {
                        throw new DuplicateIDException("ID đã có, vui lòng nhập lại");
                    }
                }
                break;
            } catch (NumberFormatException | DuplicateIDException e) {
                System.out.print("Bạn có chắc mình nhập đúng,hãy nhập lại");
            }
        }
        System.out.print("Nhập name: ");
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
                for (EmployeeInformation employeeInformation : employeeInformationList) {
                    if (employeeInformation.getiDNumber() == idNumber) {
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
                for (EmployeeInformation employeeInformation : employeeInformationList) {
                    if (employeeInformation.getPhoneNumber() == phoneNumber) {
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
        System.out.print("Nhập vào level: ");
        String level = scanner.nextLine();
        System.out.print("Nhập vào địa điểm: ");
        String location = scanner.nextLine();
        double salary = 0;
        try {
            System.out.print("Nhập vào tiền lương: ");
            salary = Double.valueOf(scanner.nextLine());

        } catch (NumberFormatException e) {
            System.out.println("Vui lòng kiểm tra và nhập lại!");
        }
        return new EmployeeInformation(id, name, dayOfBirth, gender, idNumber, phoneNumber, email, level, location, salary);
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
