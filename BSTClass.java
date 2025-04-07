public class BSTClass extends BTClass 
{
   // Insert method
   public void insert(int element) 
   {
      BTNode newElement = new BTNode();
      newElement.leftLink = null;
      newElement.value = element;
      newElement.rightLink = null;

      BTNode currentNode;
      boolean canInsert = true;
      BTNode previousNode = null;
      if(canInsert)
      {
         System.out.println("Item Inserted");
      }
      else
      {
         System.out.println("ERROR! ITEM WAS NOT INSERTED");
      }
      if (rootNode == null) 
      {
         rootNode = newElement;
         totalNodes++;
      } 
      else 
      {
         currentNode = rootNode;
         while (currentNode != null && canInsert) 
         {
            previousNode = currentNode;
            if (element == currentNode.value) 
            {
               System.out.println("Insert item already exists");
               canInsert = false;
               break;
            } 
            else 
            {
               if (element < currentNode.value) 
               {
                  currentNode = currentNode.leftLink;
               } 
               else 
               {
                  currentNode = currentNode.rightLink;
               }
            }
         }
         if (element < previousNode.value && canInsert) 
         {
            previousNode.leftLink = newElement;
            totalNodes++;
         } 
         else if (canInsert) 
         {
            previousNode.rightLink = newElement;
            totalNodes++;
         }
      }
   }

   // Leaf counter method
   public int getLeafCount(BTNode treeNode) 
   {
       if (treeNode == null) 
       {
           return 0;
       }
       if (treeNode.leftLink == null && treeNode.rightLink == null) 
       {
           return 1;
       }
       return getLeafCount(treeNode.leftLink) + getLeafCount(treeNode.rightLink);
   }
   public int getLeafCount() 
   {
       return getLeafCount(rootNode);
   }

   // Node counter
   private int totalNodes;
   
   public BSTClass() 
   {
      super();
      totalNodes = 0;
   }
   public BSTClass(BTNode rootNode) 
   {
      super(rootNode);
      totalNodes = (rootNode == null) ? 0 : 1;
   }
   public int getNodeCount() 
   {
      return totalNodes;
   }

   // Height method
   public int height(BTNode treeNode) 
   {
       if (treeNode == null) 
       {
           return 0;
       }
       int leftHeight = height(treeNode.leftLink);
       int rightHeight = height(treeNode.rightLink);
       return Math.max(leftHeight, rightHeight) + 1;
   }
   public int height() 
   {
       return height(rootNode);
   }
   
   // Search method
   public boolean search(BTNode treeNode, int value) 
   {
       if (treeNode == null) 
       {
           return false;
       }
       if (treeNode.value == value) 
       {
           return true;
       }
       if (value < treeNode.value) 
       {
           return search(treeNode.leftLink, value);
       } 
       else 
       {
           return search(treeNode.rightLink, value);
       }
   }
   public boolean search(int value) 
   {
       return search(rootNode, value);
   }

   // Delete method
   public BTNode delete(BTNode rootNode, int value) 
   {
       if (rootNode == null) 
       {
           return null;
       }
       if (value < rootNode.value) 
       {
           rootNode.leftLink = delete(rootNode.leftLink, value);
       } 
       else if (value > rootNode.value) 
       {
           rootNode.rightLink = delete(rootNode.rightLink, value);
       } 
       else 
       {
           if (rootNode.leftLink == null) 
           {
               return rootNode.rightLink;
           } 
           else if (rootNode.rightLink == null) 
           {
               return rootNode.leftLink;
           }
           rootNode.value = minValue(rootNode.rightLink);
           rootNode.rightLink = delete(rootNode.rightLink, rootNode.value);
       }
       return rootNode;
   }
   public void delete(int value) 
   {
       rootNode = delete(rootNode, value);
   }
   private int minValue(BTNode treeNode) 
   {
       int minValue = treeNode.value;
       while (treeNode.leftLink != null) 
       {
           minValue = treeNode.leftLink.value;
           treeNode = treeNode.leftLink;
       }
       return minValue;
   }
}