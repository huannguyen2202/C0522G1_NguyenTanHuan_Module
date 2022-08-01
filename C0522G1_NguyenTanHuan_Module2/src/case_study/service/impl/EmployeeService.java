package case_study.service.impl;

import case_study.exception.DuplicateIDException;
import case_study.model.Employee;
import case_study.service.IEmployeeService;
import case_study.utils.ReadWriterEmployeeFile;
import home_work.util.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();
    private static final String PATH = "src/case_study/data/emloyee.csv";

    @Override
    public void edit() {
        System.out.println("Mời bạn nhập id cần chỉnh sửa: ");
        int editId=0;
        employeeList = ReadWriterEmployeeFile.readEmployeeInformationFile(PATH);
        while (true){
            try {
                editId = Integer.parseInt(scanner.nextLine());
                for (Employee employee : employeeList) {
                    if (editId == employee.getiD()) {
                        do {

                            System.out.println("SỬA THÔNG TIN:\n "+
                                    "1. Sửa lại tên.\n"+
                                    "2. Sửa lại ngày sinh.\n"+
                                    "3. Sửa lại giới tính.\n"+
                                    "4. Sửa lại số CMND.\n"+
                                    "5. Sửa lại số điện thoại.\n"+
                                    "6. Sửa lại email.\n"+
                                    "7. Sửa lại trình độ.\n"+
                                    "8. Sửa lại vị trí.\n"+
                                    "9. Sửa lại tiền lương.\n"+
                                    "10. Quay về menu.\n");
                            int choose = 0;
                            try {
                                System.out.print("Nhập vào lựa chọn của bạn: ");
                                choose= Integer.parseInt(scanner.nextLine());
                            } catch (NumberFormatException e){
                                System.out.print("Vui lòng nhập lại số: ");
                            }
                            switch (choose){
                                case 1:
                                    System.out.print("Nhập vào tên: ");
                                    String name= scanner.nextLine();
                                    employee.setName(name);
                                    ReadWriterEmployeeFile.writerEmployeeInformationFile(PATH,employeeList);
                                    break;
                                case 2:
                                    System.out.print("Nhập vào ngày sinh: ");
                                    String dateOfBirth=scanner.nextLine();
                                    employee.setDateOfBirth(dateOfBirth);
                                    ReadWriterEmployeeFile.writerEmployeeInformationFile(PATH,employeeList);
                                    break;
                                case 3:
                                    System.out.print("Nhập vào giới tính: ");
                                    String gender = scanner.nextLine();
                                    employee.setGender(gender);
                                    ReadWriterEmployeeFile.writerEmployeeInformationFile(PATH,employeeList);
                                    break;
                                case 4:
                                    System.out.print("Nhập lại số CMND: ");
                                    int idNumber = Integer.parseInt(scanner.nextLine());
                                    employee.setiDNumber(idNumber);
                                    ReadWriterEmployeeFile.writerEmployeeInformationFile(PATH,employeeList);
                                    break;
                                case 5:
                                    System.out.print("Nhập lại số điẹn thoại: ");
                                    int phoneNumber= Integer.parseInt(scanner.nextLine());
                                    employee.setPhoneNumber(phoneNumber);
                                    ReadWriterEmployeeFile.writerEmployeeInformationFile(PATH,employeeList);
                                    break;
                                case 6:
                                    System.out.print("Nhập lại email: ");
                                    String email = scanner.nextLine();
                                    employee.setEmail(email);
                                    ReadWriterEmployeeFile.writerEmployeeInformationFile(PATH,employeeList);
                                    break;
                                case 7:
                                    System.out.print("Nhập lại trình độ: ");
                                    String level = scanner.nextLine();
                                    employee.setLevel(level);
                                    ReadWriterEmployeeFile.writerEmployeeInformationFile(PATH,employeeList);
                                    break;
                                case 8:
                                    System.out.print("Nhập lại vị trí: ");
                                    String location = scanner.nextLine();
                                    employee.setLocation(location);
                                    ReadWriterEmployeeFile.writerEmployeeInformationFile(PATH,employeeList);
                                    break;
                                case 9:
                                    System.out.print("Nhập lại tiền lương: ");
                                    double salary = Double.parseDouble(scanner.nextLine());
                                    employee.setSalary(salary);
                                    ReadWriterEmployeeFile.writerEmployeeInformationFile(PATH,employeeList);
                                    break;
                                case 10:
                                    return;
                            }

                        }while (true);
                    }
                }
                break;
            } catch (NumberFormatException e){
                System.out.println("Hãy nhập lại số!");
            }
        }
    }

    @Override
    public void add() {
        List<Employee> addEmployee = ReadWriterEmployeeFile.readEmployeeInformationFile(PATH);
        addEmployee.add(infoEmployeeInformation());
        System.out.println("Thêm mới thành công!. ");
        ReadWriterEmployeeFile.writerEmployeeInformationFile(PATH, addEmployee);
    }

    @Override
    public void display() {
        employeeList = ReadWriterEmployeeFile.readEmployeeInformationFile(PATH);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

    }

    public static Employee infoEmployeeInformation() {
        int id = 0;
        while (true) {
            try {
                System.out.print("Nhập id: ");
                id = Integer.parseInt(scanner.nextLine());
                for (Employee employee : employeeList) {
                    if (employee.getiD() == id) {
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
                for (Employee employee : employeeList) {
                    if (employee.getiDNumber() == idNumber) {
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
                for (Employee employee : employeeList) {
                    if (employee.getPhoneNumber() == phoneNumber) {
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
        String level=getLevel();
        String location=getLocation();
        double salary= getSalary();
        return new Employee(id, name, dayOfBirth, gender, idNumber, phoneNumber, email, level, location, salary);
    }
    public static String getLocation(){
        System.out.println("Nhập vào vị trí nhân viên: \n"+
                "1. Lễ tân.\n"+
                "2. Phục vụ.\n"+
                "3. Chuyên viên.\n"+
                "4. Giám sát.\n"+
                "5. Quản lý.\n"+
                "6. Giám đốc.\n");
        int choose =0;
        do {
            try{
                choose= Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.print("Vui lòng nhập số: ");
            }
            switch (choose){
                case 1:
                    return "Lễ tân";
                case 2:
                    return "Phục vụ";
                case 3:
                    return "Chuyên viên";
                case 4:
                    return "Giám sát";
                case 5:
                    return "Quản lý";
                case 6:
                    return "Giám đốc";
                default:
                    System.out.println("Lựa chọn của bạn không tồn tại, vui lòng chọn lại!");
            }
        }while (true);
    }
    public static String getLevel(){
        System.out.print("Nhập trình độ nhân viên:\n" +
                "1. Trung cấp.\n" +
                "2. Cao đẳng.\n" +
                "3. Đại Học.\n" +
                "4. Sau đại học.");
        int choose = 0;
        do {
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Vui lòng nhập số: ");
            }
            switch (choose) {
                case 1:
                    return "trung cấp";
                case 2:
                    return "cao đẳng";
                case 3:
                    return "đại học";
                case 4:
                    return "sau đại học";
                default:
                    System.out.println("Lựa chọn của bạn không tồn tại, vui lòng chọn lại!");
            }
        } while (true);
    }
    public static double getSalary(){
        double salary = 0;
        do {

            try {
                System.out.print("Nhập vào tiền lương: ");
                salary = Double.parseDouble(scanner.nextLine());
                break;

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng kiểm tra và nhập lại!");
            }

        } while (true);
        return salary;

    }

    public static String getName(){
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
