package linkedList;
import java.util.*;
public class usingCollections {
	public static void main(String []args) {
		LinkedList<Integer> mylist = new LinkedList<Integer>();
		Scanner input=new Scanner(System.in);
		char ch='y';
		do {
			System.out.println("Enter your choice\n"
					+ "1. Add Element at the end of the Linked list.\n"
					+ "2. Add Element at the given index. \n"
					+ "3. Add the element at the front of the linkedList\n"
					+ "4. Add the elements of the collection object to the linked list at the end of the list.(addAll)\n"
					+ "5. Add the elements of the collection object at the given index. \n"
					+ "6. Remove all the elements from the linked list.\n"
					+ "7. check whether the  element is in the linked List.\n"
					+ "8. Get the element at the given index.\n"
					+ "9. Get first element of the linked list.\n"
					+ "10. Get Last element of the linked list.\n"
					+ "11. Index of the element in the linked list.\n"
					+ "12. Index of the last occurrence of the specified element.\n"
					+ "13. POP first element of the linked list.\n"
					+ "14. POP last element of the linked List.\n"
					+ "15. Remove first element of the linked list.\n"
					+ "16. Remove last element of the linked list.\n"
					+ "17. Remove element at the given index.\n"
					+ "18. Remove specific element from the linked list.\n"
					+ "19. Remove first occurrence of the given element.\n"
					+ "20. Remove last occurrence of the given element. \n"
					+ "21. Update element at the specific index.\n"
					+ "22. print size of linked list\n"
					+ "23. Print the elements of the linked list using Iterator\n"
					+ "24. Store subList of linked list in new list\n"
					+ "25. Print linked list in reverse order\n");
			
			
				
				switch(input.nextInt()) {
				
				case 1:
					System.out.println("Enter element to be added");
					mylist.add(input.nextInt());
					break;
				case 2:
					System.out.println("Enter Index followed by element.");
					mylist.add(input.nextInt(),input.nextInt());
					break;
				case 4:
					System.out.println("Enter five Integers seperated by space");
					ArrayList<Integer> alist=new ArrayList<Integer>();
					for(int i=0;i<5;i++)
						alist.add(input.nextInt());
					mylist.addAll(alist);
					break;
				case 5:
					System.out.println("Enter five Integers seperated by space");
					ArrayList<Integer> a1list=new ArrayList<Integer>();
					for(int i=0;i<5;i++)
						a1list.add(input.nextInt());
					System.out.println("Enter the index where this list should be inserted");
					
					mylist.addAll(input.nextInt(),a1list);
					break;
				case 3:
					System.out.println("Enter Integer to be inserted at first");
					mylist.addFirst(input.nextInt());
					break;
				case 6:
					mylist.clear();
					break;
				case 7:
					System.out.println("Enter the element to be checked");
					int b=input.nextInt();
					System.out.println("Status of the element in linked list:"+mylist.contains(b));
					break;
				case 8:
					System.out.println("Enter the index");
					int var1=mylist.get(input.nextInt());
					System.out.println("Value at given index is"+var1);
					break;
				case 9:
					System.out.println("First element of the list is"+mylist.getFirst());
					break;
				case 10:
					System.out.println("Last element of the list is"+mylist.getLast());
					break;
				case 11:
					System.out.println("Enter the element to be searched in Linkedlist");
					int var2=input.nextInt();
					if(!mylist.contains(var2)) {System.out.println("The given element is not present in the list.");}
					else
						System.out.println("Index of the element in the list is "+mylist.indexOf(var2));
					break;
				case 12:
					System.out.println("Enter the element to be searched in Linkedlist");
					int var3=input.nextInt();
					if(!mylist.contains(var3)) 
						System.out.println("The given element is not present in the list.");
					else
						System.out.println("Index of the element in the list is "+mylist.lastIndexOf(var3));
				break;
				case 13:
					System.out.println("poped first item of list"+mylist.poll());
					break;
				case 14:
					System.out.println("Poped last item of the list"+mylist.pollLast());
					break;
				case 15:
					mylist.removeFirst();
					break;
				case 16:
					mylist.removeLast();
					break;
				case 17:
					System.out.println("Enter index");
					mylist.remove(input.nextInt());
					break;
				case 18:
					//System.out.println("Enter element to be removed");
					//mylist.remove(input.nextInt());
					break;
				case 19:
					System.out.println("Enter element whose first occurrence to be removed");
					mylist.removeFirstOccurrence(input.nextInt());
					break;
				case 20:
					System.out.println("Enter elemement whose last occurrence to be removed");
					mylist.removeLastOccurrence(input.nextInt());
					break;
				case 21:
					System.out.println("Enter index and value space seperated");
					
					mylist.set(input.nextInt(), input.nextInt());
					break;
				case 22:
					System.out.println(mylist.size());
					break;
				case 23:
					System.out.println("Printing elements of the Linked list using Iterator");
					Iterator i = mylist.iterator();
					while(i.hasNext())
						System.out.println(i.next());
					
					break;
				case 24:
					System.out.println("Enter from index and to index space separated");
					List ml=mylist.subList(input.nextInt(),input.nextInt());
					System.out.println("Elements of new list are:  "+ml);
					break;
				case 25:
					Iterator it=mylist.descendingIterator();
					while(it.hasNext())
						System.out.println(it.next());
					break;
					}
			
				System.out.println(mylist);
			
			System.out.println("Do you want to continue y or n");
			ch=input.next().toString().charAt(0);
			
			
			
		}while(ch=='y' || ch=='Y');
		
		
		
		
	}
}
