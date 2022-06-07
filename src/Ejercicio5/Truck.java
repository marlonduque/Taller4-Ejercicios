package Ejercicio5;

  public class Truck extends Vehicle {

      private boolean permittedLoad;

      /**
       * @return
       */

      public boolean isPermittedLoad() {
          return permittedLoad;
      }

      public void setPermittedLoad(boolean permittedLoad) {
          this.permittedLoad = permittedLoad;
      }

      /**
       *
       */
      public void permittedLoad() {


          if (permittedLoad) {
              System.out.println("You are authorized to travel on roads and bridges");
          } else {
              System.out.println("Not authorized");
          }
      }
  }