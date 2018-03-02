/* Bubble sort
 * This type of sort checks every 2 items of the array and moves the
 *  one with highest (or lowest) value. After the first check of the
 *  whole array, the highest (lowest) value is at the end/beginning
 *  of the array. After n-1 checks all elements are sorted.
 * Author: LordRibblesdale
 * Method: static
 */

public class BubbleSort {
   public static void bubSort(int[] a) {
      int tmp = 0;

      for (int i = 0; i < a.length-1; i++) {
         for (int j = 0; j < a.length-1; j++) {
            if (a[j] > a[j+1]) {
               tmp = a[j+1];
               a[j+1] = a[j];
               a[j] = tmp;
            }
         }
      }
   }
}
