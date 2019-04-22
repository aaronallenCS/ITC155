import java.util.*;
import java.io.*;

/*
 * Name: Aaron Allen 
 * Assignment 4
 * Date: 4/22/19
 */
public class Assignment4 
{
	public static boolean isUnique(Map<String, String> values)
	{
		//Contains the count of each key that will be in the map
		Map<String, Integer> wordCountMap = new TreeMap<String, Integer>(); 
		
		//gets all the values that are in the map that is passed into the parameter
		Collection<String> names = values.values();
		
		//Loop through all the contents in the Collections containing all of the key's values
		for(String name : names) 
		{
			//if the wordCountMap contains the name already in the map....
			if(wordCountMap.containsKey(name)) 
			{
				//get the count of that value
				int count = wordCountMap.get(name);
				//increment by one to signify that it has been seen again in the Map
				wordCountMap.put(name,  count + 1);
			}
			else
			{
				//If the value has never been seen before in the map, add it, and assign the occurence to 1
				wordCountMap.put(name, 1);
			}
		}
		
		//In the Map with all the occurrences of each value store it in a collection
		Collection<Integer> count = wordCountMap.values(); 
		
		//Iterate through the counts of each word in the Map
		for(Integer i : count) 
		{
			//if any count is above one, that means that the Map passed in is not unique...
			if(i > 1) 
			{
				//therfore return false
				return false;
			}
		}
		
		//otherwise return true, every value is indeed unique.
		return true;
	}

}
