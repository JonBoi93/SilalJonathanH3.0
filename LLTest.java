
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
