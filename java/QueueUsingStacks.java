class QueueUsingStacks {
    private int[] s1, s2;
    private int top1, top2;
    private int size;

    public QueueUsingStacks(int capacity) {
        size = capacity;
        s1 = new int[size];
        s2 = new int[size];
        top1 = -1;
        top2 = -1;
    }

    // push element into stack
    private void push1(int x) {
        if (top1 == size - 1) {
            System.out.println("Stack Overflow on S1");
            return;
        }
        s1[++top1] = x;
    }

    private int pop1() {
        if (top1 == -1) {
            System.out.println("Stack Underflow on S1");
            return -1;
        }
        return s1[top1--];
    }

    private void push2(int x) {
        if (top2 == size - 1) {
            System.out.println("Stack Overflow on S2");
            return;
        }
        s2[++top2] = x;
    }

    private int pop2() {
        if (top2 == -1) {
            System.out.println("Stack Underflow on S2");
            return -1;
        }
        return s2[top2--];
    }

    // Enqueue operation
    public void enqueue(int x) {
        push1(x);
    }

    // Dequeue operation
    public int dequeue() {
        if (top1 == -1) {
            System.out.println("Queue is Empty");
            return -1;
        }

        // Move all from s1 -> s2
        while (top1 != -1) {
            push2(pop1());
        }

        // Pop from s2 (front of queue)
        int front = pop2();

        // Move back s2 -> s1
        while (top2 != -1) {
            push1(pop2());
        }

        return front;
    }

    // Display queue elements
    public void display() {
        if (top1 == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i <= top1; i++) {
            System.out.print(s1[i] + " ");
        }
        System.out.println();
    }

    // Test
    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks(10);

        q.enqueue(5);
        q.enqueue(2);
        q.enqueue(-1);
        q.dequeue();
        q.enqueue(7);

        q.display();
    }
}