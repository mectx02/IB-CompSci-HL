package HL_1.Section_08.AP_Free_Response.NumberCube;

import static java.lang.System.out;

public class NumberRuns
{
    // Part (a)
    /** Returns an array of the values obtained by tossing a number cube numTosses times.
    * @param cube a NumberCube
    * @param numTosses the number of tosses to be recorded
    * Precondition: numTosses > 0
    * @return an array of numTosses values
    */
    public static int[] getCubeTosses(NumberCube cube, int numTosses)
    {
        int[] array = new int[numTosses];
        
        for (int i = 0; i < numTosses; i++) {
            
            array[i] = cube.toss();
            
        }
        
        return array;
    }

    // Part (b)
    /** Returns the starting index of a longest run of two or more consecutive repeated values
    * in the array values.
    * @param values an array of integer values representing a series of number cube tosses
    * Precondition: values.length > 0
    * @return the starting index of a run of maximum size;
    * -1 if there is no run
    */
    public static int getLongestRun(int[] values)
    {
        int numRun = 0;
        boolean hasRun = false;
        int index = 0;
        int runs[] = new int[values.length];
        int indexs[] = new int[values.length];
        int count = 0;
        int largest = Integer.MIN_VALUE;
        
        for(int i = 0; i < values.length - 1; i++)
        {
            if(values[i] == values[i + 1])
            {
                numRun ++;
                hasRun = true;
            }
            else
            {
                if(numRun > 0)
                {
                    runs[count] = numRun;
                    indexs[count] = i - numRun;
                    count ++;
                    numRun = 0;
                }
            }
        }
        
        for(int i = 0; i < runs.length; i++)
        {
            if(runs[i] > largest)
            {
                largest = runs[i];
                index = indexs[i];
            }
        }
        
        if(hasRun)
        {
            return index;
        }
        return -1; 
    }

    public void print(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            out.printf("%3d", i);
        }
        out.println();
        for(int n : arr)
        {
            out.printf("---");
        }
        out.println();

        for(int n : arr)
        {
            out.printf("%3d", n);
        }
        out.println();

        out.println();
        out.println("Index of Longest Run = " + getLongestRun(arr));
        out.println();
    }

    public static void main(String[] args)
    {
        NumberRuns app = new NumberRuns();

        int[] toss1 = app.getCubeTosses(new NumberCube(), 17);
        app.print(toss1);

        int[] toss2 = app.getCubeTosses(new NumberCube(), 17);
        app.print(toss2);

        int[] toss3 = app.getCubeTosses(new NumberCube(), 17);
        app.print(toss3);

        int[] toss4 = {1,3,2,4,6,5,1,3,2,4,6,5,1,3,2,4};
        app.print(toss4);
    }
}