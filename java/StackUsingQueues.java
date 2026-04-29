class StackUsingQueue {
    int size;
    int[] q1;
    int[] q2;
    int front1, rear1;
    int front2, rear2;

    public StackUsingQueue(int size) {
        this.size = size;
        q1 = new int[size];
        q2 = new int[size];
        front1 = rear1 = -1;
        front2 = rear2 = -1;
    }

    // Queue 1 operations
    boolean isEmpty1() {
        return front1 == -1;
    }
    boolean isFull1() {
        return rear1 == size - 1;
    }
    void enqueue1(int x) {
        if (isFull1()) {
            System.out.println("Queue1 Overflow");
            return;
        }
        if (front1 == -1) front1 = 0;
        q1[++rear1] = x;
    }
    int dequeue1() {
        if (isEmpty1()) return -1;
        int val = q1[front1];
        if (front1 == rear1) front1 = rear1 = -1;
        else front1++;
        return val;
    }

    // Queue 2 operations
    boolean isEmpty2() {
        return front2 == -1;
    }
    boolean isFull2() {
        return rear2 == size - 1;
    }
    void enqueue2(int x) {
        if (isFull2()) {
            System.out.println("Queue2 Overflow");
            return;
        }
        if (front2 == -1) front2 = 0;
        q2[++rear2] = x;
    }
    int dequeue2() {
        if (isEmpty2()) return -1;
        int val = q2[front2];
        if (front2 == rear2) front2 = rear2 = -1;
        else front2++;
        return val;
    }

    // Push operation
    void push(int x) {
        // Step 1: Move all elements from q1 → q2
        while (!isEmpty1()) {
            enqueue2(dequeue1());
        }

        // Step 2: Add new element into q1
        enqueue1(x);

        // Step 3: Move everything back q2 → q1
        while (!isEmpty2()) {
            enqueue1(dequeue2());
        }
    }

    // Pop operation
    int pop() {
        if (isEmpty1()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return dequeue1();
    }

    // Peek operation
    int top() {
        if (isEmpty1()) return -1;
        return q1[front1];
    }

    // Display stack
    void display() {
        if (isEmpty1()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = front1; i <= rear1; i++) {
            System.out.print(q1[i] + " ");
        }
        System.out.println();
    }
}

public class StackUsingQueues {
    public static void main(String[] args) {
        StackUsingQueue st = new StackUsingQueue(5);

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.print("Stack after pushes: ");
        st.display();

        System.out.println("Top element: " + st.top());

        System.out.println("Popped: " + st.pop());
        System.out.print("Stack after pop: ");
        st.display();
    }
}