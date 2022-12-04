package autoRacing;


public class Car extends autoRacing implements competing {

    private static final String CLASS_CAR = "Автомобиль";

    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        final String BodyType;

        BodyType(String BodyType) {
            this.BodyType = BodyType;
        }

        @Override
        public String toString() {
            return "BodyType{" + BodyType + '}';
        }
    }

    BodyType bodyType;


    public Car(String brand, String model, BodyType bodyType) {
        super(brand, model, "бензин", 2.0, true);
        this.bodyType = bodyType;
    }

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, 2.0);
        this.bodyType = bodyType;
    }

    public void reFuel() {
        System.out.println("заправиться ");
    }

    @Override
    public void pitStop() {
        System.out.println(CLASS_CAR + " марки " + getModel() + " заехал на pit-stop. ");
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
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(bodyType);
        }
    }

    @Override
    public String toString() {
        return "тип кузова: " + bodyType.BodyType;
    }

    @Override
    public boolean isGetDiagnosed() {
        if (getDiagnosed) {
            System.out.println("Автомобиль " + getBrand() + getModel() + " прошел диагностику");
        } else {
            throw new RuntimeException("Необходимо пройти диагностику");
        }
        return getDiagnosed;
    }
}
