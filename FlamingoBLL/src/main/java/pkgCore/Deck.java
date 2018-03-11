package pkgCore;
import java.util.ArrayList;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	ArrayList<Card> cards = new ArrayList<Card>();
	private int numberOfCards;
	
	public Deck(int decknumber) {
		for (int i = 0; i < decknumber; i++) {
			for(eSuit Suit : eSuit.values()) {
				
				for(eRank Rank : eRank.values()) {
					Card newcard = new Card(Rank, Suit);
					cards.add(newcard);
				}
				
			}
			
		}
	}
	
	public Card draw() {
		Card aDraw = cards.get(0);
		numberOfCards--;
		cards.remove(aDraw);
		return aDraw;
	}	
	
	public int getRemaining(Object eNum) {
		int count = 0;
		if ( eNum instanceof eSuit) {
			for (Card c:cards){
				if (c.geteSuit().equals(eNum)){
					count++;
				}
			}
		}
		else if (eNum instanceof eRank) {
			for (Card c:cards){
				if (c.geteRank().equals(eNum)){
					count++;
				}
			}
		}
		return count;
	}
	
}
