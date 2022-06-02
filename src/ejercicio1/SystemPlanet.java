  package ejercicio1;

  /**
   * @ autor Marlon
   */

   public abstract class SystemPlanet {

      private String mass;
      private String density;
      private String diameter;
      private String distanceSun;

      public String getMass() {
          return mass;
      }

      public void setMass(String mass) {
          this.mass = mass;
      }

      public String getDensity() {
          return density;
      }

      public void setDensity(String density) {
          this.density = density;
      }

      public String getDiameter() {
          return diameter;
      }

      public void setDiameter(String diameter) {
          this.diameter = diameter;
      }

      public String getDistanceSun() {
          return distanceSun;
      }

      public void setDistanceSun(String distanceSun) {
          this.distanceSun = distanceSun;
      }

      public abstract void gravity();
  }


