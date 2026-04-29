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
class CircularLinkedList
{
	private Node head = null;
	private Node tail = null;
	
	public void insertAtEnd(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			tail = newNode;
			newNode.next = head;
		}
		else
		{
		tail.next = newNode;
		tail = newNode;
		tail.next = head;
		}
	}
	public void deleteAtEnd()
	{
		if (head == null)
		{
			system.out.println("List is empty.Nothing to delete.");
			return;
		}
		if (head == tail)
		{
			System.out.println("Deleted : " + head.data);
			head = null;
			tail = null;
			return;
		}
		Node current = head;
		for (; current.next != tail; current = current.next){}
		System.out.println("Deleted : " + tail.data);
		tail = current;
		tail.next = head;
	}
	public void display()
	{
		if (head == null)
		{
			System.out.println("List is Empty.");
			return;
		}
		Node current = head;
		System.out.print("Circular Linked List : ");
		for (;;) 
		{
			System.out.print(current.data + "->");
			current = current.next;
			if(current == head) break;
		}
		System.out.println("(head)");
	}
}
public class CircularLinkedListDemo
{
	public static void main(String[] args)
	{
		CircularLinkedList cll = new CircularLinkedList();
		
		cll.insertAtEnd(10);
		cll.insertAtEnd(20);
		cll.insertAtEnd(30);
		
		cll.display();
		
		cll.deleteAtEnd();
		cll.display();
		
		cll.deleteAtEnd();
		cll.display();
	}
}