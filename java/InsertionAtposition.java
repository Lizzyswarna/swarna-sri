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

class InsertionAtposition 
{
    Node head;

    public void insertAtPosition(int data, int position) 
	{
        Node nb = new Node(data);  

        if (position == 1) 
		{
            nb.next = head;
            head = nb;
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1; i++) 
		{
            if (temp == null) 
			{
                System.out.println("Position out of range!");
                return;
            }
            temp = temp.next;
        }

        nb.next = temp.next;
        temp.next = nb;
    }

    public void display() 
	{
        Node current = head;
        while (current != null) 
		{
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) 
	{
        InsertionAtposition list = new InsertionAtposition();

        list.insertAtPosition(10, 1); 
        list.insertAtPosition(20, 2); 
        list.insertAtPosition(30, 2); 
        list.insertAtPosition(40, 1); 

        list.display();
    }
}