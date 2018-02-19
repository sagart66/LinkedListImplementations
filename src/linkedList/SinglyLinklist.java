package linkedList;
import java.util.Scanner;

class Node{
	
	 int data;
	 Node next;
	public Node() {
		data=0;
		next=null;
	}
	public Node(int d,Node n) {
		data=d;
		next=n;	
	}
	public Node(int d) {
		data=d;
		next=null;
	}

}

//Class link list
class LinkList{
	 Node head;
	 Node end;
	 int size;
	public LinkList(){
		head=null;
		size=0;
	}
	public boolean isEmpty() {
		if(head==null) return true;
		return false;
	}
	
	//Function to insert element at beginning
	public void InsertAtBeginning(int val) {
		Node temp = new Node(val,head);
		if(head==null) end=temp;
		head=temp;
		size++;

	}
	// Function to insert element at end
	public void InsertAtEnd(int val) {
		Node node=new Node(val);
		if(head==null) InsertAtBeginning(val);
		else {
		end.next=node;
		end=node;
		size++;
		}
	}
	//Function to insert element at given position
	public void InsertAtpos(int val,int pos) {
		pos--;
		if(pos<0 || pos>size+1) System.out.println("Invalid position!!");
		else if(pos==0) InsertAtBeginning(val);
		else if(pos==(size+1)) InsertAtEnd(val);
		else {
		//pos--;
		Node temp=head;
		while(pos>1) {
			temp=temp.next;
			pos--;
		}
		Node node=new Node(val);
		Node next;
		next=temp.next;
		temp.next=node;
		node.next=next;	
		size++;
		
		}
	}
	
	public void DeleteFromBeginning() {
		 head=head.next;size--;
	}
	public void DeleteFromEnd() {
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		end=temp;
		temp.next=null;
		
		size--;
	}
	
	public void DeleteAtpos(int pos) {
		Node temp=head;
		if(pos<0 || pos>size) System.out.println("Invalid position!!");
		//else if(pos>size) System.out.println("Invalid position!!");
				
		else if(pos==0)  DeleteFromBeginning();
			
		else if(pos==size) DeleteFromEnd();
		else {
		pos--;
		while(pos>1) {
			temp=temp.next;
			pos--;
		}
		temp.next=temp.next.next;
		size--;
		}
	}
	public void print(String a) {
		Node temp=head;
		if(isEmpty()) {
			System.out.println("Linked list is Empty"); return;
		}
		
		
		
		System.out.print("Content of linkList "+a+": ");
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
			
		}
		System.out.println();;
		
		
	}
	
}
public class SinglyLinklist {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		LinkList list=new LinkList();
		System.out.println("Singly Linked List Test");
		int choice=0;
		do {
			System.out.println("Singly Linked operation Enter choice\n"
					+ "1. Insert at Beginning\n"
					+ "2. Insert at End\n"
					+ "3. Insert at Position\n"
					+ "4. Delete From Beginning\n"
					+ "5. Delete From End\n"
					+ "6. Delete at Position\n"
					+ "7. Check Empty\n"
					+ "8. Get size\n"
					+ "-1.Exit program\n");
			choice =input.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Enter a Integer to be inserted");
				list.InsertAtBeginning(input.nextInt());
				break;
			case 2:
				System.out.println("Enter a Integer to be inserted");
				list.InsertAtEnd(input.nextInt());
				break;
			case 3:
				System.out.println("Enter a number and position");
				list.InsertAtpos(input.nextInt(),input.nextInt());
				break;
			case 4:
				list.DeleteFromBeginning();
				break;
			case 5:
				list.DeleteFromEnd();
				break;
			case 6:
				System.out.println("Enter a position to be deleted");
				list.DeleteAtpos(input.nextInt());
				break;
			case 7:
				System.out.println("Empty Status = "+list.isEmpty() );
				break;
			case 8:
				System.out.println("Size of linked list = "+list.size);
				break;
			}
		
			list.print(" ");
			
		}
			while(choice!=-1);
		
		}
	}
	

