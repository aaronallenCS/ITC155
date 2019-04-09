import java.util.ArrayList;

/*
 * Assignment 2
 * Aaron Allen
 * 4/8/19
 */
public class RemoveEvenLength
{
	public static void main(String[] args) 
	{
		//ArrayList filled with both even and odd lengthed words
		ArrayList<String> words = new ArrayList<String>(); 
		words.add("even");
		words.add("odd"); 
		words.add("isthiseven");
		words.add("Aaron"); 
		words.add("Allen");
		words.add("Spongebob"); 
		words.add("Patrick"); 
		
		//print the newly modified list to the console
		System.out.println(removeEvenLength(words));
	}
	
	//method that returns new list with all even lengthed strings removed 
	public static ArrayList<String> removeEvenLength(ArrayList<String> words) 
	{
		//Loop through the array list
		for(int i = 0; i < words.size(); i++)
		{
			//checks to see if the element at i has a length that is divisible by two
			if((words.get(i).length() % 2) == 0) 
			{
				//then remove it because that word is of even length
				words.remove(i);
			}
		}
		//return the altered list without the even lengthed words
		return words; 
	}
}
