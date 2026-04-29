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

class InsertAtEnd 
{
    Node head;

    public void insertAtEnd(int data) 
	{
        Node nb = new Node(data);

        if (head == null) 
		{  
            head = nb;
        } 
		else 
		{
            Node temp = head;
            while (temp.next != null) 
			{  
                temp = temp.next;
            }
            temp.next = nb;  
        }
    }

    public void printList() 
	{
        Node temp = head;
        while (temp != null) 
		{
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) 
	{
        InsertAtEnd list = new InsertAtEnd();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.printList(); 
    }
}