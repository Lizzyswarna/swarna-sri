import java.util.Stack;

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

public class PalindromeLinkedList 
{
    Node head;

    public void insert(int data) 
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

    public boolean isPalindrome() 
	{
        Stack<Integer> stack = new Stack<>();
        Node temp = head;

        while (temp != null) 
		{
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) 
		{
            int top = stack.pop();
            if (temp.data != top) 
			{
                return false;
            }
            temp = temp.next;
        }

        return true;
    }

    public void display() 
	{
        Node temp = head;
        while (temp != null) 
		{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) 
	{
        PalindromeLinkedList list = new PalindromeLinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(2);
        list.insert(1);

        System.out.print("Linked List: ");
        list.display();

        if (list.isPalindrome()) 
		{
            System.out.println("The linked list is a palindrome.");
        } 
		else 
		{
            System.out.println("The linked list is NOT a palindrome.");
        }
    }
}