package ejercicio1;


public class Fly {

    /**
     *
     * @param args
     * @throws InterruptedException
     */


    public static void main(String[] args) throws InterruptedException {

        Planet heart = new Planet( 1, "Earth", (5.972 * Math.pow(10,24)),(1.27 * Math.pow(10,7)));
        Planet jupiter = new Planet( 1, "Jupiter",(1.898 * Math.pow(10,27)),(1.4 * Math.pow(10,7)));

        Calculate calculate = new Calculate();

        String result = calculate.gravitationalAttractionCalculation(heart,jupiter);

        System.out.println(result);
    }

}
