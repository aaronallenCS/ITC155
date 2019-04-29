
public class Assignment5
{
	public static void writeNums(int n) 
	{
		//base case is the number 1
	    if (n == 1) 
	    {
	        System.out.print("1");
	    } else 
	    {
	    	//decrease the value of n
	        writeNums(n - 1);
	        //add a comma after every decreasion
	        System.out.print(", " + n);
	    }
	}
	
	//test method
	public static void main(String[] args)
	{
		//prints 1, 2, 3, 4, 5
		writeNums(5);
		System.out.println(); 
		//prints 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
		writeNums(12);
		System.out.println();
	}
}
