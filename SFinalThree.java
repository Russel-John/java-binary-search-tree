import java.util.Scanner;
public class SFinalThree
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      BSTClass bat = new BSTClass();
      /*System.out.println("\nInorder: ");
      bat.inorder(bat.root);
      System.out.println("\nPreorder: ");
      bat.preorder(bat.root);
      System.out.println("\nPostorder: ");
      bat.postorder(bat.root);*/
      int stopper = 0;
      while(stopper != 1)
      {
         System.out.println("WELCOME TO THE TREE\n1. Insert\n2. Check number of nodes\n3. Check number of leaves\n4. Height check\n4. Search\n6. Exit");
         int choice = input.nextInt();
         switch(choice)
         {
            case 1:
               System.out.println("Enter the value to be inserted");
               int val = input.nextInt();
               bat.insert(val);
               
            break;
            case 2:
               System.out.println("Node count: " + bat.getNodeCount());  
            break;
            case 3:
               System.out.println("Leaf count: " + bat.getLeafCount());
            break;
            case 4:
            
            break;
            case 5:
            
            break;
            case 6:
            stopper = 1;
            break;
            default:
            System.out.println("ERROR! INVALID INPUT");
            break;
         }
      }
   }
}