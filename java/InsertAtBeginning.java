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

class InsertAtBeginning 
{
    Node head;

    public void insertAtBeginning(int data) 
	{
        Node nb = new Node(data);
        nb.next = head;
        head = nb;
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
        InsertAtBeginning list = new InsertAtBeginning();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);

        list.printList(); 
    }
}