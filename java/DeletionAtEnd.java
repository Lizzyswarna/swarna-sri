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

class LinkedList 
{
    Node head;

    public void insertAtEnd(int data) 
	{
        Node newNode = new Node(data);
        if (head == null) 
		{
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) 
		{
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void deleteFromEnd() 
	{
        if (head == null) 
		{ 
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        Node temp = head;
        Node prevNode = null;

        while (temp.next != null) 
		{
            prevNode = temp;
            temp = temp.next;
        }

        if (temp == head) 
		{
            System.out.println("Deleted element: " + temp.data);
            head = null;
        }
		else 
		{
            System.out.println("Deleted element: " + temp.data);
            prevNode.next = null; 
        }
    }

    public void display() 
	{
        if (head == null) 
		{
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) 
		{
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class DeletionAtEnd 
{
    public static void main(String[] args) 
	{
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println("Original list:");
        list.display();

        list.deleteFromEnd();
        System.out.println("After deleting last element:");
        list.display();

        list.deleteFromEnd();
        System.out.println("After deleting last element again:");
        list.display();

        list.deleteFromEnd();
        System.out.println("After deleting last element once more:");
        list.display();
    }
}