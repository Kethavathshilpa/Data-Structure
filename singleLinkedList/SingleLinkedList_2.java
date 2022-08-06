package singleLinkedList;
//craete singlist 
public class SingleLinkedList_2 
{
	private ListNode2 head;
	private static class ListNode2
	{
		private int data;
		private ListNode2 next;
        public ListNode2(int data)
	    {
		    this.data=data;
		    this.next=null;
	    }
    }
	public void display()
	{
		ListNode2 current =head;
		while(current!=null)
		{
			System.out.println(current.data+" ");
			current=current.next;
		}
		System.out.println("null");
	}
public static void main(String[] args)
{
	SingleLinkedList_2 sll=new SingleLinkedList_2();
	sll.head=new ListNode2(10);
	ListNode2 second=new ListNode2(8);
	ListNode2 third=new ListNode2(1);
	ListNode2 fourth=new ListNode2(4);
    sll.head.next=second; 
    second.next=third;
    third.next=fourth;
    sll.display();
	
	
	
}
}
