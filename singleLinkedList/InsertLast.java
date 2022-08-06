package singleLinkedList;

public class InsertLast {
	InsertLast head;
	int data;
	InsertLast next;
	public InsertLast(int data)
	{
		this.data=data;
		this.next=null;
	}
	public void display()
	{
		InsertLast current=head;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
	public void inserLast(int data)
	{
		InsertLast newNode=new InsertLast(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		InsertLast current =head;
		while(null!=current.next)
		{
			current=current.next;
		}
		current.next=newNode;
	}

}
