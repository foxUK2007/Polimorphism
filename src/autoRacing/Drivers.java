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
      return isHasDriversLicense();
    }

    public void setHasDriversLicense(boolean hasDriversLicense) {
        if (hasDriversLicense == true){
            this.hasDriversLicense = true;
        }else {
            throw new RuntimeException("Необходимо указать категорию прав");
        }
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


