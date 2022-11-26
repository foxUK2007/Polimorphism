package autoRacing;

import autoRacing.Car;
public class DriverB <B extends Car> extends Drivers{
    public DriverB(String name, boolean hasDriversLicense, int drivingExperience) {
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

    public void printDriverB(B car) {
        System.out.println(
                "Водитель " + getName() +
                        " за рулем автомобиля " + car.getBrand()+ car.getModel() +
                        " и будет участвовать в заезде. "
        );
    }


}
