package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgCore.*;
import pkgEnum.eRank;


/*Jonni Tran
 * Veronica Parker
 * Qizhe
 * ZhaoYuan Wang
 */

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hand()
	{
		
	}
	
	public int[] ScoreHand()
	{
		int [] iScore = new int[2];
		
		iScore[0] = 0;
		iScore[1] = 0;
		
		Collections.sort(cards);
		
		
		for (Card c: cards)
		{
			switch(c.geteRank()) {
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
			case TEN:
				iScore[0] += c.geteRank().getiRankNbr();
				iScore[1] += c.geteRank().getiRankNbr();
				break;
			case JACK:
			case QUEEN:
			case KING:
				iScore[0] += 10;
				iScore[1] += 10;
				break;
			case ACE:
				iScore[0] +=1;
				iScore[1] +=11;
				break;
			
			}
		}
	return iScore;

	}
	public void Draw(Deck d)
	{
		Card c = d.draw();
		cards.add(c);
	}
	
	private void AddCard(Card c)
	{
		cards.add(c);
	}
	
}
