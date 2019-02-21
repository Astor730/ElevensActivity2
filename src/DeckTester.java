/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args)
    {
        String[] ranks1 ={"A","B","C"};
        String[] suits1 = {"Girafes","Lions"};
        int[] values1 = {2,1,6};
        String[] ranks2 = {"Jack","Queen","King"};
        String[] suits2 = {"Spades","Hearts"};
        int[] values2 = {11,12,13};
		Deck a = new Deck(ranks1,suits1,values1);
		Deck b = new Deck(ranks2,suits2,values2);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a.deal());
		System.out.println(b.deal());
    }
}

