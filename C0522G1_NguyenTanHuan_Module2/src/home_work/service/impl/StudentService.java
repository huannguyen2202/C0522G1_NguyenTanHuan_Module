package home_work.service.impl;

import home_work.model.Student;
import home_work.service.IStudentService;

import java.util.*;

public class StudentService implements IStudentService {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    static {

        Student student1 = new Student(1, "Nguyễn Tất Thành", "24-02-2000", "Nam", "C052G1", 10);
        Student student2 = new Student(2, "Nguyễn Tấn Huân", "26-09-2000", "Nam", "C052G1", 7);
        Student student3 = new Student(3, "Bùi Hùng", "28-12-2000", "Nam", "C052G1", 6);
        Student student4 = new Student(4, "Lê Đại Lợi", "30-08-2000", "Nam", "C052G1", 8);
        Student student5 = new Student(5, "Huỳnh Trung Thuyên", "01-12-2000", "Nam", "C052G1", 9);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
    }

    @Override
    public void addStudent() {
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công!. ");

    }

    @Override
    public void displayAllStudent() {
        for (Student student : studentList) {
            System.out.println(student);
        }

    }

    @Override
    public void removeStudent() {
        System.out.println("Mời bạn nhập id cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Student student : studentList) {
            if (student.getId() == idRemove) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    studentList.remove(student);
                    System.out.println("Xóa thành công!.");
                }
                isFlag = true;
                break;

            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void searchStudent() {
        System.out.println("Bạn muốn tìm kiếm theo tên hay id! \n" +
                "1. Tìm kiếm theo id. \n" +
                "2. Tìm kiếm theo tên. \n");
        int choose = Integer.parseInt(scanner.nextLine());
        if (choose == 1) {
            System.out.println("Mời bạn nhập id sinh viên cần tìm: ");
            int searchId = Integer.parseInt(scanner.nextLine());
            for (Student student : studentList) {
                if (searchId == student.getId()) {
                    System.out.println(student);
                }
            }

        } else {
            System.out.println("Mời bạn nhập tên sinh viên cần tìm: ");
            String searchName = scanner.nextLine();
            for (Student student: studentList){
                if (student.getName().toLowerCase().contains(searchName.toLowerCase())){
                    System.out.println(student);
                }
            }
        }

    }

    @Override
    public void sortByName() {
        boolean needNextPass = true;
        for (int i = 0; i < studentList.size()-1 && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < studentList.size() - 1-i; j++) {
                if (studentList.get(j).getName().compareTo(studentList.get(j+1).getName())>0){
                    Collections.swap(studentList,j,j+1);
                    needNextPass=true;
                }


            }

        }


    }

    public static Student infoStudent() {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập name: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.print("Nhập tên lớp: ");
        String nameClass = scanner.nextLine();
        System.out.print("Nhập điểm: ");
        double point = Double.parseDouble(scanner.nextLine());
        Student student = new Student(id, name, dateOfBirth, gender, nameClass, point);
        return student;
    }
}
