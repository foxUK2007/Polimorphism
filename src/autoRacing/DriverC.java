package autoRacing;

public class DriverC <C extends Truck> extends Drivers{

    public DriverC(String name, boolean hasDriversLicense, int drivingExperience) {
        super(name, hasDriversLicense, drivingExperience);
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void stopMoving() {

    }

    @Override
    public void reFuel() {

    }

    public void printDriverC(C truck) {
        System.out.println(
                "Водитель " + getName() +
                        " за рулем автомобиля " + truck.getBrand()+ truck.getModel() +
                        " и будет участвовать в заезде. "
        );
    }
}
