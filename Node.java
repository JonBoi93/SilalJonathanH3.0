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
	// Accesssors
	public String getData()
	{
		return data;
	}
	public Node getNext()
	{
		return next;
	}
	public Node getPrevious()
	{
	    return previous;
	}
	// Setters
	public void setData(String Data)
		{
			data = Data;
		}
	public void setNext(Node Next)
	{
		next = Next;
	}
	public void setPrevious(Node Previous)
		{
			previous = Previous;
		}
		// Compare your data
		public int Compare(String Data)
		{
			return Data.compareTo(data);
		}
		public int Compare(Node Compared)
		{
			return Compared.getData().compareTo(data);
		}
	}






