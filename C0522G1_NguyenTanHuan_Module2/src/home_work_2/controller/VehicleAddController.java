package home_work_2.controller;

import home_work_2.model.Car;
import home_work_2.model.Motorbike;
import home_work_2.model.Truck;
import home_work_2.service.IVehicleService;
import home_work_2.service.impl.CarService;
import home_work_2.service.impl.MotorbikeService;
import home_work_2.service.impl.TruckService;

import java.util.Scanner;

public class VehicleAddController {
    private final Scanner scanner = new Scanner(System.in);
    private final IVehicleService<Car> car = new CarService();
    private final IVehicleService<Truck> truck = new TruckService();
    private final IVehicleService<Motorbike> motorbike = new MotorbikeService();


    public void menuAddVehicle() {
        do {
            System.out.println("Thêm mới phương tiện: \n" +
                    "1. Thêm xe tải. \n" +
                    "2. Thêm ôtô. \n" +
                    "3. Thêm xe máy. \n" +
                    "4. Quay về menu chính.");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    truck.add();
                    break;
                case 2:
                    car.add();
                    break;
                case 3:
                    motorbike.add();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
