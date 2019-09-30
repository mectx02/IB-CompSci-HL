package HL_1.Section_08.AP_Free_Response.SelfDivisor;

public class SelfDivisor
{
    //***********
    // Part (a)
    //***********
    /** @param number the number to be tested
     *         Precondition: number > 0
     *  @return true if every decimal digit of number is a divisor of number;
     *         false otherwise
     */
    public static boolean isSelfDivisor(int number)
    {
        int length = (String.valueOf(number)).length();
        int digit = number;
        boolean selfDivisor = true;
        int digit2 = number;
        
        for (int i = 0; i < length; i++){
            
            digit2 = digit % 10;
            digit /= 10;
            
            if(digit2 == 0 || number % digit2 != 0)
                selfDivisor = false;
            
        }
        
        return selfDivisor;
    }

    //************
    // Part (b)
    //************
    /** @param start starting point for values to be checked
     *         Precondition: start > 0
     *  @param num the size of the array to be returned
     *         Precondition: num > 0
     *  @return an array containing the first num 
     *  integers >= start that are self-divisors
     */
     public static int[] firstNumSelfDivisors(int start, int num)
     {
         int[] selfDiv = new int[num];
         int count = 0;
         int count2 = 0;
         int digit = start;
         int digit2 = start;
         boolean self = true;
         int length;
         
         while (count < num) {
             
             length = (String.valueOf(digit)).length();
             
             for (int i = 0; i < length; i++) {
                 
                 digit2 = digit % 10;
                 digit = digit / 10;
                 
                 if (digit2 == 0 || (start + count2) % digit2 != 0)
                     self = false;
                                
             }
             
             if (self) {
                 
                 selfDiv[count] = start + count2;
                 count++;
                 
             }
             
             count2++;
             self = true;
             digit = start + count2;
             
         }
         
         return selfDiv;
     }

     // There may be fields, constructors, and methods that are not shown.

     public static void main(String[] args)
     {
     	// Test isSelfDivisor
     	int num = 128;
     	if(isSelfDivisor(num))
     	{
     	   System.out.println(num + " is a self-divisor.");
     	}
     	else
     	{
     	   System.out.println(num + " is not a self-divisor.");
     	}

        num = 22;
        if(isSelfDivisor(num))
     	{
     	   System.out.println(num + " is a self-divisor.");
     	}
     	else
     	{
     	   System.out.println(num + " is not a self-divisor.");
     	}

     	num = 444;
     	if(isSelfDivisor(num))
     	{
     	   System.out.println(num + " is a self-divisor.");
     	}
     	else
     	{
     	   System.out.println(num + " is not a self-divisor.");
     	}

        // Test firstNumSelfDivisors
     	System.out.println();
     	int[] list = firstNumSelfDivisors(20, 5);
     	System.out.print("firstNumSelfDivisors(20, 5)-->");
     	print(list);
     	list = firstNumSelfDivisors(500, 10);
     	System.out.print("firstNumSelfDivisors(500, 10)-->");
     	print(list);
     	System.out.println(); 

     }

     public static void print(int[] list)
     {
     	for(int n : list)
     	{
            System.out.print(n +  " ");
     	}
     	System.out.println();
     }
}