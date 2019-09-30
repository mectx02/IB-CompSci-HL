package HL_1.Section_10.AP_Free_Response.CookieOrder;

public class CookieOrder
{  
    private String variety;
    private int numBoxes;
    
    /** Constructs a new CookieOrder object. */
    public CookieOrder(String variety, int numBoxes)
    {
       this.variety = variety;
       this.numBoxes = numBoxes;
    }
    
    /** @return the variety of cookie being ordered
    */
    public String getVariety()
    { 
       return variety;
    }
    
    /** @return the number of boxes being ordered
    */
    public int getNumBoxes()
    { 
       return numBoxes;
    }
    
    // There may be instance variables, constructors, and methods that are not shown.
}