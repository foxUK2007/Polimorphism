package autoRacing;

public class Truck extends autoRacing implements competing {

    private static final String CLASS_TRUCK = "Грузовик";

    public enum CarryingTruck {
        N1(null, 3.5),
        N2(3.5, 12.0),
        N3(12.0, null);

        final Double minCarryingTruck;

        final Double maxCarryingTruck;

        CarryingTruck(Double minCarryingTruck, Double maxCarryingTruck) {
            this.minCarryingTruck = minCarryingTruck;
            this.maxCarryingTruck = maxCarryingTruck;
        }

    }

    CarryingTruck carryingTruck;

    public Truck(String brand, String model, String fuelType, double amountFuel, CarryingTruck carryingTruck) {
        super(brand, model, 0);
        this.carryingTruck = carryingTruck;

    }

    public Truck(String brand, String model, CarryingTruck carryingTruck) {
        super(brand, model, 0);
        this.carryingTruck = carryingTruck;

    }

    public void reFuel() {

    }

    @Override
    public void pitStop() {
        System.out.println(CLASS_TRUCK + " марки " + getModel() + " заехал на pit-stop. ");
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
        if (carryingTruck == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(carryingTruck);
        }
    }

    @Override
    public String toString() {
        if (carryingTruck.minCarryingTruck == null) {
            return "Грузовик " +
                    " имеет грузоподъемность до " + carryingTruck.maxCarryingTruck + " тонн.";
        } else if (carryingTruck.maxCarryingTruck == null) {
            return "Грузовик " +
                    " имеет грузоподъемность свыше " + carryingTruck.minCarryingTruck + " тонн.";
        } else {
            return "Грузовик " +
                    " имеет грузоподъемность от " + carryingTruck.minCarryingTruck + " тонн, до " + carryingTruck.maxCarryingTruck + " тонн.";
        }
    }

    public Truck(String brand, String model, String fuelType, double amountFuel, boolean getDiagnosed) {
        super(brand, model, fuelType, amountFuel, getDiagnosed);
    }

    @Override
    public boolean isGetDiagnosed() {
        if (getDiagnosed) {
            System.out.println("Грузовик " + getBrand() + getModel() + " прошел диагностику");
        } else {
            throw new RuntimeException("Необходимо пройти диагностику");
        }
        return getDiagnosed;
    }


}
