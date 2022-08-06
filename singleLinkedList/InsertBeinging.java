package singleLinkedList;

public class InsertBeinging {
	private InsertBeinging head;
    int data;
    InsertBeinging next;
    public InsertBeinging(int data)
    {
    	this.data=data;
    }
    
    public  void display()
    {
        InsertBeinging current=head;
        while(head!=null)
        {
        	try {
        	System.out.println(current.data+" ");
        	current=current.next;}
        	catch(NullPointerException e)
        	{
        		e.getStackTrace();
        	}
        }
    }
    public void insert(int data)
    {
    	InsertBeinging newNode=new InsertBeinging(data);
    	newNode.next=head;
    	head= newNode;
    }
}
		     
	
