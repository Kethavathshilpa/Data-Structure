package singleLinkedList;

public class MiddleElementMain {
	public static void main(String[] arg)
	{
		FindMiddleElement head1=new FindMiddleElement(10);
		head1.next=new FindMiddleElement(20);
		head1.next.next=new FindMiddleElement(39);
		//head1.next.next.next=new FindMiddleElement(65);
		head1.iterate(head1.next);
		System.out.println("size of the list="+head1.getListSize(head1));
		System.out.println("middle elemet of the list="+ head1.getMiddleNode(head1));
	}

}
