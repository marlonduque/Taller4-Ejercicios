package Ejercicio5;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Truck truck = new Truck();
        Boat boat = new Boat();
        Bicycle bicycle = new Bicycle();

        //ingresa el parametro que deseas observar
        // Enter the parameter you wish to observe

         car.setAirCond(true); // true -false
         car.airCond();
         bicycle.modificationsAvailable();
         boat.setEngineRunning(false);  //true - false
         boat.engineRunning();
         motorcycle.motoCross();
         truck.setPermittedLoad(true); //true - false
         truck.permittedLoad();







    }

}
