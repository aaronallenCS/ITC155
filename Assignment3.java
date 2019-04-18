import java.util.*;
import java.io.*;

public class Assignment3 
{
	public static void main(String[] args) 
	{
		List<Integer> allvalues = new ArrayList<Integer>(); 
		
		allvalues.add(1); 
		allvalues.add(1); 
		allvalues.add(2); 
		allvalues.add(2); 
		allvalues.add(3); 
		allvalues.add(3); 
		allvalues.add(4); 
		allvalues.add(4);

		System.out.println(countUnique(allvalues));
	}
	
	public static int countUnique(List<Integer> values) 
	{
		//set only can contain unique values
		Set<Integer> uniqueValues = new TreeSet<Integer>(); 
		
		//if you add all of the values from the list into the set, it will automatically give you only the unique values
		uniqueValues.addAll(values); 
		
		//Keep track of the number of unique numbers
		int countUnique = 0;
		for(Integer i : uniqueValues) 
		{
			//as you loop through the set, every value is automatically unique so just increment until there is nothing left in the set
			countUnique++;
		}
		
		//return count of unique
		return countUnique;
	}
}
