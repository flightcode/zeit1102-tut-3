public class Car {

    String rego;
    float speed;
    String colour;

    public Car() {
    }

    public Car(String rego, float speed, String colour) {
        this.rego = rego;
        this.speed = speed;
        this.colour = colour;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("2NDBSC", (float) 100, "blue");

        car1.setCar("1SFSDX", (float) 60, "red");
        car2.setSpeed((float) 40);

        if (car1.getSpeed() > car2.getSpeed()) {
            System.out.println(car1.getColour());
        } else {
            System.out.println(car2.getColour());
        }
    }

    void setCar(String rego, float speed, String colour) {
        this.rego = rego;
        this.speed = speed;
        this.colour = colour;
    }

    void setRego(String rego) {
        this.rego = rego;
    }

    void setSpeed(float speed) {
        this.speed = speed;
    }

    void setColour(String colour) {
        this.colour = colour;
    }

    String getRego() {
        return this.rego;
    }

    float getSpeed() {
        return this.speed;
    }

    String getColour() {
        return this.colour;
    }

    void accelerate(float speed) {
    }

    void brake(float speed) {
    }
}