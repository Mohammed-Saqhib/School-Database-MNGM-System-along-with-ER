import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("Diana");

        // Display the queue
        System.out.println("Queue: " + queue);

        // Peek the first element without removing it
        System.out.println("Peek: " + queue.peek());

        // Remove elements from the queue
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after removal: " + queue);

        // Add another element
        queue.add("Eve");
        System.out.println("Queue after adding Eve: " + queue);

        // Check if the queue contains a specific element
        System.out.println("Does the queue contain 'Charlie'? " + queue.contains("Charlie"));

        // Iterate over the queue
        System.out.println("Iterating over the queue:");
        for (String element : queue) {
            System.out.println(element);
        }

        // Clear the queue
        queue.clear();
        System.out.println("Queue after clearing: " + queue);
    }
}