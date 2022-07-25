package case_study.controller;

import java.util.Scanner;

public class BookingManagerment {
    Scanner scanner = new Scanner(System.in);
//    private IStudentService iStudentService = new StudentService();

    public void menuBooking() {
        do {
            System.out.println("1. Add new booking \n" +
                    "2. Display list booking \n" +
                    "3. Create new constracts \n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu.");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 6:
                    return;


            }

        } while (true);
    }
}
