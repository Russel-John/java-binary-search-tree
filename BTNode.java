public class BTNode
{
   public BTNode rightLink;
   public int value;
   public BTNode leftLink;
   
   public BTNode()
   {
      this.rightLink = null;
      this.value = 0;
      this.leftLink = null;
   }
   public BTNode(BTNode rightLink, int value, BTNode leftLink) 
   {
      this.rightLink = rightLink;
      this.value = value;
      this.leftLink = leftLink;
   }  
}