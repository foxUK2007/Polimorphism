package autoRacing;


public class Car extends autoRacing implements competing {

    public Car (String brand, String model) {
        super(brand, model, "бензин", 2.0);
    }

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, 2.0);
    }

        public void reFuel() {
        System.out.println("заправиться ");
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль марки " + getModel() + " заехал на pit-stop. ");
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
    public void stopMoving(){
        System.out.println("Финиширую!");
    }
}