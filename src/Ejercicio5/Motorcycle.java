package Ejercicio5;


      public class Motorcycle extends Vehicle {

    /**
     * @autor Marlon
     */
    private String motorcycleHeight;

          /**
           *
           * @return
           */
             public String getMotorcycleHeight() {
              return motorcycleHeight;
             }

            public void setMotorcycleHeight(String motorcycleHeight) {
                 this.motorcycleHeight = motorcycleHeight;
            }

          /**
           * method
           */
          public void liftOnWheel() {

        System.out.println("Lift on a wheel");
    }

}

