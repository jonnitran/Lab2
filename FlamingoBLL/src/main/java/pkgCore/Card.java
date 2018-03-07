package pkgCore;
import pkgEnum.*;
public class Card implements Comparable {

	private eRank eRank;
	private eSuit eSuit;
	
	
	public Card(pkgEnum.eRank rank, pkgEnum.eSuit suit) {
		super();
		this.eRank = eRank;
		this.eSuit = eSuit;
	}
	
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.geteRank().compareTo(this.geteRank());
}

	public eRank geteRank() {
		return eRank;
	}

	private void seteRank(eRank erank) {
		this.eRank = erank;
	}

	public eSuit geteSuit() {
		return eSuit;
	}

	private void seteSuit(eSuit esuit) {
		this.eSuit = esuit;
	}
	
}
