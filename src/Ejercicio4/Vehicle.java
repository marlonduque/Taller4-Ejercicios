package Ejercicio4;

public class Vehicle {

    private String vehicle;
    private int passengerCapacity;
    private int numberPassengers;
    private int licenseRegistration;
    private int wheels;
    private String transport;


    /**
     *
     * @param vehicle
     * @param passengerCapacity
     * @param numberPassengers
     * @param licenseRegistration
     * @param wheels
     * @param transport
     */
    public Vehicle(String vehicle, int passengerCapacity, int numberPassengers, int licenseRegistration, int wheels, String transport) {
        this.vehicle = vehicle;
        this.passengerCapacity = passengerCapacity;
        this.numberPassengers = numberPassengers;
        this.licenseRegistration = licenseRegistration;
        this.wheels = wheels;
        this.transport = transport;
    }

    /**
     *
     * @return
     */




    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    public int getLicenseRegistration() {
        return licenseRegistration;
    }

    public void setLicenseRegistration(int licenseRegistration) {
        this.licenseRegistration = licenseRegistration;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicle='" + vehicle + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", numberPassengers=" + numberPassengers +
                ", licenseRegistration=" + licenseRegistration +
                ", wheels=" + wheels +
                ", transport='" + transport + '\'' +
                '}';
    }
}