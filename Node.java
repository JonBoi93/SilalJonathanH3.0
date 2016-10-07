public class Node
{
	// Kinds of data for the node
	private String data;
	private Node next;
	private Node previous;
	// constructor of Data
	   public Node(String Data)
		{
			data = Data;
			next = null;
			previous = null;
		}
// Constructor of data, previous, and next
		public Node(String Data, Node Previous, Node Next)
		{
			data = Data;
			previous = Previous;
			next = Next;
		}

}






