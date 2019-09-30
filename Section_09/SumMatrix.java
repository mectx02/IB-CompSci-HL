package HL_1.Section_09;

import java.util.Scanner;
import static java.lang.System.*;

public class SumMatrix {
    
    public static void main(String args[]) {
        
        Scanner keyboard = new Scanner(in);
        
        out.print("Enter a horizontal size: ");
        int row = keyboard.nextInt();
        out.print("Enter a vertical size: ");
        int col = keyboard.nextInt();
        out.println();
        
        keyboard.close();
        
        int matrix[][] = new int[row][col];
        int total = 0;
        
        for (int r = 0; r < row; r++) {
            
            for (int c = 0; c < col; c++) {
                
                matrix[r][c] = (int)(Math.random() * 9);
                out.print(matrix[r][c] + "\t");
            }
            out.println();
        }
        
        out.println();
        out.println("Horizontal Totals");
        
        for (int r = 0; r < row; r++) {
            
            for (int c = 0; c < col; c++) {
                
               total += matrix[r][c];
                
            }
            out.print(total + "\t");
            total = 0;
        }
        
        out.println();
        out.println();
        out.println("Vertical Totals");
        
        for (int c = 0; c < col; c++) {
            
            for (int r = 0; r < row; r++) {
                
                total += matrix[r][c];
                
            }
            out.print(total + "\t");
            total = 0;
        }
        
    }
    
}
