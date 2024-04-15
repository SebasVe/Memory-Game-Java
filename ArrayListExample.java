import java.util.ArrayList;

public class ArrayListExample 
{  
    public static void main(String args[]) 
    {  
        ArrayList<String> animalList = new ArrayList<String>();  
        animalList.add("Dog");
        animalList.add("Cat");
        animalList.add("Rabbit");
        animalList.add("Frog");
        animalList.add("Horse");
        animalList.add("Cow");
        
        System.out.println("Original list: " + animalList);
        animalList.add("bird");
        System.out.println("List after adding bird: " + animalList);
        animalList.add(3, "snake");
        System.out.println("List after adding 'snake' at the fourth position: " + animalList);        
        System.out.println("Second item: " + animalList.get(1));
        System.out.println("Third item: " + animalList.get(2));
        System.out.println("Fifth item: " + animalList.get(4));        
        animalList.remove("Frog");
        System.out.println("List after removing 'Frog': " + animalList);        
        System.out.println("Size of the list: " + animalList.size());
    }  
} 
