package HL_1.Section_09;

import static java.lang.System.*;
import java.util.Scanner;

public class LessThan100 {
    
    public static void main(String args[]) {
      
        Scanner keyboard = new Scanner(in);
        
        out.print("Enter a horizontal size: ");
        int rows = keyboard.nextInt();
        out.print("Enter a vertical size: ");
        int cols = keyboard.nextInt();
        keyboard.nextLine();
        out.println();
        
        int array[][] = new int[rows][cols];
        
        for (int row = 0; row < array.length; row++) {
            
            for (int col = 0; col < array[row].length; col++) {
                
                array[row][col] = (int)(Math.random() * 200) + 1;
                out.print(array[row][col] + " ");
            }
            out.println();
        }
        
        out.println();
        out.println();
        out.println("Values less than 100 (row, col):");
        out.println();
        
        for(int row = 0; row < array.length; row++)
        {
            for(int col = 0; col < array[row].length; col++)
            {
                if(array[row][col] < 100)
                {
                    System.out.println(row + ", " + col);
                }
           }
        }
        
        keyboard.close();
        
    }
}
