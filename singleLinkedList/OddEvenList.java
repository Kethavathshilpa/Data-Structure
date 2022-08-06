package singleLinkedList;

public class OddEvenList {
	OddEvenList head;
	OddEvenList next;
	int val;
	public OddEvenList(int val)
	{
		this.val=val;
	}
	public void iterator(OddEvenList head)
	{
		while(head!=null)
		{
			System.out.println(head.val);
			head=head.next;
		}
	}
	public OddEvenList oddevenList(OddEvenList head)
	{
		if(head==null)
			return null;
		OddEvenList head1=null;
		OddEvenList head2=null;
		OddEvenList ptr=null;
		OddEvenList l1=null;
		OddEvenList l2=null;
		Boolean flag=Boolean.TRUE;
		
		while(head!=null)
		{
			ptr=head;
			head=head.next;
			ptr.next=null;
			if(flag)
			{
				if(head1==null)
				{
					head1=ptr;
					l1=ptr;
				}
				else 
				{
					l1.next=ptr;
					l1=l1.next;
				}
				flag=Boolean.FALSE;
			}
			else
			{
				if(head2==null)
				{
					head2=ptr;
					l2=ptr;
				}
				else
				{
					l2.next=ptr;
					l2=l2.next;
				}
				flag=Boolean.TRUE;
			}
		 }
		if(l1!=null)
		    l1.next=head2;
		
		return head1;
	}
}
 