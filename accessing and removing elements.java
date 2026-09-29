import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Original List: " + list);

        // Access elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // Remove first element
        list.removeFirst();
        System.out.println("After removing first: " + list);

        // Remove last element
        list.removeLast();
        System.out.println("After removing last: " + list);

        // Remove element by value
        list.remove("Banana");
        System.out.println("After removing Banana: " + list);

        // Add another element
        list.add("Grapes");

        // Remove element by index
        list.remove(0);
        System.out.println("After removing index 0: " + list);
    }
}
