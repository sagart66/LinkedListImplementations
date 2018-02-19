package linkedList;
import java.util.Scanner;
public class MergeTwosortedLists {
	public static void main(String []args) {
		LinkList a = new LinkList();
		LinkList b=new LinkList();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of first linklist");
		int size1=input.nextInt();
		System.out.println("Enter "+size1+"in first linklist (Insert at end)");
		for(int i=0;i<size1;i++) {
			a.InsertAtEnd(input.nextInt());
		}	
		a.print("a");
		
		System.out.println("Enter size of Second linklist");
		int size2=input.nextInt();
		System.out.println("Enter "+size2+"in second linklist (Insert at end)");
		for(int i=0;i<size2;i++) {
			b.InsertAtEnd(input.nextInt());
		}
		b.print("b");
		Node temp1=a.head;
		Node temp2=b.head;
		int pos=1;
		while(temp2!=null) {
			if(temp1.next==null){temp1.next=temp2;break;}
			else if(temp2.data<temp1.data) {
				a.InsertAtpos(temp2.data, pos);
				temp2=temp2.next;
				pos++;
				
			}else {
				temp1=temp1.next;
				pos++;
			}
			
			
			
		}
		a.print("result");
		
		
	}
}