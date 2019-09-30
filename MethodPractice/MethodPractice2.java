package HL_1.Section_06.MethodPractice;

/**
 *
 * @author 660741
 */
import java.util.*;

public class MethodPractice2
{
    private Scanner keyboard = new Scanner(System.in);

      // Implement methods below this line

    /**
     *
     * @param name
     * @param num
     */

    public void greeting(String name, int num) {
        
        for (int i = num; i > 0; i--)
            System.out.println(name + ", have a nice day.");
        
    }
    
    public void range(int begin, int end) {
        
        for (int i = begin; i <= end; i++)
            System.out.println(i);
        
    }
    
    public boolean compare(String str) {
        
        String first = str.substring(0,1);
        String last = str.substring(str.length() - 1);
        
        return first.equals(last);
        
    }
    
    public String reverse(String str) {
        
        String reverse = "";
        String letter = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            letter = str.substring(i, i + 1);
            reverse = reverse + letter; 
        }
        
        return reverse;
    }
    
    public int numOccurrences(String word, String letter) {
    
        int occurences = 0;
        
        for (int i = 0; i <= word.length() - 1; i++) {
            
            if((word.substring(i, i + 1)).equals(letter))
                occurences++;
            
        }
        
        return occurences;
    }

    public static void main(String[] args)
    {
        MethodPractice2 app = new MethodPractice2();
 
        System.out.println("******************");
        System.out.println("   Test greeting");
        System.out.println("******************");
        app.greeting("Kendall", 6);

        System.out.println("\n\n******************");
        System.out.println("   Test range");
        System.out.println("******************");
        app.range(10, 15);

        System.out.println("\n\n******************");
        System.out.println("   Test compare");
        System.out.println("******************");
        System.out.println(app.compare("demand"));
        System.out.println(app.compare("football"));
        System.out.println(app.compare("bulb"));

        System.out.println("\n\n******************");
        System.out.println("   Test reverse");
        System.out.println("******************");
        System.out.println(app.reverse("ball"));
        System.out.println(app.reverse("courage"));
        System.out.println(app.reverse("hamburger"));

        System.out.println("\n\n*******************");
        System.out.println("Test numOccurrences");
        System.out.println("*******************");
        System.out.println(app.numOccurrences("MISSISSIPPI", "I"));
        System.out.println(app.numOccurrences("AUTOMOBILE", "O"));
        System.out.println(app.numOccurrences("TEXAS", "R"));
        System.out.println();
    }
}