class Node
{
	int data;
	Node next;
	Node prev;
	
	Node (int data)
	{
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}
class DoublyLinkedList
{
	private Node head = null;
    private Node tail = null;
	
	public void insertAtEnd(int data) 
	{
        Node newNode = new Node(data);
        if (head == null) 
		{ 
            head = newNode;
            tail = newNode;
        } 
		else 
		{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
	public void deleteAtEnd() 
	{
        if (tail == null) 
		{
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        System.out.println("Deleted: " + tail.data);
        tail = tail.prev;
        if (tail != null) tail.next = null;
        else head = null; 
    }
	public void display() 
	{
        if (head == null) 
		{
            System.out.println("List is empty.");
            return;
        }
        System.out.print("Doubly Linked List: ");
        for (Node current = head; current != null; current = current.next) 
		{
            System.out.print(current.data + " -> ");
        }
        System.out.println("null");
    }
}
public class SimpleDoublyLinkedList 
{
    public static void main(String[] args) 
	{
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);

        dll.display(); 
        dll.deleteAtEnd(); 
        dll.display(); 

        dll.deleteAtEnd(); 
        dll.display(); 
	}
}