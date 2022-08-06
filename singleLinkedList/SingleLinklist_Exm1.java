package singleLinkedList;
class Node
{
	public int data;
	public Node next;
	public Node(int data)
	{
		this.data=data;
	}
}
public class SingleLinklist_Exm1 {
	public static void main(String[] args)
	{
		Node n1=new Node(10);
		n1.next=new Node(20);
		n1.next.next=new Node(30);
		n1.next.next.next=new Node(40);
		n1.next.next.next.next=new Node(50);
		Node temp=n1;
		
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}

     }

}
