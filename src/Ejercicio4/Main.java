package Ejercicio4;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        ArrayList<Vehicle> vehicleList = new ArrayList<>();


        System.out.println("--------------------------------------");


        Vehicle vehicle1 = new Vehicle("Bus", 60, 52, 2015, 6, "Overland");
        Vehicle vehicle2 = new Vehicle("Bus", 60, 56, 2017, 8, "Overland");
        Vehicle vehicle3 = new Vehicle("Bus", 60, 52, 2021, 6, "Overland");
        Vehicle vehicle4 = new Vehicle("Bus", 60, 56,2012 , 8, "Overland");
        Vehicle vehicle5 = new Vehicle("Bus", 60, 52, 2022, 6, "Overland");
        Vehicle vehicle6 = new Vehicle("Bus", 60, 56,2019 , 8, "Overland");
        Vehicle vehicle7 = new Vehicle("Bus", 60, 52,2019 , 6, "Overland");
        Vehicle vehicle8 = new Vehicle("Bus", 60, 56, 2018, 8, "Overland");
        Vehicle vehicle9 = new Vehicle("Bus", 60, 52, 2017, 6, "Overland");
        Vehicle vehicle10 = new Vehicle("Bus", 60, 56, 2021, 8, "Overland");

        vehicleList.add(vehicle1);
        vehicleList.add(vehicle2);
        vehicleList.add(vehicle3);
        vehicleList.add(vehicle4);
        vehicleList.add(vehicle5);
        vehicleList.add(vehicle6);
        vehicleList.add(vehicle7);
        vehicleList.add(vehicle8);
        vehicleList.add(vehicle9);
        vehicleList.add(vehicle10);


        /**Method
         *
         */

        for(int i = 0; i < vehicleList.size(); i++) {
            System.out.println("ingrese vehiculo: " + vehicle1);

        }



    }
}