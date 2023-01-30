class SinglyLinkList
{
	class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
			
		}
	}
	public Node head=null;
	public Node tail=null;
	
	public void addNode(int data)
	{
		Node newNode=new Node(data);
		
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
		}
	}
	public void display()
	{
		Node current=head;
		
		if(head==null)
		{
			System.out.println("List is Empty");
			return;
		}
		System.out.println();

		
			while(current!=null)
			{
				System.out.print(current.data+"=>");
				current=current.next;
			}
			System.out.println();
		
	}
	public void addEmpty(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			newNode.next=head;
			head=newNode;
			
		}
	}
	
	public void addBegine(int data)
	{
		Node newNode=new Node(data);
		Node current=head;
		if(current==head)
		newNode.next=head;
		head=newNode;
		
		
	}
	
	
	public void addParticularPosition(int position,int data)
	{
		Node newNode=new Node(data);
		Node current=head;
		
		for(int i=1;i<position-1;i++)
		{
			current=current.next;
		}
		newNode.next=current.next;
		current.next=newNode;
	}
	
	public void addEnd(int data)
	{
		Node newNode=new Node(data);
		Node current=head;
		
		while(current.next!=null)
		{
			current=current.next;
		}
		newNode.next=current.next;
		current.next=newNode;
		newNode.next=null;
	}
	
	public void DeleteEmpty()
	{
		if(head==null)
		{
			System.out.println("There are no Element to Delete Anything:");
		}
	}
	public void DeleteBegining()
	{
		head=head.next;
	}
	public void DeleteParticularPosition(int position)
	{
		Node current=head;
		
		
		for(int i=1;i<position-1;i++)
		{
	      current=current.next;
		}
		
		current.next=current.next.next;
		
	}
	
	public void DeleteEnd()
	{
		Node current=head;
		
		while(current.next.next!=null)
		{
			current=current.next;
		}
		current.next=null;
		
	}
}

class TestSinglylist
{
	public static void main(String arga[])
	{
		SinglyLinkList ls=new SinglyLinkList();
		ls.addNode(3);
		ls.addNode(5);
		ls.addNode(8);
		ls.addNode(9);
        ls.addNode(1);		
		
		ls.display();
		System.out.println("=====================");
		
		//Inserting  data
		SinglyLinkList list1=new SinglyLinkList();
		list1.display();
		System.out.print("After the Add data for Empty List:");
		//add data for Empty List
		list1.addEmpty(4);
		list1.display();
		
		System.out.println("=====================");
		SinglyLinkList list2=new SinglyLinkList();
		list2.addNode(3);
		list2.addNode(5);
		list2.addNode(8);
		list2.addNode(9);
        list2.addNode(1);		
		list2.display();
		
		//add data for Beinning.
		System.out.print("After the Adding data  for Beginning at List:");
		list2.addBegine(6);
		list2.display();
		System.out.println("=====================");
		
		SinglyLinkList list3=new SinglyLinkList();
		list3.addNode(3);
		list3.addNode(5);
		list3.addNode(8);
		list3.addNode(9);
        list3.addNode(1);		
		list3.display();
		
		//add data for Particular Position.
		list3.addParticularPosition(2,2);
		System.out.print("After the Adding data  for Particular Position:");
		list3.display();
		//add data for End
	    list3.addEnd(7);
		System.out.print("After the Adding data  for End:");
		list3.display();
		
		System.out.println("=====================");
		
		
		//Deleting
		SinglyLinkList list4=new SinglyLinkList();
	    list4.DeleteEmpty();
		list4.addNode(3);
		list4.addNode(5);
		list4.addNode(8);
		list4.addNode(9);
        list4.addNode(1);		
		list4.display();
		//Deleting data at Begining
		list4.DeleteBegining();
		System.out.println("Deleting First data from List:");
		list4.display();
		System.out.println("=====================");
		//Deleting data from Particular Position
		SinglyLinkList list5=new SinglyLinkList();
		list5.addNode(3);
		list5.addNode(5);
		list5.addNode(8);
		list5.addNode(9);
        list5.addNode(1);		
		list5.display();
		list5.DeleteParticularPosition(3);
		System.out.println("Deleting Third data from List:");
		list5.display();
		
		System.out.println("=====================");
		//Delete Data from End
		list5.DeleteEnd();
		System.out.println("Deleting Last data from List:");
		list5.display();
		
		///I am Adding new Changes for this text file...
		
	}
}