package activityseven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Class implementing a BubbleSort algorithm.
* @author Janyl Jumadinova
*/
public class BubbleSort {

  /** Define the index at which an array starts. */
  private static int ARRAY_START = 0;

  /** Bubble-sort of an array of chars into a nondecreasing order. This
   * implementation of the sort method makes a complete copy of the input array,
   * thus ensuring that it does not modify the input parameter.
   *
   * <p>Please refer to this site:
   * https://docs.oracle.com/javase/7/docs/api/java/lang/System.html
   * for more details about the System.arraycopy() method.
   *
   * @param source the source array that will be copied and sorted
   * @return the copied and sorted array in a nondecreasing order
   */
  public static char[] sort(char[] source) {
    int length = source.length;
    char[] sorted = new char[source.length];
    System.arraycopy(source, ARRAY_START, sorted, ARRAY_START, source.length);
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < (length - 1); j++) {
        if (sorted[j] > sorted[j + 1]) {
          char temporary = sorted[j];
          sorted[j] = sorted[j + 1];
          sorted[j + 1] = temporary;
        }
      }
    }
    return sorted;
  }

  /**
   * Bubble-sort of an array of ints into a nondecreasing order. This
   * implementation of the sort method makes a complete copy of the input array,
   * thus ensuring that it does not modify the input parameter.
   *
   * <p>Please refer to this site:
   * https://docs.oracle.com/javase/7/docs/api/java/lang/System.html
   * for more details about the System.arraycopy() method.
   *
   * @param source the source array that will be copied and sorted
   * @return the copied and sorted array in a nondecreasing order
   */
  public static int[] sort(int[] source) {
    int length = source.length;
    int[] sorted = new int[source.length];
    System.arraycopy(source, ARRAY_START, sorted, ARRAY_START, source.length);
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < (length - 1); j++) {
        if (sorted[j] > sorted[j + 1]) {
          int temporary = sorted[j];
          sorted[j] = sorted[j + 1];
          sorted[j + 1] = temporary;
        }
      }
    }
    return sorted;
  }

  /**
   * Demonstrate the use of the BubbleSort algorithm.
   */
  public static void main(String[] args) {

    // declare the starting file and scanner
    File inputFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      inputFile = new File("input/numbers100.csv");
      scanner = new Scanner(inputFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate the input file");
    }

    int[] numbers = new int[100];
    for (int count = 0; count < numbers.length; count++) {
      numbers[count] = scanner.nextInt();
    }
    System.out.println("Size of the array is: " + numbers.length);

    System.out.println("Starting Sorting");

    int[] sortedNumbers = BubbleSort.sort(numbers);

    System.out.println("Finished Sorting");
  }
}
