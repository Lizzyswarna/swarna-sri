class Node 
{
    int data;
    Node next;

    Node(int data) 
	{
        this.data = data;
        this.next = null;
    }
}

class DeleteAtPosition 
{
    Node head;

    public void deleteAtPosition(int pos) 
	{
        if (head == null) 
		{
            System.out.println("List is empty.");
            return;
        }

        if (pos == 1) 
		{
            Node toDelete = head;
            head = head.next;
            System.out.println("Deleted element: " + toDelete.data);
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1; i++) 
		{
            if (temp.next == null) 
			{
                System.out.println("Error: Position out of bounds.");
                return;
            }
            temp = temp.next;
        }

        if (temp.next == null) 
		{
            System.out.println("Position out of bounds.");
            return;
        }

        Node toDelete = temp.next;
        temp.next = temp.next.next;
        System.out.println("Deleted element: " + toDelete.data);
    }

    public void display() 
	{
        Node temp = head;
        if (temp == null) 
		{
            System.out.println("List is empty.");
            return;
        }
        while (temp != null) 
		{
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();

		list.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		Node fifth = new Node(50);

		list.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		System.out.println("Original Linked List:");
		list.display();

		System.out.println("\nDeleting node at position 3...");
		list.deleteAtPosition(3);
		list.display();

		System.out.println("\nDeleting node at position 1...");
		list.deleteAtPosition(1);
		list.display();

		System.out.println("\nDeleting node at position 10 (invalid)...");
		list.deleteAtPosition(10);
		list.display();
	}
}