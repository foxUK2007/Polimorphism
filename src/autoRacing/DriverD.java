package autoRacing;

public class DriverD <D extends Bus> extends Drivers{

    public DriverD(String name, boolean hasDriversLicense, int drivingExperience) {
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

    public void printDriverD(D bus) {
        System.out.println(
                "Водитель " + getName() +
                        " за рулем автомобиля " + bus.getBrand()+ bus.getModel() +
                        " и будет участвовать в заезде. "
        );
    }
}
