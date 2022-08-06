package singleLinkedList;
//Best approach to implement single linked list.

public class MyLinkedListExm2
{
   public Node head;
   int data;
   public MyLinkedListExm2(int data)
   {
	   this.data=data;
   }
   //method
   public void add(int data)
   {
	   if(this.head==null)
	   {
		   this.head=new Node(data);
	   }
	   else 
	   {
		   Node temp=new Node(data);
		   temp.next=this.head;
		   this.head=temp;
	   }
   }
	   public void print()
	   {
		   Node temp=this.head;
		   while(temp!=null)
		   {
			   System.out.print(temp.data+" ");
			   temp=temp.next;
		   }
	   }
}
