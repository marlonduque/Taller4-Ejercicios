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
          public void motoCross() {

        System.out.println("The motorcycle practices acrobatics and jumps on asphalt");
    }

}

