/********************************************
*	AUTHOR:	ALEJANDRO BELLO
* COLLABORATORS: <names>
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED: <date>
********************************************/

/********************************************
*	ArrayMethods
*********************************************
*	PROGRAM DESCRIPTION:
*	Collection of useful methods for int arrays.
*********************************************
*	ALGORITHM:
*	TODO: <Pseudocode for selection sort here>
*********************************************

/* UML CLASS DIAGRAM:
-----------------------------------------
ArrayMethods
-----------------------------------------
-----------------------------------------
+ arrayString(array : int[]) : String //static
+ swap(array : int[], a : int, b : int) : void //static
+ indexOfMin(array : int[], startIndex : int) : int //static
+ reverse(array : int[]) : void //static
+ selectionSort(array : int[]) : void //static
-----------------------------------------
*/

public class ArrayMethods
{
  /**
   * @return arrays in contents in string form
   * @param a int[] of values, msut be >= 1 length
   * @return array contents in string, seprarted by commas
   */


  /**DESCRIPTION: */
  public static String arrayString(int[] a)
  {
     String result = "{ " + a[0]; 
      //concatenate on each int value
     for(int i = 1; i < a.length; i++) {
         result += ", " + a[i];
    }
    result += " }";

    return result;

  }

    
   
    //concreater,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
    //c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,d,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
  /**
   * 
   *  swaps two values in the array at given indices
   * 
   * @param array int[] that will be modified  
   *
   * @param a index of first elements to swap (must be valid index)
   * @param b index of second elements to swap (msut be valid index)
   */

  
  /**DESCRIPTION: */
  public static void swap(int[] array, int a, int b)
  {
      int temp = array[a];
      array[a] = array[b]; 
      array[b] = temp;


  }
	/**
   * finds minValue of an array from startIndex
   * @param array int[] to search 
   * @param startIndex to begin search for the min at 
   * @return inddex of the minValue, from the startIndex to end of array
   */
	/**DESCRIPTION: */
  public static int indexOfMin(int[] array, int startIndex)
  {
    int minValue = array[startIndex];
    int minIndex = startIndex;

    for(int i = startIndex+1; i < array.length; i++) {     
        if(minValue > array[i]) {
           minValue = array[i];
           minIndex = i;
        }
    }


    return minIndex;
  }
/**
 * reverses contemcts of array 
 * 
 * @parum array int[] that will be changed to reverse order
 */
	/**DESCRIPTION: */
  public static void reverse(int[] array)
  {
    for(int i = 0; i < array.length/2; i++){
      ArrayMethods.swap(array, i, array.length-1-i);
    }
    /*ArrayMethods.swap(array, 0, array.length-1);
    ArrayMethods.swap(array, 0, array.length-2);*/
  }
  /**
   * Sorts array in ascending order (least to greatest), using seection sort algorithim
   * @parum array int[] that will be changed to sorted order 
   * 
   */

	/**DESCRIPTION: */
  public static void selectionSort(int[] array)
  {

    for(int i = 0; i < array.length-1; i++) {
        int indexMinvalue = ArrayMethods.indexOfMin(array, i);
        ArrayMethods.swap(array, i, indexMinvalue);
    }
    /*int indexMinValue = ArrayMethods.indexOfMin(array, 1);
    ArrayMethods.swap(array, 1, indexMinvalue);*/
  }

}