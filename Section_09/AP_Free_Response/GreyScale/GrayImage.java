package HL_1.Section_09.AP_Free_Response.GreyScale;

public class GrayImage
{
	public static final int BLACK = 0;
	public static final int WHITE = 255;

	/* The 2-dimensional representation of this image. Guaranteed not to be null.
	*  All values in the array are within the range [BLACK, WHITE], inclusive.
	*/
	private int[][] pixelValues;

	public GrayImage(int[][] p)
	{
		pixelValues = p;
	}

	/*******************/
	/*     Part (A)    */
	/**
        * @return *****************/
	/* 
        @return the total number of white pixels in this image.
	*  Postcondition: this image has not been changed.
	*/
	public int countWhitePixels()
	{
            int total = 0;
            
            for (int r = 0; r < pixelValues.length; r++) {
                
                for (int c = 0; c < pixelValues[0].length; c++) {
                    
                    if (pixelValues[r][c] == 255)
                        total++;
                    
                }
                
            }
            
            return total;
        }

        /*******************/
	/*     Part (B)    */
	/*******************/
	/* Processes this image in row-major order and decreases the value of each pixel at
	*  position (row, col) by the value of the pixel at position (row + 2, col + 2) if it exists.
	*  Resulting values that would be less than BLACK are replaced by BLACK.
	*  Pixels for which there is no pixel at position (row + 2, col + 2) are unchanged.
	*/
	public void processImage()
	{
            int tempA;
            int tempB;
            int tempC;
            
            for (int r = 0; r < pixelValues.length; r++) {
                
                for (int c = 0; c < pixelValues[0].length; c++) {
                    
                if (r + 2 < pixelValues.length && c + 2 < pixelValues[0].length) {
                    
                    tempA = pixelValues[r][c];
                    tempB = pixelValues[r + 2][c + 2];
                    tempC = tempA - tempB;
                    
                    if (tempC < 0)
                        tempC = 0;
                   
                    pixelValues[r][c] = tempC;
                    
                    }
                }
            }
        }

        public String toString()
        {
    	String str = "";

    	for(int r = 0; r < pixelValues.length; r++)
		{
			for(int c = 0; c < pixelValues[r].length; c++)
			{
				str += String.format("%4d", pixelValues[r][c]);
			}
			str += "\n";
		}

    	return str;
        }
}
