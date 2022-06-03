package ejercicio1;

public class Calculate {

    /**
     * @autor Marlon
     */
    private final double G = 6.67 * Math.pow(10, -11);
    private double attractiveResult = 0;


    /**
     * 
     * @param planet1
     * @param planet2
     * @return
     */
    public String gravitationalAttractionCalculation(Planet planet1, Planet planet2) {
        double m1 = planet1.getMass();
        double m2 = planet2.getMass();
        double r2 = 0;

        // subtract distances to the sun, to calculate distance between planets

        double distance1 = planet1.getDistanceSun();
        double distance2 = planet2.getDistanceSun();

        //logic for calculating between bodies

        if (distance1 > distance2) {
            r2 = distance1 - distance2;
        } else if (distance1 < distance2) {
            r2 = distance2 - distance1;
        } else {
            r2 = distance1;
        }
        attractiveResult = (G * (m1 * m2)) / r2;
        return "gravitational force between " + planet1.getName() + " and " + planet2.getName() +
                " is the: " + attractiveResult + " N ";

    }
}