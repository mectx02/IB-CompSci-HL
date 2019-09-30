package HL_1.Section_10.AP_Free_Response.StudentAnswerSheet;

import java.util.*;

public class StudentAnswerSheet
{
    private ArrayList<String> answers;  // the list of the student's answers
    private String name;
    
    // constructor
    public StudentAnswerSheet(String n, String[] ans)
    {
    	name = n;
    	answers = new ArrayList<String>();
    	for(int i=0; i < ans.length; i++)
    	{
    		answers.add(ans[i]);
    	}
    	
    }
    
    // Part (a)
    /** @param key the list of correct answers, represented as strings of length one
     *         Precondition: key.size() is equal to the number of answers in this answer sheet
     *  @return this student's test score
     */
    public double getScore(ArrayList<String> key)
    {
        int correct = 0;
        int incorrect = 0;
        int skipped = 0;
        int count = 0;
        double score = 0;
        
        for (String aws : answers) {
            
            if (aws.equals(key.get(count)))
                correct++;
            
            else {
                if (aws.equals(null))
                    skipped++;
                
                incorrect++;
            }
            
            count++;
            
        }
        
        score += (correct);
        score -= (incorrect * 0.25);
        score += (skipped * 0);
        
        return score;
        
    }
    
    
    /** @return the name of the student
     */
    public String getName()
    {
        return name;
    }
    

}