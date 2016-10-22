public class lists{
	private Node head;
	private Node tail;
	private int nodeCount;
	{
		head = null;
		tail = null;
	}
	public lists()
	{
		nodeCount = 0;
		head = null;
		tail = null;
	}
	public int size()
	{
		return nodeCount;
	}
	public boolean isEmpty()
	{
		return (head != null);
	}
	public void printForward()
	{
		Node seek = head;
		while (seek != null)
	{
		System.out.println("  " + seek.getData());
		seek = seek.getNext();
	}
}
public void printReverse()
{
	Node seek = tail;
	while (seek != null)
	{
		System.out.println(" " + seek.getData());
		seek = seek.getPrevious();
	}
}
public boolean contains(String data)
{
	Node seek = head;
	boolean found = false;
	while (seek != null && !found)
	{
		int cmp = seek.getData().compareTo(data);
		if (cmp == 0)
		{
			found = true;
		}
		else if (cmp > 0)
			 {
				 break;
			 }
			 seek.getNext();
		 }
		 return found;
	 }
	 public void remove(String data)
	 {
		 Node seek = head;
		 boolean found = false;
		 while (seek != null && !found)
		 {
			 int cmp = seek.getData().compareTo(data);
			 if (cmp == 0)
			 {
				 found = true;
				 System.out.println("Found the node with value of " + data);
			 }
			 else if (cmp > 0)
			 {
				 break;
			 }
			 else
			 {
				 seek = seek.getNext();
			 }
		 }
		 if (found)
		 {
			 System.out.println("Removing the node");
			 Node nextNode = seek.getNext();
			 Node previousNode = seek.getPrevious();
			 if (previousNode == null)
			 {
				 head = nextNode;
			 }
			 else
			 {
				 previousNode.setNext(nextNode);
			 }
			 if (nextNode == null)
			 {
				 tail = previousNode;
			 }
			 else
			 {
				 nextNode.setPrevious(previousNode);
			 }
			 seek = null;
			 nodeCount--;
		 }
	 }
	 public void  removeAll()
	 {
		 while (head != null)
		 {
			 System.out.println("Removing node with data " + head.getData());
			 Node nextNode = head.getNext();
			 if (nextNode == null)
			 {
				 tail = null;
				 head = null;
			 }
			 else
			 {
				 nextNode.setPrevious(null);
			 }
			 head = nextNode;
		 }
	 }
	 public void add (String data)
	 {
		 Node newNode = new Node(data);
		 Node seek;
		 boolean inserted = false;

		 if (head == null)
		 {
			 System.out.println( "Setting as first node" + data);
			 newNode.setNext(head);
			 head.setPrevious(newNode);
			 head = newNode;
		 }
		 Node follower = head;
		 seek = head.getNext();
		 while (seek !=null && !inserted)
		 {
			 if (follower.getData().compareTo(data) <= 0 && seek.getData().compareTo(data) >= 0)
			 {
				 System.out.println( "Setting as middle node" + data);
				 follower.setNext(newNode);
				 newNode.setPrevious(follower);
				 newNode.setNext(seek);
				 seek.setPrevious(newNode);
				 inserted = true;
			 }
			 else
			 {
				 follower = seek;
				 seek = seek.getNext();
			 }
		 }
		 if (!inserted)
		 {
			 System.out.println( "Setting as last node" + data);
			 follower.setNext(newNode);
			 newNode.setPrevious(follower);
			 tail = newNode;
		 }
		 nodeCount++;
	 }
}










