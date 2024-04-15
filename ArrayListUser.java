import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUser
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> itemList = new ArrayList<String>();

        itemList.add("Dog");
        itemList.add("Cat");
        itemList.add("Rabbit");

        System.out.println("Initial list: " + itemList);

        System.out.print("Enter an item to add to the list: ");
        String newItem = scanner.nextLine();
        itemList.add(newItem);
        System.out.println("List after adding '" + newItem + "': " + itemList);

        System.out.print("Enter an item to add to a specific position in the list: ");
        String newItemPosition = scanner.nextLine();
        System.out.print("Enter the position to add the item (starting from 1): ");
        int position = scanner.nextInt();
        if (position > 0 && position <= itemList.size()) 
        {
            itemList.add(position - 1, newItemPosition);
        } else 
        {
            System.out.println("Invalid position. Item not added.");
        }
        System.out.println("List after adding '" + newItemPosition + "' at position " + position + ": " + itemList);
        // Remove an item from the list by position number
        System.out.print("Enter the position of the item to remove: ");
        int removePosition = scanner.nextInt();
        if (removePosition > 0 && removePosition <= itemList.size()) 
        {
            itemList.remove(removePosition - 1);
        } 
        else 
        {
            System.out.println("Invalid position. No item removed.");
        }
        System.out.println("List after removing item at position " + removePosition + ": " + itemList);
        // Replace an item in the list by position number
        System.out.print("Enter the position of the item to replace: ");
        int replacePosition = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        if (replacePosition > 0 && replacePosition <= itemList.size()) 
        {
            System.out.print("Enter the new item: ");
            String newReplaceItem = scanner.nextLine();
            itemList.set(replacePosition - 1, newReplaceItem);
        }
        else 
        {
            System.out.println("Invalid position. No item replaced.");
        }
        System.out.println("List after replacing item at position " + replacePosition + ": " + itemList);
        // Print the size of the list
        System.out.println("Size of the list: " + itemList.size());
        scanner.close();
    }
}
