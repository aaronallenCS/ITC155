public class Assignment9
{
    public static void main(String[] args) 
    {
        LinkedIntList values = new LinkedIntList(); 

        values.add(1); 
        values.add(2); 
        values.add(3); 
        values.add(4); 
        values.add(5);

        //the linked list should return true 1,2,3,4,5
        System.out.println(values.isSorted());

        LinkedIntList notSorted = new LinkedIntList(); 

        notSorted.add(4);
        notSorted.add(6); 
        notSorted.add(1); 
        notSorted.add(2); 
        notSorted.add(10); 

        //the linked list should return false 4, 6, 1, 2, 10
        System.out.println(notSorted.isSorted()); 

        LinkedIntList empty = new LinkedIntList(); 

        //should return true empty list.
        System.out.println(empty.isSorted());
    }
    
    //hide the class implementation for LinkedIntList, and ListNode to reduce code
    //isSorted() method 
    
    
    public boolean isSorted() 
    {
        //if there are no values then it is sorted
        if(front == null)
            return true;
            
        //get the previous node
        ListNode prev = front;
        //get the current node
        ListNode current = prev.next;
        
        //while there is still a current element...
        while(current != null) 
        {
            //check if the previous is bigger than the current
            if(prev.data > current.data)
                //if it is, then it isn't sorted
                return false;
                
            //reassign the values
            prev = current;
            current = prev.next;
        }
        //if the if in the while loop is never executed, then the linkedlist is sorted
        return true;
    }
    
}
