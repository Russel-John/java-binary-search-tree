import java.util.Scanner;
public class SFinalThree
{
   public static void main(String[] args)
   {
      Scanner scannerInput = new Scanner(System.in);
      BSTClass binarySearchTree = new BSTClass();
      int exitFlag = 0;
      while(exitFlag != 1)
      {
         System.out.println("WELCOME TO THE TREE");
         System.out.println("1. Insert");
         System.out.println("2. Check number of nodes");
         System.out.println("3. Check number of leaves");
         System.out.println("4. Height check");
         System.out.println("5. Search");
         System.out.println("6. Delete");
         System.out.println("7. Exit");
         
         int userChoice = scannerInput.nextInt();
         switch(userChoice)
         {
            case 1:
               System.out.println("Enter the value to be inserted");
               int inputValue = scannerInput.nextInt();
               binarySearchTree.insert(inputValue);
               
            break;
            case 2:
               System.out.println("Node count: " + binarySearchTree.getNodeCount());  
            break;
            case 3:
               System.out.println("Leaf count: " + binarySearchTree.getLeafCount());
            break;
            case 4:
               System.out.println("Tree height: " + binarySearchTree.height());
            break;
            case 5:
               System.out.println("Enter the value to search");
               int searchValue = scannerInput.nextInt();
               boolean found = binarySearchTree.search(searchValue);
               if (found) {
                   System.out.println("Value found in the tree.");
               } else {
                   System.out.println("Value not found in the tree.");
               }
            break;
            case 6:
               System.out.println("Enter the value to delete");
               int deleteValue = scannerInput.nextInt();
               binarySearchTree.delete(deleteValue);
               System.out.println("Value deleted from the tree.");
            break;
            case 7:
               exitFlag = 1;
            break;
            default:
            System.out.println("ERROR! INVALID INPUT");
            break;
         }
      }
   }
}