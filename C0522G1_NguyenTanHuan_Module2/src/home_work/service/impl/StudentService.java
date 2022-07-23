package home_work.service.impl;

import home_work.exception.DuplicateIDException;
import home_work.model.Student;
import home_work.service.IStudentService;
import home_work.util.ReadFileUtil;
import home_work.util.WriteFileUtil;

import java.io.IOException;
import java.util.*;

public class StudentService implements IStudentService {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "src/home_work/data/student.csv";
//    static {
//
//        Student student1 = new Student(1, "Nguyễn Tất Thành", "24-02-2000", "Nam", "C052G1", 10);
//        Student student2 = new Student(2, "Nguyễn Tấn Huân", "26-09-2000", "Nam", "C052G1", 7);
//        Student student3 = new Student(3, "Bùi Hùng", "28-12-2000", "Nam", "C052G1", 6);
//        Student student4 = new Student(4, "Lê Đại Lợi", "30-08-2000", "Nam", "C052G1", 8);
//        Student student5 = new Student(5, "Huỳnh Trung Thuyên", "01-12-2000", "Nam", "C052G1", 9);
//
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);
//        studentList.add(student4);
//        studentList.add(student5);
//    }


    @Override
    public void addStudent() {
        List<Student> addStudent=new ArrayList<>();
        Student student = infoStudent();
        addStudent.add(student);
//        studentList.add(student);
        System.out.println("Thêm mới thành công!. ");
        try {
            WriteFileUtil.writeStudentFile(PATH,addStudent);
            studentList.add(student);
            addStudent.remove(0);

        } catch (IOException e){
            e.printStackTrace();
        }

    }

    @Override
    public void displayAllStudent() {
        try {
            studentList= ReadFileUtil.readStudentFile(PATH);
        } catch (IOException e){
            e.printStackTrace();
        }
        for (Student student : studentList) {
            System.out.println(student);
        }

    }

    @Override
    public void removeStudent() {
        System.out.println("Mời bạn nhập id cần xóa: ");
        int idRemove=0;
        while (true){
            try {
                idRemove = Integer.parseInt(scanner.nextLine());
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
                            try {
                                WriteFileUtil.writeStudentFileRemove(PATH,studentList);
                            } catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                        isFlag = true;
                        break;

                    }
                }
                if (!isFlag) {
                    System.out.println("Không tìm thấy");
                }
                return;

            } catch (NumberFormatException e){
                System.out.println("Bạn có chắc mình nhập đúng ID");
            }
        }
    }

    @Override
    public void searchStudentById() {
        System.out.println("Mời bạn nhập id sinh viên cần tìm: ");
        int searchId=0;
        while (true){
            try {
                searchId = Integer.parseInt(scanner.nextLine());
                for (Student student : studentList) {
                    if (searchId == student.getId()) {
                        System.out.println(student);
                    }
                }
                break;
            } catch (NumberFormatException e){
                System.out.println("Hãy nhập lại số!");
            }

        }

    }

    @Override
    public void searchStudentByName() {
        System.out.println("Mời bạn nhập tên sinh viên cần tìm: ");
        String searchName;
        searchName = scanner.nextLine();
        boolean flag =false;
        for (Student student: studentList) {
            if (student.getName().toLowerCase().contains(searchName.toLowerCase())) {
                System.out.println(student);
                flag=true;
            }
        }
        if (!flag){
            System.out.println("Không tìm thấy!");
        }

    }

//    @Override
//    public void searchStudent() {
//        System.out.println("Bạn muốn tìm kiếm theo tên hay id! \n" +
//                "1. Tìm kiếm theo id. \n" +
//                "2. Tìm kiếm theo tên. \n");
//        int choose = Integer.parseInt(scanner.nextLine());
//        if (choose == 1) {
//            try {
//
//            }
//            System.out.println("Mời bạn nhập id sinh viên cần tìm: ");
//            int searchId = Integer.parseInt(scanner.nextLine());
//            for (Student student : studentList) {
//                if (searchId == student.getId()) {
//                    System.out.println(student);
//                }
//            }
//
//        } else {
//            System.out.println("Mời bạn nhập tên sinh viên cần tìm: ");
//            String searchName = scanner.nextLine();
//            for (Student student: studentList){
//                if (student.getName().toLowerCase().contains(searchName.toLowerCase())){
//                    System.out.println(student);
//                }
//            }
//        }
//
//    }


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
        int id = 0;
        while (true) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                System.out.println("ID : " + id);
                for (Student student:studentList){
                    if (student.getId()==id){
                        throw new DuplicateIDException("ID đã có,vui lòng nhập lại");
                    }
                }
                break;
            } catch (NumberFormatException e ) {
                System.out.println("Bạn có chắc mình nhập đúng,hãy nhập lại");
            }
            catch (DuplicateIDException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.print("Nhập name: ");
        String name = scanner.nextLine();
        System.out.println("Tên sinh viên: " + name);
        System.out.print("Nhập ngày sinh: ");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Ngày sinh: " + dayOfBirth);
        System.out.println("Nhập vào giới tính");
        String gender = scanner.nextLine();
        System.out.println("Giới tính : " + gender);
        System.out.print("Nhập điểm: ");
        double score = 0.0;
        while (true) {
            try {
                score = Double.parseDouble(scanner.nextLine());
                System.out.println("Điểm: " + score);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn có chắc mình nhập đúng,hãy nhập lại");
            }
        }
        System.out.print("Nhập tên Lớp: ");
        String className = scanner.nextLine();
        System.out.println("Lớp: " + className);
        return new Student(id, name, dayOfBirth, gender, className, score);
    }

//    public static Student infoStudent() {
//        System.out.print("Nhập id: ");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.print("Nhập name: ");
//        String name = scanner.nextLine();
//        System.out.print("Nhập ngày sinh: ");
//        String dateOfBirth = scanner.nextLine();
//        System.out.print("Nhập giới tính: ");
//        String gender = scanner.nextLine();
//        System.out.print("Nhập tên lớp: ");
//        String nameClass = scanner.nextLine();
//        System.out.print("Nhập điểm: ");
//        double point = Double.parseDouble(scanner.nextLine());
//        Student student = new Student(id, name, dateOfBirth, gender, nameClass, point);
//        return student;
//    }
}
