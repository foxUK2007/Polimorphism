import autoRacing.*;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Audi", "A8 50 L TDI quattro", Car.BodyType.COUPE);
        Car car2 = new Car("BMW", "Z8", Car.BodyType.COUPE);
        Car car3 = new Car("Kia", "Sportage 4-го поколения", Car.BodyType.CROSSOVER);
        Car car4 = new Car("Hyundai", "Avante", Car.BodyType.SEDAN);

        Bus bus1 = new Bus("ПАЗ", "3237", Bus.BusCapacity.SMALL);
        Bus bus2 = new Bus("ЛиАЗ", "6213", Bus.BusCapacity.LARGE_MIN);
        Bus bus3 = new Bus("КАвЗ", "4270", Bus.BusCapacity.MEDIUM_MAX);
        Bus bus4 = new Bus("НЕФАЗ", "5299", Bus.BusCapacity.MEDIUM_MIN);

        Truck truck1 = new Truck("Scania", " G 440 A6x4NA", Truck.CarryingTruck.N2);
        Truck truck2 = new Truck("DAF", " XF 460 4X2", Truck.CarryingTruck.N3 );
        Truck truck3 = new Truck("VOLVO", " FH", Truck.CarryingTruck.N2 );
        Truck truck4 = new Truck("FORD", " F-MAX", Truck.CarryingTruck.N1);

        DriverB<Car> driverB = new DriverB<Car>("Сурков Олег Витальевич", true, 22);

        DriverC<Truck> driverC = new DriverC<Truck>("Соколов Сергей Иванович", true, 12);

        DriverD<Bus> driverD = new DriverD<Bus>("Гусев Богдан Яковлевич", true, 36);

        System.out.println();
        System.out.println(" Автомобили ");
        System.out.println();

        printInfo(car1);
        printInfo(car2);
        printInfo(car3);
        printInfo(car4);
        car1.maxSpeed();


        driverB.printDriverB(car1);
        driverC.printDriverC(truck3);
        driverD.printDriverD(bus2);

        System.out.println();
        System.out.println(" Автобусы ");
        System.out.println();

        printInfo(bus1);
        printInfo(bus2);
        printInfo(bus3);
        printInfo(bus4);
        bus1.pitStop();
        bus1.printType();


        System.out.println();
        System.out.println(" Грузовики ");
        System.out.println();

        printInfo(truck1);
        printInfo(truck2);
        printInfo(truck3);
        printInfo(truck4);
        truck1.bestTimeLap();
    }

    public static void printInfo(Car car) {
        System.out.println(
                "Марка автомобиля: " + car.getBrand() +
                        ". Модель: " + car.getModel() +
                        ". " + car.toString()
        );
        car.startMoving();
        car.stopMoving();
        car.pitStop();

    }

    public static void printInfo(Bus bus) {
        System.out.println(
                "Марка автобуса: " + bus.getBrand() +
                        ". Модель: " + bus.getModel() +
                        ". " + bus.toString()

        );
        bus.startMoving();
        bus.stopMoving();
    }

    public static void printInfo(Truck truck) {
        System.out.println(
                "Марка грузовика: " + truck.getBrand() +
                        ". Модель: " + truck.getModel() +
                        ". " + truck.toString()

        );
        truck.startMoving();
        truck.stopMoving();



    }

}



