public class BSTClass extends BTClass 
{
   ////////////insert///////////////////////
   public void insert(int item) 
   {
      BTNode newNode = new BTNode();
      newNode.lLink = null;
      newNode.data = item;
      newNode.rLink = null;

      BTNode current;
      boolean insertable = true;
      BTNode trailCurrent = null;
      if(insertable)
      {
         System.out.println("Item Inserted");
      }
      else
      {
         System.out.println("ERROR! ITEM WAS NOT INSERTED");
      }
      if (root == null) 
      {
         root = newNode;
         nodeCount++; //// increment for node ocunterrr////////
      } 
      else 
      {
         current = root;
         while (current != null && insertable) 
         {
            trailCurrent = current;
            if (item == current.data) 
            {
               System.out.println("Insert item already exists");
               insertable = false;
               break;
            } 
            else 
            {
               if (item < current.data) 
               {
                  current = current.lLink;
               } 
               else 
               {
                  current = current.rLink;
               }
            }
         }
         if (item < trailCurrent.data && insertable) 
         {
            trailCurrent.lLink = newNode;
            nodeCount++;
         } 
         else if (insertable) 
         {
            trailCurrent.rLink = newNode;
            nodeCount++;
         }
      }
   }

   ////////////leafcounter//////////////////////////////////
   public int getLeafCount(BTNode node) 
   {
       if (node == null) 
       {
           return 0;
       }
       if (node.lLink == null && node.rLink == null) 
       {
           return 1;
       }
       return getLeafCount(node.lLink) + getLeafCount(node.rLink);
   }
   public int getLeafCount() 
   {
       return getLeafCount(root);
   }
   //////node counter hereeeee///////////////////////
   private int nodeCount;
   
   public BSTClass() 
   {
      super();
      nodeCount = 0;
   }
   public BSTClass(BTNode root) 
   {
      super(root);
      nodeCount = (root == null) ? 0 : 1;
   }
   //////this is to get the nodecount/////////
   public int getNodeCount() 
   {
      return nodeCount;
   }
}
