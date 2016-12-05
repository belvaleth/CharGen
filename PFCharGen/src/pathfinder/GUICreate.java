package pathfinder;

import java.util.Arrays;
import java.util.Random;

public class GUICreate {
	public final String[] races = new String[20];
	
	
	//Returns a random element from a given array of strings.
	public String getRandomString(String[] input)
	{
		int max = input.length;
		Random generator = new Random();
		int randomElement =  generator.nextInt(max);
		return input[randomElement];
	}
	//public double getHeight(String race)
	{
		//todo
	}


	//Rolls 4d6 and returns the sum of the top 3 rolls.
	public int rollStat()
	{
		Random generator = new Random();
		int[] rolls = new int[3];
		for(int counter = 0;counter < 4;counter++)
		{
			rolls[counter] = generator.nextInt(5)+1;
		}
		Arrays.sort(rolls);
		int total = rolls[1]+rolls[2]+rolls[3];
		return total;
	}

}
