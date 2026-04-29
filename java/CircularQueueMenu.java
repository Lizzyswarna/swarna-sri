import java.util.Scanner;

class CircularQueue {
    int size;
    int front, rear;
    int[] queue;

    // Constructor
    CircularQueue(int n) {
        size = n;
        front = -1;
        rear = -1;
        queue = new int[size];
    }

    // Enqueue operation
    void enqueue(int x) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is FULL!");
        } 
        else if (front == -1 && rear == -1) {
            front = rear = 0;
            queue[rear] = x;
            System.out.println(x + " enqueued.");
        } 
        else {
            rear = (rear + 1) % size;
            queue[rear] = x;
            System.out.println(x + " enqueued.");
        }
    }

    // Dequeue operation
    void dequeue() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is EMPTY!");
        } 
        else if (front == rear) {
            System.out.println(queue[front] + " dequeued.");
            front = rear = -1;
        } 
        else {
            System.out.println(queue[front] + " dequeued.");
            front = (front + 1) % size;
        }
    }

    // Display operation
    void display() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is EMPTY!");
            return;
        }
        System.out.print("Queue elements: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}

public class CircularQueueMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueue cq = new CircularQueue(5);

        int choice;
        do {
            System.out.println("\n--- Circular Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int x = sc.nextInt();
                    cq.enqueue(x);
                    break;

                case 2:
                    cq.dequeue();
                    break;

                case 3:
                    cq.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}