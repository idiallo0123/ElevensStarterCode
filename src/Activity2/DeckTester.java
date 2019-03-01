package Activity2;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        String[] ranks = new ranks[12];
        String[] suits = new suits[4];
        int[] values = new values[12];

        Deck deck1 = new Deck(ranks, suits, values);

        //Print list
        /*for(int i=0; i< Deck.cards.size(); i++)
        {
            System.out.println(cards.get(i));
        }*/
        System.out.println(deck1);

        //Shuffle
        deck1.shuffle();

        //Print list again
        /*for(int i=0; i< cards.size(); i++)
        {
            System.out.println(cards.get(i));
        }*/
        System.out.println(deck1);
    }
}

