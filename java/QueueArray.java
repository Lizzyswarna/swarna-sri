import java.util.Scanner;

class Queue {
    int SIZE = 5;       // size of the queue
    int[] Q = new int[SIZE];
    int FRONT, REAR;

    // Constructor
    Queue() {
        FRONT = -1;
        REAR = -1;
    }

    // Enqueue operation
    void enqueue(int ITEM) {
        if (REAR == SIZE - 1) {   // Step 1: Check Overflow
            System.out.println("Queue is Full");
        } else {
            if (REAR == -1) {   // Step 3: First element insertion
                FRONT = 0;
                REAR = 0;
                Q[REAR] = ITEM;
            } else {   // Normal case
                REAR = REAR + 1;
                Q[REAR] = ITEM;
            }
            System.out.println(ITEM + " inserted into Queue");
        }
    }

    // Dequeue operation
    void dequeue() {
        if (FRONT == -1) {   // Step 1: Underflow
            System.out.println("Queue is Empty");
        } else {
            int deletedItem = Q[FRONT];
            if (FRONT == REAR) {   // Only one element
                FRONT = -1;
                REAR = -1;
            } else {
                FRONT = FRONT + 1;
            }
            System.out.println(deletedItem + " deleted from Queue");
        }
    }

    // Display operation
    void display() {
        if (FRONT == -1) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = FRONT; i <= REAR; i++) {
                System.out.print(Q[i] + " ");
            }
            System.out.println();
        }
    }
}

public class QueueArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int choice, item;

        while (true) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    item = sc.nextInt();
                    q.enqueue(item);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}