package Ejercicio5;

  public class Boat extends Vehicle {

   private boolean engineRunning;

    /**
     *
     * @return
     */
    public boolean isEngineRunning() {
        return engineRunning;
    }

    public void setEngineRunning(boolean engineRunning) {
        this.engineRunning = engineRunning;
    }

    public void engineRunning() {



        if(engineRunning) {
            System.out.println("Let's go sailing!!!");
        }else{
            System.out.println("Be careful, let's check the faults");
        }

    }
}
