package Ejercicio5;

public class Vehicle {

    private String make;
    private String passengers;
    private String color;

    void Accelerate() {
        System.out.println("maximum speed");}

    void speedUp() {
        System.out.println("Driving safety");
    }

    void stop() {
        System.out.println("Brake");
    }


    /**
     *
     * @return
     */



    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return
     */



    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", passengers=" + passengers +
                ", color='" + color + '\'' +
                '}';
    }
}
