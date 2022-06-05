package Ejercicio5;

  public class Truck extends Vehicle {

    boolean permittedLoad;

    void conditions() {
        if(permittedLoad) {
            System.out.println("You are authorized to travel on roads and bridges");
        }else{
            System.out.println("Not authorized");
        }
    }

  }
