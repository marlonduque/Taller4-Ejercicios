package Ejercicio5;

public class Bicycle extends Vehicle {

    private String measurements;

    /**
     *
     * @return
     */
    public String getMeasurements() {
        return measurements;
    }

    public void setMeasurements(String measurements) {
        this.measurements = measurements;
    }

    /**
     * method
     */
    public void modificationsAvailable() {
        System.out.println("Wooowww...the bike is suitable for mountain biking");
        }
    }

