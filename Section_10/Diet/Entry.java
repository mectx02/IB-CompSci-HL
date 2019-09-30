package HL_1.Section_10.Diet;


/**
 *
 * @author 660741
 * Created on 9/27/18
 * 
 */

public class Entry {
    
    private String date;
    private int weight;
    
    public Entry(String d, int w) {
        
        date = d;
        weight = w;
        
    }
    
    public void setDate(String d) {
        
        date = d;
        
    }
    
    
    public void setWeight(int w) {
        
        weight = w;
        
    }
    
    public String getDate() {
        
        return date;
        
    }
    
    public int getWeight() {
        
        return weight;
        
    }
    
}