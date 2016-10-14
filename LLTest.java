public class LLTest
{
	public static void main (String [] args)
	{
		Node tryNode = new Node("try");
	    System.out.println(tryNode.getData());
	    linkedlists ll = new linkedlists();
	    addToListPrint("Jonathan", ll);
	    addToListPrint("Mark", ll);
	    addToListPrint("Paul", ll);
	    addToListPrint("Tom", ll);
	    addToListPrint("Chris", ll);
	    System.out.println(" List amount is currently " + ll.size());
	    System.out.println(" Does the list contain Jordan? " + ll.contains("Jordan"));
	    System.out.println(" Does the list contain Jonathan? " + ll.contains("Jonathan"));
	    removeFromListPrint("Jonathan", ll);
	    System.out.println(" List amount is currently " + ll.size());
	    System.out.println(" Does the list contain Jonathan? " + ll.contains("Jonathan"));
	    removeFromListPrint("Paul", ll);
	    removeFromListPrint("Tom", ll);

	    System.out.println( "Deleting items from list");
	    ll.removeAll();
	    System.out.println("Print list( should be cleared)");
	    printFB(ll);
	}
	private static void printFB(linkedlists ll)
	{
		System.out.println( " ++++++++++++ ");
		System.out.println( " Print Forward ");
		ll.printForward();
		System.out.println( " >>>>>>>>>>>> ");
		System.out.println( " Print Reverse ");
		ll.printReverse();
		System.out.println( " ============= ");
	}
	private static void addToListPrint(String word, linkedlists ll)
	{
		System.out.println("Insert" + word);
		ll.add(word);
		printFB(ll);
	}
	private static void removeFromListPrint(String word, linkedlists ll)
		{
			System.out.println(" Get rid of " + word);
			ll.remove(word);
			printFB(ll);
		}
	}
