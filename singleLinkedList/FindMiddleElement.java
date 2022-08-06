package singleLinkedList;
 class FindMiddleElement
 {
	 FindMiddleElement head;
	 int data;
	 FindMiddleElement next;
	 public FindMiddleElement(int data)
	 {
		 this.data=data;
	 }
	 public void iterate(FindMiddleElement head)
	 {
		 while(head!=null)
		 {
			 System.out.println(head.data+" ");
			 head=head.next;
		 }
	 }
	 public int getListSize(FindMiddleElement head)
	 {
		 int count=0;
		 while(head!=null)
		 {
			 count++;
			 head=head.next;
		 }
		 
	  return count;
	 }
	 public int getKthNode(FindMiddleElement head ,int k)
	 {
		 if(k<=0)
			 return -1;
		 while(head!=null) {
		      k=k-1;
		    if(k==0)
		    	break;
		    head=head.next;
		   }
		 if(head==null)
			 return -1;
		 return head.data;
      }
    public int getMiddleNode(FindMiddleElement head)
    {
    	if(head==null)
    		return -1;
    	
    	int size=getListSize(head);
    	int middle =size/2;
    	
    	if(middle==0)
    		return head.data;
    	
    	return getKthNode(head,middle+1);
     
    }
  }
  