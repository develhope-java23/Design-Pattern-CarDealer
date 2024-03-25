//plate,

import Production.Car;

import java.util.HashMap;

public class CarDealer {

    private static CarDealer instance;

    private HashMap<String, Car> registry;

    private CarDealer() {
        this.registry = new HashMap<>();
    }

    public void registerCar(String plate, Car car) {

        if (registry.containsKey(plate)) {
            throw new RuntimeException("Targa non trovata");
        }
        registry.put(plate, car);
    }

    public Car retrieveCar(String plate) {

        if (!registry.containsKey(plate)) {
            throw new RuntimeException("Auto non trovata");
        }
        return registry.get(plate);
    }

    public static CarDealer getInstance(){
        if(instance == null){
            instance = new CarDealer();
        }

        return instance;
    }

    public void printRegistry(){
        for( String plate : registry.keySet()){
            System.out.println("Plate: " + plate + "Car:" + registry.get(plate));
        }
    }
}
