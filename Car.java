public class Car {

    String rego;
    float speed;
    String colour;

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.setCar("1SFSDX", (float) 60, "red");
        car2.setSpeed((float) 40);
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
    }

    float getSpeed() {
    }

    String getColour() {
    }

    void accelerate(float speed) {
    }

    void brake(float speed) {
    }

    String toString() {
    }
}