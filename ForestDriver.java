import java.lang.Math;

public class ForestDriver
{
    // Declare an instance of every organism to be represented on the grid
    public  Grass grass = new Grass();
    public  Caterpillar caterpillar = new Caterpillar();
    public  Grasshopper grasshopper = new Grasshopper();
	public  Squirrel squirrel = new Squirrel();
    public  Wolf wolf = new Wolf();
    public  Bluejay bluejay = new Bluejay();
	public Shrub shrub = new Shrub();
    public  Mouse mouse = new Mouse();
    public  Rabbit rabbit = new Rabbit();
    public Deer deer = new Deer();
	public  Tree tree = new Tree();
    public  Hawk hawk = new Hawk();
    public  Fox fox = new Fox();
    
    public static void main(String[] args){
	// Intitialize instance of driver forest
	ForestDriver forest = new ForestDriver();

	int sizeOfMatrix = 10;

	char[] row1 = new char[sizeOfMatrix];
	char[] row2 = new char[sizeOfMatrix];
	char[] row3 = new char[sizeOfMatrix];
	char[] row4 = new char[sizeOfMatrix];
	char[] row5 = new char[sizeOfMatrix];
	char[] row6 = new char[sizeOfMatrix];
	char[] row7 = new char[sizeOfMatrix];
	char[] row8 = new char[sizeOfMatrix];
	char[] row9 = new char[sizeOfMatrix];
	char[] row10 = new char[sizeOfMatrix];

	// Populate the 2-dimensional forest with 'X', which is an empty space for any organism to occupy later down the road
	
	for (int index = 0; index < sizeOfMatrix; index++){
		row1[index] = 'X';
		row2[index] = 'X';
		row3[index] = 'X';
		row4[index] = 'X';
		row5[index] = 'X';
		row6[index] = 'X';
		row7[index] = 'X';
		row8[index] = 'X';
		row9[index] = 'X';
		row10[index] = 'X';
	    }
		
		

		forest.grass.PopulateForest(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10);
		forest.hawk.PopulateForest(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10);
		forest.caterpillar.PopulateForest(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10);
		forest.shrub.PopulateForest(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10);
		forest.bluejay.PopulateForest(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10);
		forest.grasshopper.PopulateForest(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10);
		forest.mouse.PopulateForest(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10);
		forest.rabbit.PopulateForest(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10);
		forest.deer.PopulateForest(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10);
		forest.squirrel.PopulateForest(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10);
		forest.fox.PopulateForest(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10);
		forest.tree.PopulateForest(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10);
		forest.wolf.PopulateForest(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10);
	
	System.out.println("\nWelcome to the jungle: \n");
	
	for (int index = 0; index < sizeOfMatrix; index++){
	    System.out.print(row1[index] + " ");
	}
	System.out.println("");
	
	
	for (int index = 0; index < sizeOfMatrix; index++){
	    System.out.print(row2[index] + " ");
	}
	System.out.println("");
	
	for (int index = 0; index < sizeOfMatrix; index++){
	    System.out.print(row3[index] + " ");
	}
	System.out.println("");
	
	for (int index = 0; index < sizeOfMatrix; index++){
	    System.out.print(row4[index] + " ");
	}
	System.out.println("");

	for (int index = 0; index < sizeOfMatrix; index++){
	    System.out.print(row5[index] + " ");
	}
	System.out.println("");
	
	for (int index = 0; index < sizeOfMatrix; index++){
	    System.out.print(row6[index] + " ");
	}
	System.out.println("");
	
	for (int index = 0; index < sizeOfMatrix; index++){
	    System.out.print(row7[index] + " ");
	}
	System.out.println("");
	
	for (int index = 0; index < sizeOfMatrix; index++){
	    System.out.print(row8[index] + " ");
	}
	System.out.println("");

	for (int index = 0; index < sizeOfMatrix; index++){
	    System.out.print(row9[index] + " ");
	}
	System.out.println("");
	
	for (int index = 0; index < sizeOfMatrix; index++){
	    System.out.print(row10[index] + " ");
	}
	System.out.println("");	
	
		



    }
}