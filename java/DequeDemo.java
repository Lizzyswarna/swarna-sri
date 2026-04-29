import java.util.Scanner;

class CircularDeque {
    private int[] deque;
    private int front, rear, size;

    // Constructor
    public CircularDeque(int n) {
        size = n;
        deque = new int[size];
        front = -1;
        rear = -1;
    }

    // Check full
    private boolean isFull() {
        return (front == (rear + 1) % size);
    }

    // Check empty
    private boolean isEmpty() {
        return (front == -1);
    }

    // Insert at front
    public void insertFront(int x) {
        if (isFull()) {
            System.out.println("Deque is Full");
            return;
        }
        if (isEmpty()) {   // First element
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = size - 1;
        } else {
            front = front - 1;
        }
        deque[front] = x;
    }

    // Insert at rear
    public void insertRear(int x) {
        if (isFull()) {
            System.out.println("Deque is Full");
            return;
        }
        if (isEmpty()) {   // First element
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % size;
        }
        deque[rear] = x;
    }

    // Delete from front
    public void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is Empty");
            return;
        }
        System.out.println("Deleted: " + deque[front]);
        if (front == rear) { // Only one element
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    // Delete from rear
    public void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is Empty");
            return;
        }
        System.out.println("Deleted: " + deque[rear]);
        if (front == rear) { // Only one element
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear = rear - 1;
        }
    }

    // Display elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is Empty");
            return;
        }
        System.out.print("Deque: ");
        int i = front;
        while (true) {
            System.out.print(deque[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}

public class DequeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Deque: ");
        int n = sc.nextInt();
        CircularDeque dq = new CircularDeque(n);

        while (true) {
            System.out.println("\n1.Insert Front  2.Insert Rear  3.Delete Front  4.Delete Rear  5.Display  6.Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter element: ");
                    dq.insertFront(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter element: ");
                    dq.insertRear(sc.nextInt());
                    break;
                case 3:
                    dq.deleteFront();
                    break;
                case 4:
                    dq.deleteRear();
                    break;
                case 5:
                    dq.display();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}