import java.util.Scanner;

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

    public void deleteAtFront() 
	{
        if (head == null) 
		{
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        System.out.println("Deleted element: " + head.data);
        head = head.next;
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

public class DeletionAtFront 
{ 
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) 
		{
            System.out.print("Enter data for node " + i + ": ");
            int data = sc.nextInt();
            list.insertAtEnd(data); 
        }

        System.out.println("\nOriginal list:");
        list.display();

        list.deleteAtFront();
        System.out.println("\nAfter deleting front element:");
        list.display();
        
        sc.close();
    }
}
