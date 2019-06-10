mport java.util.Iterator;

public class UsingTheList {
	
	
	
	public static Integer recursiveSum(IntegerLinkList list, Iterator<Integer> l) {
				
		if(!l.hasNext()) 
		
		return 0;
	
		else
			return l.next() + recursiveSum( list,l);
	}	
	
	
	
	
	
	public static void comparisionLists(IntegerLinkList list, int k) {
		IntegerLinkList lessers = new IntegerLinkList();
		IntegerLinkList greaters = new IntegerLinkList();
		IntegerLinkList equals = new IntegerLinkList();
		Iterator<Integer> l = list.iterator();
		Integer temp;
		while(l.hasNext()) {
			temp = l.next();
			if(temp < k)
				lessers.addToEnd(temp);
			else if(temp > k)
				greaters.addToEnd(temp);
			else
				equals.addToEnd(temp);
				
		}
		System.out.println("this is the list with values lesser than k");
		lessers.printList();
		System.out.println("this is the list with values greater than k");
		greaters.printList();
		System.out.println("this is the list with values equal than k");
		equals.printList();
		

  }
	
	public void invertList(IntegerLinkList list) {
		list.getHead().getNextNode();
	}
	
	public static void main(String[]args) {
		IntegerLinkList list = new IntegerLinkList();

	    list.addToFront(4);
	    list.addToFront(3);
	    list.addToFront(2);
	    list.addToFront(1);
	    list.addToFront(0);


	    Iterator<Integer> l = list.iterator();
	    
	    System.out.println(recursiveSum(list,l));
	    
	    comparisionLists(list,3);
	    

	}
}
