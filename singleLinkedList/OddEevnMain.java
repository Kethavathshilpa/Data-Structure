package singleLinkedList;

public class OddEevnMain {
    public static void main(String[] args)
    {
    	OddEvenList oddeven=new OddEvenList(6);
    	oddeven.next=new OddEvenList(2);
    	oddeven.next.next=new OddEvenList(12);
    	oddeven.next.next.next=new OddEvenList(9);
    	oddeven.next.next.next.next=new OddEvenList(23);
    	oddeven.next.next.next.next.next=new OddEvenList(92);

    	oddeven.oddevenList(oddeven);
    	oddeven.iterator(oddeven);
    }
}
