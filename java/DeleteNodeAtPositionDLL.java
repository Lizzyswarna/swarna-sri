class Node
{
	int data;
	Node next;
	Node prev;
	
	Node(int data)
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
	
	public void addEnd (int data)
	{
		Node newNode = new Node (data);
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
	public void deleteAtPosition(int position) 
	{
        if (head == null || position <= 0) 
		{
            System.out.println("Invalid position or list is empty.");
            return;
        }
		if (position == 1) 
		{
            System.out.println("Deleted: " + head.data);
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null; 
            return;
        }
		Node current = head;
        for (int i = 1; i < position - 1 && current.next != null; i++) 
		{
            current = current.next;
		}
		if (current.next == null) 
		{
            System.out.println("Position out of range.");
            return;
        }

        Node toDelete = current.next;
        System.out.println("Deleted: " + toDelete.data);
		current.next = toDelete.next;
        if (toDelete.next != null) 
		{
            toDelete.next.prev = current;
        } 
		else 
		{
            tail = current;
		}
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
public class DeleteNodeAtPositionDLL 
{
    public static void main(String[] args) 
	{
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.addEnd(10);
        dll.addEnd(20);
        dll.addEnd(30);
        dll.addEnd(40);

        System.out.println("Original List:");
        dll.display(); 

        dll.deleteAtPosition(1); 
        dll.display(); 

        dll.deleteAtPosition(2); 
        dll.display(); 
        dll.deleteAtPosition(5); 
        dll.display(); 
    }
}