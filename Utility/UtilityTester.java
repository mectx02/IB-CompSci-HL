package HL_1.Section_06.Utility;

public class UtilityTester
{
    public static void main(String[] args)
    {
        int iNum = Utility.readInt("Enter an integer -->");
        System.out.println("The number = " + iNum);

        Utility.blankLines(1);

        double dNum = Utility.readDouble("Enter a double -->");
        System.out.println("The number = " + dNum);

        Utility.blankLines(1);

        String str = Utility.readString("Enter a string -->");
        System.out.println("The string = " + str);

        Utility.blankLines(1);
        
    }
}