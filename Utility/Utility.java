package HL_1.Section_06.Utility;

import java.util.*;
import static java.lang.System.*;

public class Utility
{
    private static Scanner keyboard = new Scanner(System.in);

    /** This method prompts a user to enter
     *  an integer value from the keyboard. It
     *  then reads and returns the integer value  
     *  using the Scanner class's nextInt method.
     *  @param prompt the user prompt
     *  @return the value read from keyboard
     */
    public static int readInt(String prompt)
    {out.print(prompt);
    int newInt = keyboard.nextInt();
    keyboard.nextLine();
    return newInt;
    }

    /** This method prompts a user to enter
     *  a double value from the keyboard. It
     *  then reads and returns the double value  
     *  using the Scanner class's nextDouble method.
     *  @param prompt the user prompt
     *  @return the value read from keyboard
     */
    public static double readDouble(String prompt)
    {
    out.print(prompt);
    double newDouble = keyboard.nextDouble();
    keyboard.nextLine();
    return newDouble;
    }

    /** This method prompts a user to enter
     *  a string from the keyboard. It then
     *  reads and returns the string using  
     *  the Scanner class's nextLine method.
     *  @param prompt the user prompt
     *  @return the value read from keyboard
     */
    public static String readString(String prompt)
    {
    out.print(prompt);
    String newStr = keyboard.nextLine();
    return newStr;
    }
    

    /** This method prints blank lines on the
     *  console window.
     *  @param num the number of lines to display
     */
    public static void blankLines(int num)
    {
       for(int l = 0; l < num; l++) {
           out.println();
    }
    }
}