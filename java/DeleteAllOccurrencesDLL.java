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
	
	public void addEnd(int data)
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

	public void deleteAll(int key)
	{
		if (head == null)
		{
			System.out.println("List is empty.");
			return;
		}
		Node current = head;
		boolean deleted = false;
	
		while(current != null)
		{
			if (current.data == key)
			{
				deleted = true;
				if(current == head)
				{
					head = head.next;
					if (head != null)	head.prev = null;
					else tail = null;
				}
				else if (current == tail)
				{ 
					tail = tail.prev;
					if (tail !=null) tail.next = null;
				}
				else
				{
					current.prev.next = current.next;
					current.next.prev = current.prev;
				}
			}
			current = current.next;
		}
		if (deleted)
			System.out.println("All occurrences of " + key + " deleted.");
		else
			System.out.println("key " + key + " not found.");
	}
	public void display()
	{
		if (head == null)
		{
				System.out.println("List is Empty.");
				return;
		}
		System.out.println("Doubly Linked List: ");
		for (Node current = head; current != null; current = current.next)
		{
				System.out.print(current.data + " -> ");
		}
			System.out.println("null");
	}
}

public class DeleteAllOccurrencesDLL
{
	public static void main(String[] args)
	{
		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.addEnd(10);
		dll.addEnd(20);
		dll.addEnd(10);
		dll.addEnd(30);
		dll.addEnd(10);
		
		System.out.println("Original List: ");
		dll.display();
		
		dll.deleteAll(10);
		
		System.out.println("Updated List : ");
		dll.display();
	}
}
