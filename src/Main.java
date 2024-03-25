import Production.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = Car.builder("Porchetta", 250)
                .withColor("blue")
                .withLightColor("pink")
                .build();
        System.out.println(car1);
    }
}