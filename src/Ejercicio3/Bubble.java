package Ejercicio3;

import java.util.Random;


/**
 * @autor Marlon
 */
  public class Bubble {
     public static void main(String[] args) {
        /**
         * Array
         */
        Random random = new Random();
        int[] numbers = new int[10];

        /**
         * Random
         */
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("random: ");
        printArray(numbers);

        //clasificacion algoritmo burbuja y condicionales
        //Sorting Bubble algorithm here

         boolean swappedSomething = true;

         while (swappedSomething) {
             swappedSomething = false;
             for (int i = 0; i < numbers.length - 1; i++) {
                 if (numbers[i] > numbers[i + 1]) {
                     swappedSomething = true;
                     int temp = numbers[i];
                     numbers[i + 1] = temp;
                 }
             }
         }
        System.out.println("\n  bubble organized");
        printArray(numbers);

    }
     private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
     }
  }