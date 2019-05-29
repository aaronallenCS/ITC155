class Main 
{

  /*
  Aaron Allen
  The run time for the algorithm that I implemented 
  would run in the same speed as normal selection sort.

  */
  public static void main(String[] args)
  {
    int[] list = {8, 9, 2, 5, 6};
    int[] list2 = {2, 1, 3, 4};

    int[] list3 = {1};

    list = sort(list);
    list2 = sort(list2); 
    list3 = sort(list3);

    for(int i = 0; i < list.length; i++) 
    {
      System.out.print(list[i] + " ");
    }
    System.out.println();
    for(int i = 0; i < list2.length; i++) 
    {
      System.out.print(list2[i] + " ");
    }
    System.out.println();

    for(int i = 0; i < list3.length; i++) 
    {
      System.out.print(list3[i] + " ");
    }


  }


  public static int[] sort(int[] list) 
  {
    //keep track of the max index, value, and a temp value.
    int maxIndex = 0;
    int maxNum = 0; 
    int temp = 0; 

    //go through the list end first
    for(int i = list.length - 1; i >= 0; i--) 
    {
      //the max number is whatever is currently in the list
      maxNum = list[i];
      //the max index is whatever is pointed to in the list
      maxIndex = i; 

      //loop through the number of the index 
      for(int j = 0; j < i; j++) 
      {
        //if the current number is greater than the 'max'
        if(list[j] > maxNum) 
        {
          //reassign the value's to their appropriate max
          maxNum = list[j];
          maxIndex = j;
        }
      }
      //check if the maxNum is greater than whatever is in the list
      if(maxNum > list[i]) 
      {
        temp = list[i];
        list[i] = list[maxIndex];
        list[maxIndex] = temp;
      }
    }

    //return the modified list
    return list;
  }
}