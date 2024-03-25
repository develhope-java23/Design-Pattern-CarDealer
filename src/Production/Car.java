package Production;

public class Car {

    private int maxSpeed;

    private String name;

    private String color;

    private String lightColor;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getLightColor() {
        return lightColor;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    protected Car (CarBuilder builder) {
        this.maxSpeed = builder.getMaxSpeed();
        this.name = builder.getName();
        this.color = builder.getColor();
        this.lightColor = builder.getLightColor();
    }

    public static CarBuilder builder(String name, int maxSpeed) {
        return new CarBuilder(name, maxSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", lightColor='" + lightColor + '\'' +
                '}';
    }
}
