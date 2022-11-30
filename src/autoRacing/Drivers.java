package autoRacing;

public abstract class Drivers {
    private String name;
    private boolean hasDriversLicense;
    private int drivingExperience;

    public Drivers(String name, boolean hasDriversLicense, int drivingExperience) {
        this.name = name;
        this.hasDriversLicense = hasDriversLicense;
        this.drivingExperience = drivingExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDriversLicense() {
        return hasDriversLicense;
    }

    public void setHasDriversLicense(boolean hasDriversLicense) {
        this.hasDriversLicense = hasDriversLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public abstract void startMoving();


    public abstract void stopMoving();


    public abstract void reFuel() ;

}


