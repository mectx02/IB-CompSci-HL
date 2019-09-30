package HL_1.Section_08;

import java.util.*;
import static java.lang.System.*;

public class Numbers
{
    private int[] nums = new int[20];
    private int[] positives = new int[20];
    private int[] negatives = new int[20];
    private int p = 0;                      // logical size of positives array
    private int n = 0;                      // logical size of negatives array
	
    /** precondition: none
     *  postcondition: nums has been populated with random numbers
     *     in the range of -100 to 100.
     */
    public void populateNums()
    {
	for (int i = 0; i < 20; i++) {
            nums[i] = (int)(Math.random() * 202) - 101;
        }
    }
	
    /** precondition: none
     *  postcondition: positives has been populated with all the
     *     numbers in nums that were positive. The variable p has
     *     has been updated to reflect the logical size of
     *     positives array.
     */
    public void populatePositives()
    {
	for (int i = 0; i <20; i++) {
            if (nums[i] >= 0) {
                positives[p] = nums[i];
                p++;
            }
        }
    }

    /** precondition: none
     *  postcondition: negatives has been populated with all the
     *     numbers in nums that were negative. The variable n has
     *     has been updated to reflect the logical size of
     *     negatives array.
     */
    public void populateNegatives()
    {
	for (int i = 0; i < 20; i++) {
            if (nums[i] < 0) {
                negatives[n] = nums[i];
                n++;
            }
        }	
    }
	
    /** precondition: size >=0
     *  postcondition: all the values of array have been printed 
     *     from index 0 to the logical size of the array.
     *  @param array the array to be printed.
     *  @param size the logical size of array
     */
    public void print(int[] array, int size)
    {
	for (int i = 0; i < size; i++) {
                out.println(array[i] + " ");
        }
    }
	
    /** precondition: none
     *  postcondition: all three arrays have been printed with 
     *     appropriate labeling.
     */
    public void printArrays()
    {
	out.println();
        out.print("Random Numbers = " + nums.length + "\n" +
                    "======================\n");
        for(int i = 0; i< 20; i++) {
            out.print(nums[i] + " "); 
        }   
        out.println();
        out.println();
        
        out.print("Positive Numbers = " + p + "\n" +
                    "======================\n");
        for(int i = 0; i < p; i++) {
            out.print(positives[i] + " ");

        }
        out.println();
        out.println();
        
        out.print("Negative Numbers = " + n + "\n" +
                    "======================\n");
        for(int i = 0; i < n; i++) {
            out.print(negatives[i] + " ");
        }
        out.println();
        out.println();
    }
	
    public static void main(String[] args)
    {
        Numbers app = new Numbers();
        app.populateNums();
        app.populatePositives();
        app.populateNegatives();
        app.printArrays();
    }
}