/* Selection sort
 * This tipe of sort matches every element of the array, then moves the
 *  lower value at the beginning, again the next value after the first
 *  as second and so on. There are n-1 matches because the array
 *  shortens the array each time.
 * Author: LordRibblesdale
 * Method: static
 */

public class SelectionSort {
   public static void selSort(int[] a) {  //Similar if indexMax is choosen (inverted array)
      int indexMin = -1, tmp = 0;

      for (int i = 0; i < a.length; i++) {
         for (int j = i+1; j < a.length; j++) {
            if (a[j] < a[i]) {
               indexMin = j;
            }
         }
         tmp = a[i];
         a[i] = a[j];
         a[j] = tmp;
      }
   }
}
