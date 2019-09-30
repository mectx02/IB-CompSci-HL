package HL_1.Section_09;

/**
 *
 * @author 660741
 */
public class StoreLargest {
    
    public static void main(String args[]) {
        
        int[][] matrix1 = new int[4][4];
        int[][] matrix2 = new int[4][4];
        int[][] largest = new int[4][4];
        
        System.out.println("Value Comparison\n"
                                 + "================");
        System.out.println("Mx. 1\tMx. 2\tLargest");
        
        for (int row = 0; row < 4; row++) {
            
            for (int col = 0; col < 4; col++) {
                
                matrix1[row][col] = (int) (Math.random() * 9);
                matrix2[row][col] = (int) (Math.random() * 9);
                
                if (matrix1[row][col] < matrix2[row][col]) {
                    
                    largest[row][col] = matrix2[row][col];
                    
                } else {
                    
                    largest[row][col] = matrix1[row][col];
                    
                }
                
                System.out.println(matrix1[row][col] + " \t|" +
                                   matrix2[row][col] + " \t|" +
                                   largest[row][col]);
                
            }
            
        }
        
        System.out.println();
        System.out.println();
        
        for (int r1 = 0; r1 < 4; r1++) {
            
            for (int c1 = 0; c1 < 4; c1++) {
                
                System.out.print(matrix1[r1][c1] + " ");
                
            }
            
            System.out.println();
        }
        
        System.out.println();
        
        for (int r2 = 0; r2 < 4; r2++) {
            
            for (int c2 = 0; c2 < 4; c2++) {
                
                System.out.print(matrix2[r2][c2] + " ");

            }
            
            System.out.println();
        }
        
        System.out.println();
        
        for (int r3 = 0; r3 < 4; r3++) {
            
            for (int c3 = 0; c3 < 4; c3++) {
                
                System.out.print(largest[r3][c3] + " ");
 
            }
            
            System.out.println();
        }
    }
    
}
