package ejercicio1;

     public class Planet extends SystemPlanet {

         public Planet() {

         }

         public String Planet (){
             gravity();
            return toString();
         }

         @Override
         public void gravity() {
             System.out.println("La gravedad del sol en la tierra es aprox. 274 m/s");
         }

     }
