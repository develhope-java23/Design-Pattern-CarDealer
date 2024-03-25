import Production.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = Car.builder("Porchetta", 250)
                .withColor("blue")
                .withLightColor("pink")
                .build();
        System.out.println(car1);

        Car car2 = Car.builder("Ferrari", 300)
                .withColor("Red")
                .build();

        CarDealer carDealer = CarDealer.getInstance();
        CarDealer carDealer1 = CarDealer.getInstance();

        carDealer.registerCar("12341", car1);
        carDealer1.registerCar("1342341", car2);

        carDealer.printRegistry();
        carDealer1.printRegistry();

        System.out.println(carDealer);
        System.out.println(carDealer1);
        System.out.println(carDealer == carDealer1);


    }

}