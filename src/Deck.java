/**
 * Created by Teacher on 1/7/2019.
 */
import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

    /**
     * cards contains all the cards in the deck.
     */
    private List<Card> cards;

    /**
     * size is the number of not-yet-dealt cards.
     * Cards are dealt from the top (highest index) down.
     * The next card to be dealt is at size - 1.
     */
    private int size;


    /**
     * Creates a new <code>Deck</code> instance.<BR>
     * It pairs each element of ranks with each element of suits,
     * and produces one of the corresponding card.
     * @param ranks is an array containing all of the card ranks.
     * @param suits is an array containing all of the card suits.
     * @param values is an array containing all of the card point values.
     */
    public Deck(String[] ranks, String[] suits, int[] values) {		//Constructor for arraylist of deck
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
    list<Card>Cards = new Arraylist<Card>();
	    for(int x=1;x<13;x++)
	    {
		    card.add(new card(rank[x],suits[y],value[x]));
		    if(x=13)
		    {
			y=1;
			    x=1;
		    }
	    }
    
    }


    /**
     * Determines if this deck is empty (no undealt cards).
     * @return true if this deck is empty, false otherwise.
     */
    public boolean isEmpty() {				//This method should return true when the size of the deck is 0; false otherwise.
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
    	if(Arraylist.length>0)
	{
		return false;
	}
    else
    {
	    return true; 
    }  
    }

    /**
     * Accesses the number of undealt cards in this deck.
     * @return the number of undealt cards in this deck.
     */
    public int size() {					//This method returns the number of cards in the deck that are left to be dealt.
	   /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      System.out.println(ArrayList.size());
    }

    /**
     * Randomly permute the given collection of cards
     * and reset the size to represent the entire deck.
     */
    public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
    }

    /**
     * Deals a card from this deck.
     * @return the card just dealt, or null if all the cards have been
     *         previously dealt.
     */
    public Card deal() {			//
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
   		double randomDouble = Math.Random();	//Work to get a random integer
	 	int randomInt = (int)(randomDouble *52);//
	    
	    List<Card>cards = new ArrayList2<card>();
	    while(ArrayList2.length<52)
	    {
		    ArrayList2.add(ArrayList.get(randomInt));//reprinting random cards from the ordered deck 
	    }
    }

    /**
     * Generates and returns a string representation of this deck.
     * @return a string representation of this deck.
     */
    @Override
    public String toString() {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
}
