package autoRacing;

public class Truck extends autoRacing implements competing {

    public Truck(String brand, String model) {
        super(brand, model, "дизель", 13.0);
    }

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void reFuel() {

    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик марки " + getModel() + " заехал на pit-stop. ");
    }

    @Override
    public void bestTimeLap() {
        System.out.println("Лучшее время " +  getBrand() +  getModel() + " " +
                (int) (60 * Math.random()) +  " мин. " +  (int) (60 * Math.random()) + " сек. ") ;

    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " +  getBrand() +  getModel() + " " +
                (int) (200 * Math.random()) +  " км/ч. ") ;
    }

    public void startMoving() {
        System.out.println("Стартую!");

    }

    public void stopMoving() {
        System.out.println("Финиширую!");
    }

}
