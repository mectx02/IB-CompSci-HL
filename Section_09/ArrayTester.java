package HL_1.Section_09;

public class ArrayTester {
    
    public static void main(String args[]) {
        
        int[][] array = {{84, 27, 91},   // 1st array
                         {77, 42, 65},   // 2nd array
                         {38, 73, 15}};  // 3rd array

        for(int[] arr : array)
        { 
           for(int num : arr)
           {
              System.out.print(num + " ");
           }
           System.out.println();
        }
        
//------------------------------------------------------------------------------------\\        
        
        int[][] grid = new int[3][3];
        String divider = "------------------";

        int y = 0;

        for (int[] row : grid)
        {   
            for (int dividers : row)
                System.out.print(divider);

            System.out.println();

            int x = 0;
            for (int columns : row)
            {
                row[columns] = y;
                System.out.print("| (row: " + row[columns] + " col: " + x + ") ");
                x++;
            }   
            y++;
            System.out.println("| ");   
        }

        for (int[] lastDivider : grid)
            System.out.print(divider);
    
        
    }
    
}
