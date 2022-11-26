package autoRacing;

public abstract class autoRacing {
    protected final String brand;
    protected final String model;
    protected double engineVolume;
    protected String fuelType;
    protected double amountFuel;


    public autoRacing(String brand, String model, String fuelType, double amountFuel) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.amountFuel = amountFuel;
    }

    public autoRacing(String brand, String model, double engineVolume) {
        if (brand == null) {
            this.brand = "Информация не указана";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "Информация не указана";
        } else {
            this.model = model;
        }
        if (engineVolume == 0) {
            this.engineVolume = 4.5;
        } else {
            this.engineVolume = engineVolume;

        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public abstract void reFuel();

    public abstract void startMoving();
    public abstract void stopMoving();

}



