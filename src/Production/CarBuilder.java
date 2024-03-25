package Production;

public class CarBuilder {

    private int maxSpeed;

    private String name;

    private String color;

    private String lightColor;

    protected CarBuilder (String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.color = "red";
        this.lightColor = "white";
    }

    protected String getName() {
        return name;
    }

    protected int getMaxSpeed() {
        return maxSpeed;
    }

    protected String getColor() {
        return color;
    }

    protected String getLightColor() {
        return lightColor;
    }



    public CarBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder withLightColor(String lightColor) {
        this.lightColor = lightColor;
        return this;
    }



    public Car build (){
        return new Car(this);
    }

    @Override
    public String toString() {
        return "CarBuilder{" +
                "maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", lightColor='" + lightColor + '\'' +
                '}';
    }
}
