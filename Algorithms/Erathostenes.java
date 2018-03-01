/* Sieves of Erathostenes
 * The sieves of Erathostenes is an algorithm that finds prime numbers
 *  removing from search every multiple of prime numbers
 *  (each value that isn't removed will be signed as prime number)
 * Author: LordRibblesdale
 * Method: static
 */

import java.util.Scanner;

public class Erathostenes {
   public static void initialise(boolean[] array, int index) {
      for (int i = 0; i < index; i++) {
         array[i] = true;
      }
   }

   public static void setPrime(boolean[] array) {
      for (int i = 2; i < array.length; i++) {  //0 and 1 are prime numbers
         if (array[i]) {
            for (int j = 2*i; j < array.length; j += i) {
               array[j] = false;
            }
         }
      }
   }

   /* Now it is possibile to create main method that prints these prime numbers
      or asks a value and matches if it is setPrime */

   public static void print(boolean[] array) {
      for (int i = 0; i , array.length; i++) {
         if (array[i]) {
            System.out.print(i+1 " ");
         }
      }
   }

   public static boolean isPrime(boolean] array, int n) {
      if (array[n-1]) {
                  return true;
      } else return false;
   }
}
