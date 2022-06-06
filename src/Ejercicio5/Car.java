package Ejercicio5;

    public class Car extends Vehicle {

        private boolean airCond;

        /**
         * @return Get -Set
         */


        public boolean isAirCond() {
            return airCond;
        }

        public void setAirCond(boolean airCond) {
            this.airCond = airCond;
        }


            public void airCond() {

            airCond = (true);


            if(airCond) {
                System.out.println("Turn on Air Conditionador");
            } else {
                System.out.println("Shutdown");
            }

    }
}



