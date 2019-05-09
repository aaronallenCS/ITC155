import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


/*
 * Aaron Allen 
 * Midterm 
 * 5/9/2019
 */
public class Midterm
{
	//Solution for question 2: 
	//[1, 2, 6, 8]
	//[10, 30, 40, 20, 60, 50]
	//[-4, 1, 25, 4, 16, 9, 64, 36, 49]
	
	//Solution for question 3: 
	//6
	//8
	
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(2);
		a.add(2);
		a.add(3);
		a.add(2);
		a.add(1);
		a.add(3);
		a.add(1);
		//prints 4
		System.out.println(maxOccurrences(a));
		
		//empty list 
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		
		//prints 0
		System.out.println(maxOccurrences(a2));

	}
	
	public static int maxOccurrences(List<Integer> list)
	{
		//auxilary map
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    //keep track of all the list's values
	    Iterator<Integer> i = list.iterator();
	    
	    //Loop through each element in the list
	    while (i.hasNext()) 
	    {
	    	//put each number in a variable
	        int num = i.next();
	        
	        //check to see if the map contains that key
	        if (map.containsKey(num)) 
	        {
	        	//if so, increase the count by 1 to show that is has been seen more than once
	            map.put(num, map.get(num) + 1);
	        } else 
	        {
	        	//if it hasn't been seen, just assign one as the count of times it's been seen
	            map.put(num, 1);
	        }
	    }

	    //create a set that has all of the map's values
	    Set<Integer> setKey = map.keySet();
	    //get each value
	    i = setKey.iterator();
	    //assign a value to max of 0 to hold the future max value
	    int max = 0;
	    
	    //loop through all the keys in the map which hold the greatest occurence's value
	    while(i.hasNext())
	    {
	    	//find the max
	        int current = map.get(i.next());
	        if (current > max) 
	        {
	        	//assign it to max
	            max = current;
	        }
	    }
	    
	    //return correct value
	    return max;
	}

}
