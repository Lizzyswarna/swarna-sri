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

class DoublyCircularList 
{
    Node head = null;
    Node tail = null;

    public void addEnd(int data) 
	{
        Node newNode = new Node(data);
        if (head == null) 
		{
            head = newNode;
            tail = newNode;
            newNode.next = head;
            newNode.prev = tail;
        } 
		else 
		{
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
            tail = newNode;
        }
    }

    public void display() 
	{
        if (head == null) 
		{
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        System.out.print("List: ");
        for (;;) 
		{
            System.out.print(current.data + " <-> ");
            current = current.next;
            if (current == head) break;
        }
        System.out.println("(head)");
    }

    public static DoublyCircularList merge(DoublyCircularList list1, DoublyCircularList list2) 
	{
        DoublyCircularList merged = new DoublyCircularList();

        if (list1.head == null) return list2;
        if (list2.head == null) return list1;

        Node curr1 = list1.head;
        Node curr2 = list2.head;
        boolean done1 = false, done2 = false;

        while (!done1 || !done2) 
		{
            if (done1 || (!done2 && curr2.data < curr1.data)) 
			{
                merged.addEnd(curr2.data);
                curr2 = curr2.next;
                if (curr2 == list2.head) done2 = true;
            } 
			else 
			{
                merged.addEnd(curr1.data);
                curr1 = curr1.next;
                if (curr1 == list1.head) done1 = true;
            }
        }

        return merged;
    }
}

public class SimpleMergeDCLL 
{
    public static void main(String[] args) 
	{
        DoublyCircularList list1 = new DoublyCircularList();
        list1.addEnd(1);
        list1.addEnd(5);
        list1.addEnd(10);

        DoublyCircularList list2 = new DoublyCircularList();
        list2.addEnd(2);
        list2.addEnd(6);
        list2.addEnd(15);

        System.out.println("List 1:");
        list1.display();

        System.out.println("List 2:");
        list2.display();

        DoublyCircularList merged = DoublyCircularList.merge(list1, list2);
        System.out.println("Merged List:");
        merged.display();
    }
}