import java.util.*;
import java.io.*;
public class FinalExam
{
	
	//Answer for problem #1 
	//O(N^2)
	
	//Answer for problem #2 
	public Stack<Integer> copyStack(Stack<Integer> s) 
	{
		Stack<Integer> newStack = new Stack<Integer>(); 
		
		for(int i = 0; i < s.size(); i++) 
		{
			int n = s.get(i); 
			newStack.add(n);
		}
		return newStack;
	}
	

	//Answer for problem #3
	public boolean isSorted() 
	{
		if(front == null) 
			return true; 
		
		ListNode prev = front; 
		
		ListNode current = prev.next; 
		
		while(current != null) 
		{
			if(prev.data > current.data) 
				return false;
			
			prev = current;
			current = prev.next;
		}
		
		return true;
	}

}
