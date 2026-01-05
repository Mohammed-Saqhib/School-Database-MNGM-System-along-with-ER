import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("John");
        linkedList.add("Alice");
        linkedList.add("Bob");
        linkedList.add("Diana");

        // Display the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Add an element at a specific position
        linkedList.add(2, "Charlie");
        System.out.println("After adding Charlie at index 2: " + linkedList);

        // Access elements using get()
        System.out.println("Element at index 3: " + linkedList.get(3));

        // Update an element at a specific position
        linkedList.set(1, "Eve");
        System.out.println("After updating index 1 to Eve: " + linkedList);

        // Remove elements
        linkedList.remove("Bob"); // Remove by value
        System.out.println("After removing Bob: " + linkedList);
        linkedList.remove(2); // Remove by index
        System.out.println("After removing element at index 2: " + linkedList);

        // Check if the LinkedList contains an element
        System.out.println("Does the LinkedList contain 'Diana'? " + linkedList.contains("Diana"));

        // Iterate through the LinkedList
        System.out.println("Iterating through the LinkedList:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        // Clear the LinkedList
        linkedList.clear();
        System.out.println("LinkedList after clearing: " + linkedList);
    }
}