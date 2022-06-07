package Ejercicio6;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * @autor
 */
  public class NumVector {


    /**
     * Method create list
     */
    public boolean flag = true;
        public ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

       public Integer previous = 0;
       public Integer after = 100;

    /**
     * Conditionals  the user enters the numbers and they are saved.
     * then compare that they are not repeated to close the cycle.
     */
       public void run() {

           while(flag) {
               System.out.println(" Enter a number");
               after = sc.nextInt();

               if (after == previous) {
                   System.out.println("Finish...");
                   list.stream().forEach(System.out::println);
                   flag = false;
               }else{
                   list.add(after);
                   previous = after;
               }
           }
          }

  }



