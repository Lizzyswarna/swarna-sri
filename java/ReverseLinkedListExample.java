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

    void insert(int data) 
	{
        Node newNode = new Node(data);
        if (head == null) 
		{
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    void reverse() 
	{
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) 
		{
            next = current.next;    
            current.next = prev;    
            prev = current;
            current = next;         
        }

        head = prev; 
    }

    void display() 
	{
        Node temp = head;
        while (temp != null) 
		{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class ReverseLinkedListExample 
{
    public static void main(String[] args) 
	{
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.print("Original List: ");
        list.display();

        list.reverse();

        System.out.print("Reversed List: ");
        list.display();
    }
}