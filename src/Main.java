import autoRacing.*;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println(" Автомобили ");
        System.out.println();

        Car car1 = new Car("Audi", "A8 50 L TDI quattro", 3.0);
        Car car2 = new Car("BMW", "Z8", 3.0);
        Car car3 = new Car("Kia", "Sportage 4-го поколения", 2.4);
        Car car4 = new Car("Hyundai", "Avante", 1.6);

        Bus bus1 = new Bus("ПАЗ", "3237", 3.9);
        Bus bus2 = new Bus("ЛиАЗ", "6213", 5.9);
        Bus bus3 = new Bus("КАвЗ", "4270", 5.9);
        Bus bus4 = new Bus("НЕФАЗ", "5299", 6.7);

        Truck truck1 = new Truck("Scania", " G 440 A6x4NA", 13.0);
        Truck truck2 = new Truck("DAF", " XF 460 4X2", 12.9);
        Truck truck3 = new Truck("VOLVO", " FH", 12.1);
        Truck truck4 = new Truck("FORD", " F-MAX", 12.7);

        DriverB<Car> driverB = new DriverB<Car>("Сурков Олег Витальевич", true, 22);

        DriverC<Truck> driverC = new DriverC<Truck>("Соколов Сергей Иванович", true, 12);

        DriverD<Bus> driverD = new DriverD<Bus>("Гусев Богдан Яковлевич", true, 36);

        printInfo(car1);
        printInfo(car2);
        printInfo(car3);
        printInfo(car4);
        car1.maxSpeed();

        System.out.println();
        System.out.println(" Автобусы ");
        System.out.println();

        printInfo(bus1);
        printInfo(bus2);
        printInfo(bus3);
        printInfo(bus4);
        bus1.pitStop();


        System.out.println();
        System.out.println(" Грузовики ");
        System.out.println();

        printInfo(truck1);
        printInfo(truck2);
        printInfo(truck3);
        printInfo(truck4);
        truck1.bestTimeLap();

        driverB.printDriverB(car1);
        driverC.printDriverC(truck3);
        driverD.printDriverD(bus2);


    }

    public static void printInfo(Car car) {
        System.out.println(
                "Марка автомобиля: " + car.getBrand() +
                        ". Модель: " + car.getModel() +
                        ". Объем двигателя: " + car.getEngineVolume()
        );
        car.startMoving();
        car.stopMoving();
    }

    public static void printInfo(Bus bus) {
        System.out.println(
                "Марка автобуса: " + bus.getBrand() +
                        ". Модель: " + bus.getModel() +
                        ". Объем двигателя: " + bus.getEngineVolume()

        );
        bus.startMoving();
        bus.stopMoving();
    }

    public static void printInfo(Truck truck) {
        System.out.println(
                "Марка грузовика: " + truck.getBrand() +
                        ". Модель: " + truck.getModel() +
                        ". Объем двигателя: " + truck.getEngineVolume()

        );
        truck.startMoving();
        truck.stopMoving();

    }

}



