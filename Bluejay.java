public class Bluejay extends Grass
{
    
    public Bluejay(){
		organismChar = 'B';
		foodChainLevel = 2; //Organisms at the second level eat level 1 and 0 organisms, and are eaten by higher levels
		carnivorousType = true;
    }


    public void PopulateForest(char[] row1, char[] row2, char[] row3, char[] row4, char[] row5, char[] row6, char[] row7, char[] row8, char[] row9, char[] row10){
	
		int range = 10;

		int generateXCoord = (int)(Math.random() * range) + 1;
		int generateYCoord = (int)(Math.random() * range) + 1;

	switch (generateXCoord){
			case 1: row1[generateYCoord - 1] = organismChar; break;
			case 2: row2[generateYCoord - 1] = organismChar; break;
			case 3: row3[generateYCoord - 1] = organismChar; break;
			case 4: row4[generateYCoord - 1] = organismChar; break;
			case 5: row5[generateYCoord - 1] = organismChar; break;
			case 6: row6[generateYCoord - 1] = organismChar; break;
			case 7: row7[generateYCoord - 1] = organismChar; break;
			case 8: row8[generateYCoord - 1] = organismChar; break;
			case 9: row9[generateYCoord - 1] = organismChar; break;
			case 10: row10[generateYCoord - 1] = organismChar; break;
	    }

		System.out.println("\nThe coordinates of the bluejay are: X: " + generateXCoord + ", Y: " + generateYCoord + ".");
    }
}
