public class ExtraCredit 
{
  //methods for the IntTree class 
  public int countEmpty() 
  {
       //counts the empty nodes in the overallRoot being overriden in the other method
       return countEmpty(overallRoot);
  }

  //overrides the method countEmpty() to count the roots being passed in
  public int countEmpty(IntTreeNode root)
  {
      //if the root is null...
      if (root == null) 
      {
           //then there is one empty node
           return 1;
      } 
      else 
      {
           //count the empty nodes in the left and right side add them together.
           return countEmpty(root.left) + countEmpty(root.right);
      }
   }
}
