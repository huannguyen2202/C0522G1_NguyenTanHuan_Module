package ss9_dsa_List.exercise.method_of_arrayList.cotroller;

import ss9_dsa_List.exercise.method_of_arrayList.model.Student;
import ss9_dsa_List.exercise.method_of_arrayList.service.IStudentService;
import ss9_dsa_List.exercise.method_of_arrayList.service.impl.StudentService;

import java.util.Scanner;

public class MyListController {
    IStudentService iStudentService = new StudentService<>();

    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println("======== Menu ========");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Xóa");
            System.out.println("4. Thoát");
            System.out.print("Nhập sự lựa chọn của bạn: ");
            choose = Integer.parseInt(sc.nextLine());

            if (choose < 1 || choose > 4) {
                System.out.println("Lựa chọn không hợp lại, vui lòng nhập lại: ");
                continue;
            }
            switch (choose) {
                case 1:
                    iStudentService.findAll();
                    break;
                case 2:
                    System.out.print("Nhập id: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();

                    StudentService.people.add(new Student(id, name));
                    break;
                case 3:
                    iStudentService.findAll();
                    System.out.print("Bạn muốn xóa vị trí nào: ");
                    int index = Integer.parseInt(sc.nextLine());

                    StudentService.people.remove(index);

                    System.out.println("Vị trí " + index + " sau xóa");
                    iStudentService.findAll();
                    break;
                case 4:
                    System.out.println("Bạn đã thoát Menu !");
                    System.exit(0);
            }
        } while (true);
    }
}
