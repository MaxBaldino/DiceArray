import java.util.Random;

public class Dice {

	
	//Identify our Fields, often called instance variables
	//Fields get private access
	//Every object gets its own copy
	
	private int numRolls = 0;
	
	//Create our methods
	//Give us our capabilities
	
	public int roll() {
		
		Random rand = new Random();
		int num = rand.nextInt(6)+1;
		return num;
		numRolls++;
		
	}
	
	public int getNumRolls() {
		
		return numRolls;
		
	}
	
	public void reset () {
		
		numRolls = 0;
		
	}
	
}
