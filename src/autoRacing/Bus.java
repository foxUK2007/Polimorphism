package autoRacing;

public class Bus extends autoRacing implements competing {

    private static final String CLASS_BUS = "Автобус";

    public enum BusCapacity {

        EXTRA_SMALL(10),
        SMALL(25),
        MEDIUM_MIN(40),
        MEDIUM_MAX(50),
        LARGE_MIN(60),
        LARGE_MAX(80),
        ESPECIALLY_LARGE_MIN(100),
        ESPECIALLY_LARGE_MAX(120);

        final int busCapacity;

        BusCapacity(int busCapacity) {
            this.busCapacity = busCapacity;
        }
    }

    BusCapacity busCapacity;


    public Bus(String brand, String model, BusCapacity busCapacity) {
        super(brand, model, "дизель", 4.5);
        this.busCapacity = busCapacity;
    }

    public Bus(String brand, String model, double engineVolume, BusCapacity busCapacity) {
        super(brand, model, 0);
        this.busCapacity = busCapacity;
    }

    public void reFuel() {
        System.out.println("заправиться");
    }


    @Override
    public void pitStop() {
        System.out.println(CLASS_BUS + " марки " + getModel() + " заехал на pit-stop. ");
    }

    @Override
    public void bestTimeLap() {
        System.out.println("Лучшее время " + getBrand() + getModel() + " " +
                (int) (60 * Math.random()) + " мин. " + (int) (60 * Math.random()) + " сек. ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + getBrand() + getModel() + " " +
                (int) (200 * Math.random()) + " км/ч. ");
    }

    public void startMoving() {
        System.out.println("Стартую!");

    }

    public void stopMoving() {
        System.out.println("Финиширую!");
    }

    @Override
    public void printType() {
        if (busCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(busCapacity);
        }

    }

    @Override
    public String toString() {
        return "Вместимость автобуса: " + busCapacity.busCapacity + " человек.";
    }


}


